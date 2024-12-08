package aoc2024;

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
}
