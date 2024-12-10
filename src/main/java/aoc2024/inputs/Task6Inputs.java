package aoc2024.inputs;

public class Task6Inputs {

    public static String TASK1_SHORT = """
            ....#.....
            .........#
            ..........
            ..#.......
            .......#..
            ..........
            .#..^.....
            ........#.
            #.........
            ......#...
            """;

    public static String TASK2_VERY_SHORT = """
            .....
            .#...
            ....#
            .^...
            ...#.
            """;

    public static String TASK2_VERY_SHORT_2 = """
            #...#.
            ......
            ....#.
            #^..#.
            ...#..
            """;

    public static String TASK2_VERY_SHORT_3 = """
            #.....
            .....#
            ^...#.
            ......
            ......
            """;

    public static String TASK2_VERY_SHORT_4 = """
        ..#.....
        .......#
        ........
        .#......
        #...#...
        #.......
        ..^...#.
            """;

    public static String TASK2_VERY_SHORT_5 = """
            ##..
            ...#
            ....
            ^.#.
            """;

    public static String TASK2_VERY_SHORT_6 = """
        ...#
        #...
        .^#.
            """;

    public static String TASK2_VERY_SHORT_8 = """
            .#...
            ....#
            .....
            .^.#.
            #....
            ..#..
            """;

    public static String IS_LOOP_1 = """
            ....#.....
            ........#.
            ..........
            ...#......
            .......#..
            ....^.....
            ..........
            ..........
            ..........
            ..........
            """;

    public static String IS_LOOP_2 = """
            ....#..#..
            ....^...#.
            .......#..
            ...#......
            .......#..
            ..........
            ..........
            ..........
            ..........
            ..........
            """;

    public static String IS_LOOP_3 = """
            ....#..#..
            ...#^...#.
            .......#..
            ...#......
            .......#..
            ..........
            ..........
            ..........
            ..........
            ..........
            """;

    public static String IS_LOOP_4 = """
            .........#
            ..........
            .........^
            ..........
            ........#.
            .........#
            ..........
            ..........
            ..........
            ..........
            """;

    public static String IS_LOOP_5 = """
            ..........
            .....#....
            ....#^....
            .....#....
            ..........
            ..........
            ..........
            ..........
            ..........
            ..........
            """;

    public static String IS_LOOP_6 = """
            .......................
            .......................
            ..#....................
            ..................#....
            .......................
            ...........#...........
            .....................#.
            ....#..................
            ...#............#......
            .#..............#......
            ....^..........#.......
            ..........#............
            .................#.....
            ..#....................
            ....................#..
            .......................
            """;

    public static String IS_LOOP_7 = """
            .......................
            .......................
            .#.....................
            ..................#....
            .......................
            ...........#...........
            .....................#.
            ....#..................
            ...#............#......
            #...............#......
            ....^..........#.......
            ..........#............
            .................#.....
            ..#....................
            ....................#..
            .......................
            """;

    public static String TASK1_FULL = """
            ........#...#..................#.#............#....#....##.........#.............................................#................
            .#...............#...........................#..........#..........#....#........................................#............#...
            ............#...........................................##.................#.......#............................................#.
            ...#.......................##.........................................#..............................................#....#.......
            .......#....#......#...................................#............#............#.......#.......#.................#..............
            #......#........#..................................#..##........#...........#.....................#......#..................#.....
            ......................#........#.....#.....................#.......##........#............#.#....#..#.......#.....................
            #.........................#.................#.............................................................#.......................
            .....#....#.................................#........#..#.........................#............#...#.........#...#..............##
            ......................................................................................#...#......................#...#...#..#.....
            .................#........#.............................#........................#.....#..................#.......................
            ...#.........................#.#..........#.....#..............................#..#...#...#.........#.............................
            .#............#.................#.....#..............#................#...........................................#...............
            ...........#...#......#.........##................#...................................................#....#.#....................
            .................................#..................................................#..............................#...#..........
            .#...............#............#....................................#.....................#............#....................#.....#
            .#....#.....................#.....#.......................#......#......#...................................#.....#.........#...#.
            .............#...#...............................#...#...........#...............#....#....#..............................#.......
            ...#......................................................................#.........................................#.............
            ...#..................................#........#........#...................#.............#.......................................
            ......................................................................................................................#........#..
            ......................#.....................................#.....#.................#.........#..............#............#.......
            ..........................#...................#....................................................................#........#.....
            ...........#.....................................................#............#.....................#....................#........
            ..............................#.....#......................................#..........#...#........#........................#.....
            .......................................#..................#.........#..#....................................................#..#..
            ........................................................................#.................##..#...................................
            ................#.#.....................#.......#..#..................#.........#.................................................
            ........#......#......................#.........#..........................................#..........#....#..##....#.......#.....
            ......................................#..........#...........................#..................................#......#..........
            ..##...#..#......................#............................#...................#........#......................................
            .......#........#............#..................#....#...##.......................................................................
            ....#......................#......#.............#................................#...#........#.........#.....................#..#
            ......................#...#.........................#..................................###..............................#........#
            .....................................................................................#.....#...............#.......#..............
            ............#.................................#..................#..........................................#.................#...
            ..........#...................................#.............................#..........#................................#.........
            ............................#..........................................................................#....#.............#.......
            ...............#..#.........#.................................................................##........................#.......#.
            .............#..........................................................................#.........................................
            ........................................#...#...#....................#...........#...........#....................................
            ............................#................#..............#............................#.......#..#.............................
            ................#...#.........#.............#.........#.......#...........................................#..#.....#..............
            .......#......#.#.............................................#.....#...#...........#.............................................
            .#....#...............#.........................#....................#........#..................................................#
            ..........................................................#.................#.................................#...........##......
            ....#.....................................#..........................#........#.....#........................#....................
            ...##................................#........................................#..............#.....................#...#..#....#..
            ..............#.......#..................................#..................#.....................#....#.....................#....
            .......................#......................................##..........#......#..............#.............................#...
            ....#....................#............#.........................................................................................#.
            ..........#..#.......#.....................#................#.#.....#.....#...........................#...........................
            .......................#..#.#.............................................#......#..........#.....................................
            ...........#.........................................................................#..............#..............#..............
            ............................................................#.....................................................................
            ...................#....#..#..............#...........................................................#.......#.#.................
            ..............#...#.#....#......#...........................................................................................#....#
            ....................#.................................................................................#..#...#....................
            .......#...#...................#.............................................#..............###..........#........................
            ...................................#................#.........................................................................#...
            ..............#.......................#...................................#................................#......................
            ...........................##........................#...............................#.........#..................................
            ....................................................#..........##.......................................................#.........
            ........................#................................##.................##.#...........................#.....................#
            ..............................................................................................................#...................
            .............................#........#..........................#................................................................
            ..........#..........#...............................................#...#................#......................................#
            ................#...........#...............................................................................#................#....
            .....................#.............................................................................#..#................#.....#....
            #.................#....#.......................................#..........................#...###.......#..#.....#.#..#..........#
            ............................................................^.............................#.#............................##....#..
            .#............#.................#......#..................................#....................##.................................
            ......................................................................#.......#...............#..................#..........#.....
            .........................................#............................................#.....#.#.#..#..........................#...
            ....................#.........................................................#.......#...#..#.....#..............................
            ..........#......................................................##......#................#.....................#.................
            ..........#.............................#..........................#...........#..#...............................................
            .................................#......#.............##...............................................................#..........
            ........................................................................#.....#.....................##...##...........#...........
            ..#..#.................................#......................#.........#.................#.......................##..............
            .....................................#..........................................................#.................................
            ...................#...........#..........#............................#.........#................................................
            ................#.................................................................................................................
            ........................................#.....................##.......#........#................#....#................#..........
            .................#.............#........................#..................................#......................................
            ......#............................#.......................................................#.....#........#.....#..............#..
            ..........#..................................#.......................#............................................................
            ...#..................................................#...........#....#....#.......................#.........................#...
            ............................................#..#............................#..................#......#........#...........#..#...
            #........................#........................................................#...............................................
            .....#.#.#................................................##.#...................................#.....................#.#........
            ....#................#..............#.....................................................#........#................#.............
            ..........#........#...................................................#...........................#..............................
            ....................#..#.........................#....#.......#....##.............#...............................................
            .................#...........................#...........#................................#...........................#...........
            ......#...#....................................................................................................................#..
            ......#.......#......................................#.........#.................#.#..........#.................................#.
            .......#........................###.........................#...................#................#.................#..............
            .##.........#.........#..............................................#...........................................#..#.#.........#.
            ..........#..................#..........................................................#.....#..................#...............#
            ......................#..............#.....................##................#..#.....#..........................#.#..............
            ....#.#..#..............................#........#........................................................................#.......
            .........................#.....................#....#.....................#..........................................#............
            ..#..#........#........................#................................#..................................#.#..................#.
            ........#...#.....................##.........#.............................................................................#......
            ....#...........#............................#.............................#...........#........#..............#..#...............
            ......#...................#................#..................................................##.......#....................#.....
            .........#.##.....................................................................................................................
            ........................................#......................#................#....#......................#...........#.........
            .#......#.#......#................#....#...#..............#...........#........................................#..................
            #...#......................................##.................................................................................#...
            .................#.........#...............................#......#.................#.......................................#...#.
            ...#..#......#.........#...........#..............#...................................................................#.........#.
            ...........#.#........................................#..............#............................................................
            ...........................#.................................................................................#............#.......
            .............#......................................................#.................#..#..............#.........................
            ...........#.....................................................#...............................#................#....#..........
            ..........#....#........................#...........................................................................#.............
            .......................................................#..........................................#...................#...........
            ..............#...........................................#.............................#..................#......................
            .................#....................................................#.....................................#...............#.....
            .......................................#........................#.........#................#........#............##.....#.........
            ....#...#..............#........................#....................#........#...................................#...............
            ......##.#......................................................................#.............#...................................
            ....#.......................#..........#..#..............#..............#.#..........................#...............#....#.......
            .........................#......................#...........................#...............#......#.............#................
            .......#.........................#.......................................................................#........................
            .......................#........................................#...............##...........#...................#.....##...#.....
            .....#........................#.............#.........#.....#................#..............#..........................#..........
            .................#...................#....#...........#....#........................##.....#...#..................................
            """;

    public static String TASK2_FULL = """
........#...#..................#.#............#....#....##.........#.............................................#................
.#...............#...........................#..........#..........#....#........................................#............#...
............#...........................................##.................#.......#............................................#.
...#.......................##.........................................#..............................................#....#.......
.......#....#......#...................................#............#............#.......#.......#.................#..............
#......#........#..................................#..##........#...........#.....................#......#..................#.....
......................#........#.....#.....................#.......##........#............#.#....#..#.......#.....................
#.........................#.................#.............................................................#.......................
.....#....#.................................#........#..#.........................#............#...#.........#...#..............##
......................................................................................#...#......................#...#...#..#.....
.................#........#.............................#........................#.....#..................#.......................
...#.........................#.#..........#.....#..............................#..#...#...#.........#.............................
.#............#.................#.....#..............#................#...........................................#...............
...........#...#......#.........##................#...................................................#....#.#....................
.................................#..................................................#..............................#...#..........
.#...............#............#....................................#.....................#............#....................#.....#
.#....#.....................#.....#.......................#......#......#...................................#.....#.........#...#.
.............#...#...............................#...#...........#...............#....#....#..............................#.......
...#......................................................................#.........................................#.............
...#..................................#........#........#...................#.............#.......................................
......................................................................................................................#........#..
......................#.....................................#.....#.................#.........#..............#............#.......
..........................#...................#....................................................................#........#.....
...........#.....................................................#............#.....................#....................#........
..............................#.....#......................................#..........#...#........#........................#.....
.......................................#..................#.........#..#....................................................#..#..
........................................................................#.................##..#...................................
................#.#.....................#.......#..#..................#.........#.................................................
........#......#......................#.........#..........................................#..........#....#..##....#.......#.....
......................................#..........#...........................#..................................#......#..........
..##...#..#......................#............................#...................#........#......................................
.......#........#............#..................#....#...##.......................................................................
....#......................#......#.............#................................#...#........#.........#.....................#..#
......................#...#.........................#..................................###..............................#........#
.....................................................................................#.....#...............#.......#..............
............#.................................#..................#..........................................#.................#...
..........#...................................#.............................#..........#................................#.........
............................#..........................................................................#....#.............#.......
...............#..#.........#.................................................................##........................#.......#.
.............#..........................................................................#.........................................
........................................#...#...#....................#...........#...........#....................................
............................#................#..............#............................#.......#..#.............................
................#...#.........#.............#.........#.......#...........................................#..#.....#..............
.......#......#.#.............................................#.....#...#...........#.............................................
.#....#...............#.........................#....................#........#..................................................#
..........................................................#.................#.................................#...........##......
....#.....................................#..........................#........#.....#........................#....................
...##................................#........................................#..............#.....................#...#..#....#..
..............#.......#..................................#..................#.....................#....#.....................#....
.......................#......................................##..........#......#..............#.............................#...
....#....................#............#.........................................................................................#.
..........#..#.......#.....................#................#.#.....#.....#...........................#...........................
.......................#..#.#.............................................#......#..........#.....................................
...........#.........................................................................#..............#..............#..............
............................................................#.....................................................................
...................#....#..#..............#...........................................................#.......#.#.................
..............#...#.#....#......#...........................................................................................#....#
....................#.................................................................................#..#...#....................
.......#...#...................#.............................................#..............###..........#........................
...................................#................#.........................................................................#...
..............#.......................#...................................#................................#......................
...........................##........................#...............................#.........#..................................
....................................................#..........##.......................................................#.........
........................#................................##.................##.#...........................#.....................#
..............................................................................................................#...................
.............................#........#..........................#................................................................
..........#..........#...............................................#...#................#......................................#
................#...........#...............................................................................#................#....
.....................#.............................................................................#..#................#.....#....
#.................#....#.......................................#..........................#...###.......#..#.....#.#..#..........#
............................................................^.............................#.#............................##....#..
.#............#.................#......#..................................#....................##.................................
......................................................................#.......#...............#..................#..........#.....
.........................................#............................................#.....#.#.#..#..........................#...
....................#.........................................................#.......#...#..#.....#..............................
..........#......................................................##......#................#.....................#.................
..........#.............................#..........................#...........#..#...............................................
.................................#......#.............##...............................................................#..........
........................................................................#.....#.....................##...##...........#...........
..#..#.................................#......................#.........#.................#.......................##..............
.....................................#..........................................................#.................................
...................#...........#..........#............................#.........#................................................
................#.................................................................................................................
........................................#.....................##.......#........#................#....#................#..........
.................#.............#........................#..................................#......................................
......#............................#.......................................................#.....#........#.....#..............#..
..........#..................................#.......................#............................................................
...#..................................................#...........#....#....#.......................#.........................#...
............................................#..#............................#..................#......#........#...........#..#...
#........................#........................................................#...............................................
.....#.#.#................................................##.#...................................#.....................#.#........
....#................#..............#.....................................................#........#................#.............
..........#........#...................................................#...........................#..............................
....................#..#.........................#....#.......#....##.............#...............................................
.................#...........................#...........#................................#...........................#...........
......#...#....................................................................................................................#..
......#.......#......................................#.........#.................#.#..........#.................................#.
.......#........................###.........................#...................#................#.................#..............
.##.........#.........#..............................................#...........................................#..#.#.........#.
..........#..................#..........................................................#.....#..................#...............#
......................#..............#.....................##................#..#.....#..........................#.#..............
....#.#..#..............................#........#........................................................................#.......
.........................#.....................#....#.....................#..........................................#............
..#..#........#........................#................................#..................................#.#..................#.
........#...#.....................##.........#.............................................................................#......
....#...........#............................#.............................#...........#........#..............#..#...............
......#...................#................#..................................................##.......#....................#.....
.........#.##.....................................................................................................................
........................................#......................#................#....#......................#...........#.........
.#......#.#......#................#....#...#..............#...........#........................................#..................
#...#......................................##.................................................................................#...
.................#.........#...............................#......#.................#.......................................#...#.
...#..#......#.........#...........#..............#...................................................................#.........#.
...........#.#........................................#..............#............................................................
...........................#.................................................................................#............#.......
.............#......................................................#.................#..#..............#.........................
...........#.....................................................#...............................#................#....#..........
..........#....#........................#...........................................................................#.............
.......................................................#..........................................#...................#...........
..............#...........................................#.............................#..................#......................
.................#....................................................#.....................................#...............#.....
.......................................#........................#.........#................#........#............##.....#.........
....#...#..............#........................#....................#........#...................................#...............
......##.#......................................................................#.............#...................................
....#.......................#..........#..#..............#..............#.#..........................#...............#....#.......
.........................#......................#...........................#...............#......#.............#................
.......#.........................#.......................................................................#........................
.......................#........................................#...............##...........#...................#.....##...#.....
.....#........................#.............#.........#.....#................#..............#..........................#..........
.................#...................#....#...........#....#........................##.....#...#..................................
            """;
}