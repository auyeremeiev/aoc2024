package aoc2024.common;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.lang3.time.StopWatch;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StopWatchGauge {
    private static final Logger log = LogManager.getLogger(StopWatchGauge.class);

    public static <T> T run(Supplier<T> supplier) {
        return run(supplier, 0);
    }

    public static <T> T runReliably(Supplier<T> supplier) {
        return run(supplier, 100);
    }

    public static <T> T run(Supplier<T> supplier, int executionRepeats) {
        if (executionRepeats == 0) {
            throw new IllegalArgumentException("executionRepeats cannot be 0");
        }

        StopWatch stopWatch = new StopWatch();
        List<T> results = new ArrayList<>();

        stopWatch.start();
        for (int i = 0; i < executionRepeats; i++) {
            results.add(supplier.get());
        }
        stopWatch.stop();
        log.log(Level.INFO, "Time elapsed: " + stopWatch.getNanoTime() / 1000000 / executionRepeats + "ms");

        if (results.isEmpty()) {
            throw new IllegalStateException("Executions results list is empty");
        }
        validateAllResultsEqual(results);

        return results.get(0);
    }

    private static <T> void validateAllResultsEqual(List<T> results) {
        T element = results.get(0);
        results.stream()
                .filter(it -> !it.equals(element))
                .findAny()
                .ifPresent(it -> {
                    throw new IllegalStateException("Some of the results differ from the another " +
                            "Results: " + ListUtils.printList(results));
                });
    }
}
