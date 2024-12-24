package aoc2024.inputs;

public class Day15Task1Input {

    public static final String SHORT = """
            ########
            #..O.O.#
            ##@.O..#
            #...O..#
            #.#.O..#
            #...O..#
            #......#
            ########
            
            <^^>>>vv<v>>v<<
            """;

    public static final String SHORT_2 = """
            ##########
            #..O..O.O#
            #......O.#
            #.OO..O.O#
            #..O@..O.#
            #O#..O...#
            #O..O..O.#
            #.OO.O.OO#
            #....O...#
            ##########
            
            <vv>^<v^>v>^vv^v>v<>v^v<v<^vv<<<^><<><>>v<vvv<>^v^>^<<<><<v<<<v^vv^v>^
            vvv<<^>^v^^><<>>><>^<<><^vv^^<>vvv<>><^^v>^>vv<>v<<<<v<^v>^<^^>>>^<v<v
            ><>vv>v^v^<>><>>>><^^>vv>v<^^^>>v^v^<^^>v^^>v^<^v>v<>>v^v^<v>v^^<^^vv<
            <<v<^>>^^^^>>>v^<>vvv^><v<<<>^^^vv^<vvv>^>v<^^^^v<>^>vvvv><>>v^<<^^^^^
            ^><^><>>><>^^<<^^v>>><^<v>^<vv>>v>>>^v><>^v><<<<v>>v<v<v>vvv>^<><<>^><
            ^>><>^v<><^vvv<^^<><v<<<<<><^v<<<><<<^^<v<^^^><^>>^<v^><<<^>>^v<v^v<v^
            >^>>^v>vv>^<<^v<>><<><<v<<v><>v<^vv<<<>^^v^>^^>>><<^v>>v^v><^^>>^<>vv^
            <><^^>^^^<><vvvvv^v<v<<>^v<v>v<<^><<><<><<<^^<<<^<<>><<><^^^>^^<>^>v<>
            ^^>vv<^v^v<vv>^<><v<^v>^^^>>>^^vvv^>vvv<>>>^<^>>>>>^<<^v>^vvv<>^<><<v>
            v^^>>><<^^<>>^v^<v^vv<>v^<<>^<^v^v><^<<<><<^<v><v<>vv>>v><v^<vv<>v^<<^
            """;

    public static final String FULL = """
            ##################################################
            #...##...OOO.#.O.OOO......O###...O.#..O.......O..#
            #....O...O.....O..O#O#O.O....O...OO#OOOO....OOO..#
            #..O.O..O.#..#...O...O.O....#....O..OO.#O#..O....#
            #..........OO....O..#OO...O.O.O....#..O.......#.##
            #OO.......O.....OO.....O.....O.O.#...O..O..O#.#..#
            #....#..O.#.....OOO.O......O....OO.O#OO.O...O.#.O#
            #.O#.OO....O#...OO...O.O..........O.........OO..O#
            #OO.O#.O...O.O..O.....O#O.O..O...OOO...O....#OOOO#
            #..OO.O........O..#....OOOOO..OO...O#..OO##....OO#
            #....O.O...#.O....OO...#..#...O...O...O.#..O.O...#
            ##.....OO#O..O.....O##.OOO....OO..OOOO.O........O#
            #.#.#..O...#.OOO.O.......O.OO.O...O#....OO....#OO#
            #..##.O.#..#..O..O...OOO...O..O.OOOO...O.OO.#...O#
            #....O..O#.O.OO.O.........O.O.O.OO#.O.#O#..OO#.O.#
            #.....O.............#...O..O..O#.O.OO..O.OO..O...#
            #.#..O..#O...O....#..O.#.....O.....O.........O...#
            #..O..O..O#O.....O....#.O...#OO....O.....#.......#
            #O..O#......OO...OO.O..O#OOOO........O.OOO..O..OO#
            #OO...O.#...O#O..#.O.#.#....O.OO....OO.O..O.O..O.#
            #.#...#.O..O..O.......#.........#.O.O.....O..O...#
            #O.O..O...O...O..O.O.O.#..#O..OOO....O....#..#...#
            #...OO#O......O.O..OOOO#.O#........OO..#O.#OO...O#
            #O#....OO...O#..OO.#.OO....O...OO....#..O...O.O..#
            ##...#........#..O....O#@O#O........O.OO..O#.O.O.#
            #OO.#....OO.O...OO...OO..O....O.O.O...O#...O.OO..#
            #.OO#..#..#O.O#..OO.#O.O#.OO..OO.#..O......#.....#
            #.#..O.O..#O..O....O....#...OO......O......O#..O.#
            #O...#.O#....OO....O...O.#.......#O....O.O#.O....#
            #....#.O...O...O........OO.#.O..O......#..#..#.O.#
            #..OO....O..O.#........O..#......O..O....#OO...#.#
            #..OO.OO#...#..#.....#..O#.#O..O.O...O.O..O.O....#
            #O.OO....O..OO.#..OOO..OO##....#.O...OOO...#....O#
            #.OOO#..#........O...O.O.#.......OO..O.O......O.O#
            #.......OO..O.O........O...OO.....O.....#.O.OOO#.#
            #OO.......OOOO.....O....O.....#.#...OO........O.O#
            #..O.OOOO...O..O.O#.OO.OO.#...OO#.OO......O..O.O.#
            #.O.O.#.O#..O.O.O...#O...O...O...O.O.O...O.#O#O..#
            #OO#........O........OO..O#O.......O..#...O......#
            #.#.#..OO.OO..O....#OO....O.OO...O#.#....#.......#
            ##.#.O#O..OO.O......O..O#.......#OO#.......O.OO..#
            #.....O..O...O...#OOO.O.O...O...O..O..#...O...#.O#
            #O.##O....#.O...O.OO.......O.....O..O.O..O....O..#
            #.O...O.O..#O.#.....O..OO.....#O....O.O..O..O.O.O#
            #....#O..OO.OO#.OO...O...#.OO#...OO....O.O.......#
            #.O..O....#OOO..O......##..#O.O.......O...#O..O..#
            ##O..O...O.O.......O#.......#.O#.O.O.O#..O...O.O.#
            #O.#...O.O....#.#.....O.....OO.#.O.#...#.....OO..#
            #.O.OO.O........#...#.......OO#....#..O#.O.......#
            ##################################################
            
            ^^vv><<><><^v^v^v<^vvv><v>v>v>^v<<v>^^^><v><v^<v^v^^^<>>>>>><vv<^>v>>>^>^<^v^^^>^<^^v<<v<>>^<>>>v^<>v>>v^<vvvv<v<>>^>v>^<v^^>^<^>^<vv><v<<vv^>^>><<^^>^vv>v^^<^>v^><>>^<<^v<^<<vvv<^v<^>^>^>v>^<>v>>vvv<<v<^>>v>^v<^>>^<^vv><v<v><<>>v<^>^^^<><vvv^<>^<^^v>^><^vv<<>^^^<>v^>v^>v<^>^v<v^v><>><<^^^^><^<><>^vvvv>v>v<vv>v^v^>>vv^^v><>^^>>>>v^v>v>>v>v<<<>vvv>^v<^v^>^>v<vvv^^><^><^>>>v><v>><vv^<v^><v>^<^^^>^<v>^>vv<^>><><v^<>>>^>^^vv^<v<<<vv^>v>^><>^>^<>^>^><<^<<<>v><v>v<<<v<v^^^^<>>>^vv<<<<v<^v^>>>^^v>vv^^<<v>>^>^v>^^<<^><v<<vv^^>v>vv^v<>>^>>^<>>>^>v^^<<^v<>^<>><<<^v><<>>>><^^>>^>>><^vvv<v><<>v<v^v<^^v^^<>>>v^>^^^>v<vv<>vv><<>vv^<^v^v<^vvv>^v>>^^^<>><vv>^^>^v<>v>v<>><vvv><v^<^>^<<v>v<<v><v<<>>>v>^><<><<>^v<<v<>^>^^><^<^><>>v>^>v^v>vv^^<<vv<^>^<v>><>vvv^v>><>v<<>^<>vv<^v<v^<v>^v^<>^>>>vv>>^<><vv^<<><v>v<^vv<^>>v<v>^^^><^vvvv>^vv<vv^^<v><v<>^^<<v<^><><^^v>>^<^><v>^v>v^><<vv^>^<^^^>>>^^>>v^>v^^><><vv<^>^<>^v^<vvv<>v<>v<<^>v><v>^<>^^v^^v^<>v^vv^v^>^v><v>>v>^>^v><v<^>><<>>v^>>^<vvv^^<<<^^<v^>vv<<v^<<>^
            ^>>v^<>v>>>v>v<<^<><v<v>>>v^<<>><vvv<><<v>>v^><^vvv<v<vv>^^^<^><<v><^<>>>^>>vv^^<^v<<<<>v>vv><v<v^<^^^<^v^vvv^<><>>^>^>>vv>vv<^^vv<v<v>><<vvv><^<<^<>><vvv^^<<><^v>^^^><><>>v>><^^v>^>v<<^>v>v>v<>v<^<^>vv>vv^vv<>v>^v^v<^^^<^^^^<vv^vvv^vv^v><vv<v>^v<<v<<<<<vv<^^><^v><<>v<^^^^>^<<v>vv<^<<>>v>v<><>^v>>v>><vv>>^>><>^<vv^vv^^<^>>>v><<^<>^^^>^<v^>v^><<v>^^v>>^>^<vv^^<>>>^><<>^^<^<v^v^<<^<^vv><v<>v>><<<<^^vv^^>v^v^v^>^<vvv<^<v^>^>>v<v^>v<>^v<^vv>^<v^^<^>>v<v<>v<v<<>^v<>>^>v<<v^><<v><<><v>v^<v>><v<<v^v>^^^><<^^^>v<v^><>^>^>^<<>v>>vv<<<^<>><<^<v>^v><vv><^<v<v^v<>v<vv>v>vvv>^<><>vv<<>vv><^>>><<><<v^v><>v>^v><<<v<^v<v<vv<^^vv^^vvv>^<><vv^v>>>^>>^v>^v>v<^>v^^><^><v>v^<v^^vv<^v>^>><^><v^vvv>^<^^v^v>>^v>>^^<^<>^<>>v<>>^>^^>^>v<v<<><^<^vv>^>vvvv>^>v^<<vv>^v^><>>v^v<<^<v^<^v><<^<<<>^<<>v^<^v<>>vv^vvvv^^>v<><^^>v<vv<<>v^v<<<<v>vv>v^v>>^<<<v>>^v>^<^^v>^^>v<^v<><>>><v^<<vv>^><<<^^>><^^<>>>^<<^<<^^<^^>^>vv>>v>>>v<><v^<>^><<<^^^<>^<<<<<^<v<v<^>vv<vv><^v><<^v^v<vv<<^v^<^<v>><<>^<<<>v^<^>v>v^vv<<>v<><<>^^^<<^v
            ^>^<v^<<v>v>^v<<>^^^v<v<^>>^>^^v^<<^v>^^v<<vv<>v>^>^v^<v^>v^><v<<>^<^^v<v^>v>v><<v>v<^v>>vv^>^^<<v<vvvvvv>^^v^>v<>^^v^<v>^>>^vv^v<><>><v>><vv^><<vv><v^^v<v<^^v<v^v>vvvv^<>^>v^>v^^>vv^><<vv^>^^v<<^^<><^><<v<v>^>v^<<v>><^v^^^^>v>v<v^v>>v^<>v^^^^>><>^^v^<v^^<<<^>v^<^vv<>^>^^<^>^>v<^><<^^<^^<<^>v^^v<<><^<<<>v^vv<v>>><<<v^v>^<<<^><<>><vv^vvv<<>v<<<<^<^v>v>vv>v<vv<><v<^>^v^vvv>v>^>^>>>>vv>><v^v^^>>v>v<^<^<>><v^vv>^<v^>v<v<<>v><^^^<><<>>v><v<v^^><>v^>>^>><vv^>>v^^<>v^^^>^^v^vv^v^<>vvv><><><<>><>^>>v<>^^v^v^vvv<v<v<^v^vv^vv<^>^v>>^>>^^>v<^^>>^>^^><><^^>^<^<><v>v>><<vv^<>^<>>>>v<><^^v>v>^^v>^<v<>v<^>v>^>vv<<^><^v^vv<^^<v<v^v^v><<^^v<^>^<>><v^><<^v>><><v>^<<v<^>^^^^^<^<><^^^v>v><>vvv>>^<v><^<^><<^^^^v>^<<>v^^^<<<<<^v>^v^<^<v>v>v^v^^<^^<><v^<v<>^^vv>v<vv^^<^><<>^^^>vv^^v<<vv^<^<^<<<^^^v><^^^<>vv>v^v>v<<>><v^>^>>><><<^vv>^^<^<v^<vvv^<v><<>^^>^^>>v<^v>>v^>>^vv^<>v<<v^v<<^v^v>>^><^^<v^^v<><<^^>^<^>v>vv>>>>v>>>v^^^>vv>>>v<><^>>>^<v^<<v<>v<v<<vvvvvvvvv^^<>>^^<<<<vv<><^^vv<vv<^^<<>v^v^>v<<v<^>>^^^<<^v>
            <>>^<<vv>><v<vv<>>^><>>>v^^^>v>v>^v>vvvv><^v>^<^>^^vvv>vv><<v^>>>><^v<^v^>v>vvv^v<<v^<^v>><<^<<^<<^^v>vv^^><>v<^><<<>>vv>vvv<^v<>vv<v>>^<<>^>v^v<v<<>vvv^^v>^v<^<>^<>^><>v<><<^>^<v<^^^<>^<v><vvv>^<^v<vv^^>^^^>>>v<^v<<v^v<v>v^>>v>v<vv<>vv><>v><^^^^v>>v>v<^v>^v^>^vvvvv^<v^v^vv>v^<<^^><v<^v^v>>>>^v<<^^vvv<v>><v^>^^v^>>^v<v<<<^v^<^^<vv^>v<<>>v<v<<><v><v<^<>v>v>^<><^^v^^>vv^<vv^<>^^>v^><<>><<<^<v^v<>>^^^<^^>^^<v^v<<>v^^><^<>v>vv^><>^>^^^^<>>v^^v>><<>^<^v><v^v>>>vv<v><vvv>^<<<<v>v^>v>^v<^>v<><>>^v^^><^vv>^^<^^><^>vv><v^>>>^>^>v><^><vv<<<^<v<>>v><>^><v<><^^v<>vvv<<>v<^>>v<>>^^<^><<^><v^<<^^<>v^<^^^>^^<>v^>^v>>v^^^>>vv<vv^^^v>^><<>^>>><<<v^<^v<^v^v^>v^^v>^><>^^<<v<><>^vvvv>v<^<^>^vv>>^v^><vvvv^^<^>>vv<v<^>v<^>^>>^^<vv^<^<^<v<><^<<<^<v<<^^<<v><>^v<^^<>>vv<^^>^<>>v><>>><>^^v^>v><>>v>^vv^<^v^><>>v^><>^><^<<<v^^>>>^><vv<>>^<^>>>vv<>vv>v<>^><<^<^^<v><^^^^^<^>>>>><v<^>><><^^>^^<><v<<<^^<v^>^>^^>^>>><^>^><>v<<>><^<><>><v>>^v>^<<vvv^<>^vv>v<>^><v^><^^>>>^<<^v^v>v^<>v>>><^^>vv^^^>>^^>^^<<>><^><><v^v><^>
            ^v<<^><><^>>>v<><<<<v<v>>v<>v<vv><^vvv^<^v>vv<v<^^vv^vvv><<^v<^^vv^v^><<><^><^>^v<>^v<^^v><><>v^<<<>v^>^>><vv^>^^>><>^>v^><>^<>^><<^^>>>v<><v><vvv<^>v>^<<vv>^^v><vv<<><>vv>^v^vv><><^^v^<v>vvv>>^<><^v>^>v>>vv>v^>>^v^^^<v>^^v<<>>v<><>v>^v<vv<v^>vv<<><<^v<>>^<<<^v^^<v<><^<^>^<vv<<>v<>^^v^><<><^<vv<^>v^>^>^<<<<<vv^v><vvv<^^<<<^^^^>^v><>>^^>>^v<<v><>><^<<>v<<^v<v^>^v<><^^>v^^^v^^<^<^^><vv^<>>v>v^<v^<>><<^^<^^>>^^^^^vv^<>^><<<><<><>><v>^<>v^^<><^<v<vv<vv<^<v^><vvvv<^<vv^^>^>vv>^<v^^^v<v>><<v<><<>v>^>v>>>><v>v^<>v^v^v<v<<^^v<><^<<<^^<^>>^v^>^v^>v^<v^v^v>v^>><v>vv><^>><>^>>>>>v^v<^<v<v><>><>^>v^^^<>>^v^<^v>v<^<<<<^v^v>v><v<<v^<><vvv<>v^>^>^>v^>><v<^v<v><v^^v>>^>v>vv<^v^<>^^^<^<^^vv<^>^>v^><^<<v<^v^v<^>><^>><>>>^v^>v<>>>>><><<^><<<^>^<v>^>><>v>v^^>><<><^v><^>v^^<<v^<>^>>^^v<>vv<^<^^<<>>>><v^><^>v^<>^<v><>^<>><<<<>>^vv<<v>>>vv^vv<><<^<vv^^v<<^<^<>^>vv^^><^><<v<vv<<><v<<^>vv^>v^>v><>vv>^v>>>v>v<>><^^<^v<><>>>^vv>^>v^vv^v>^v>v><><<^^^><>><>>>^>vv^<v<<<^^<>vv>^><>><v^v^^^^v^vv>><^<<vv<<<^<<<v><>v>>
            ^^v^>^v^>>>><^<^<<<<^^v<<>^v>><<v>^v>^>><<<v<<<v^<<^>><vv^>>^>vv^<>v>>^^>><><^^<>^vv><>v^><v<vv>><^>v^^^^^v<<<v^^vv>><<^v<^<^^vv<^>>v>><^v><>v^^^<v^^<><^>^v^>vvvv><<>v><^<v^^>^<<><>v<v<<v^^vv<v<v^><<^>>^<<>^<^v>v^v^v^^<>^<>><^<^>>^^<>><vv<v^v><^<^^vvv>^v<<^v<v^^><>><^<vv<v^>^v><^v^vv<^v>^<>><^^<><v>^>^^<><^v>^^^^^>><v>^^<v^<<<><<^^<>><<>^>vv<v<>>>^v<v<v<>v<^^v^>v>v>^><v^<^v>>v^v<>^<^<>><^^>>v^><v<>>^>^^^^>>><<^<^^vv^^<<vv^>^v>^vv<^v><<vv^^^><^<<v^^^^><v>>v<v>^<^<<^v^<<^vvv^v><<^<>^<^^^v<<v^>vv<<<^<<vv>^^>^>>v>^v>>v>v>^^<v>^<^>v^vv><^^<^>^v^vv>v<v>^^v^vvv><v^^>v<^^^<v^^>v<v>v><vvv<><<^><<^<>^^^v>^<v<^>><vv<<vv><>^v>>vv<vv<<<><><^v^v<>v^>vv><>v<<>v<v>^>>v<vvv>^>^^^<><v>^>^^>^v<v^^v>vvv<v^>>><v^<<^^vv^^^<>^v<^^><^><^^<^>v^^>><><<<^><^^v<<^>^<^>^vvv>>^v^<v<^v^<vv>>>>v><>>^<^><><>^^v<^v^<>^v^^v^v<v>^>^>>><>>><v><^>>>v>>>>>^v^^<^>vv^^<<^<><v><^v><v>><v<^^^<v>^>>><v^>^v^^v<>^v>vv^<^>v<v<v^v>^<><^>v><>><v<^><<^v^>^v<>vv>^vv<<v<^>^<>><<v>v^^vv<v>vv>vvvv<v<v^<><<^>v<v<<^^vvv<v^>^>^v^>^<>v<><><>>
            ^>>>><<<vv^^^>^>^<<>>>^><<v^<>>v>^><>><vv<^>v<>^^^<>v^^v><^vv<^v^<^v>>^>^v<v^v^^v>^v^<<v<<vv^^^vvv^<v^>>><vv^vvv>^v<^>><^^^^vv<>vv^v>vv<v<<vv<^<<vv<<>>vvv<<>v<>vv<vv^^<^^v<<<>>v><^vv^<>v>^<^v>^<<<v<vv>^v^>>vvvv^^<>v<v<<v^<v<<><^v<^^<<<>>v>>>v>v>>vv<>vv<v^^^v>>>^v<^^>v<^v><<^<<<<^>^v<^^v>v^^<^^^<vv><>^^<vv<^vv^<^^>><>>><><v^^>>^^<^<^v<^>v^v><^vvv^<v>v<>^<^vv<><v^>>^vv>^v>^^^<<>>^><^>^^<^>v^v>>v^v>>^^<>>>>>>>vvv<^><^>^v^>>v<^^v>^v<^<>v<^^v^^v>>^^v^<v>v><v^>^<v<<v^vvv><v^>>^>v^>vv^>>^^<<>v>v^<^v>>>^<>^^^><><v^>^^^v^>v>^><<<^^^^^<>>^<<vv^>>><v>^^<^><vv><<^v>v<>vvv><>^<^^>><v><v<^v><^v^<^>^><^v<vv<^<>vvvv>>>vvv^<><><>^v>v<^v>vv^^v>v>>vvv^^v^<vvvvv^^<<<<v^<><<><^<>^>^>>>v<>v^>><v>v>v<v^^<vv<<v<>^<^vv<^^<<<^v^v><<v>^<>v>>v^v^^vv<^>^>^vv^>^<vvv>v>>>v<^>>v><<^>v^vv<<>>^^v><vv<^<<v^^^^v><<>vv><v^<><vvv>vv<vv^><^^^<v<v<^<<v>>><<v^v>>v^<vvv<v<>^<v^^<<<><<v>><>^>^<^<v><<<>v^^vvv^v^v<v<<<>>^v^>v<<v<^v^v>v<>><<>^^^<vv><v<<^v<^<^v>v>><>vv>^v><<^>v<v>>v>v^^<>^^<v>^^vv>v<>v>^v^vv>v^<^><^^^^^<>^<v><>^<>>
            vv>^<vvv^vv^^<vv^<<>>^<<^^<<v><>^^^v^<^<^^v<><v>^<^><<<^v><v><^>^v<v>>^vv^vvv<>^v<<>>^>v^v><>^^v^>>>^><><<><v>^>>v<<v<v^^^>v><<<<<v<<<^><vv^vv>><<^^>v<<^>^^><v^v<^<^<^^^^<^^<v^^<^v<^>>^v<vv<^><>v^<v>vvv^v^^v^^vv><>>>>^^>v<v>^<<v^^><>>v<^<<<^v^>><v>>^v>^<>>>^^^>>v^>v^<^<v>^v^<>>><v^<>>^v<<vv^>v<<v<>^<^^<v><vv^vv<>>^v<<^^>><v>v<<>>>^><^v^v>><v^<^>vv<<^v<<v^^vv><>>>v^v<<^<>v<<vv^<^^<<>v>>v<v<^>>v^^<^>v^^<><<>>>^v<>vv^<>>>^<^^^^>^v>vv<<>^<<v>^<><v^<>^<<<^>vv<<v^^<^^^><vv<>^<^>>><>><vv^^^v^vvv<v^>v<v<v^>><^vv^v>^^><vv>^^^^vv<<^>>^>^^v>vv^><>>^><>>><^>><^>v^^<><>vv^<><<>^<>^v<><^><^v^>vv><<^v>^v<>>^^v^<^^^<^v><>^^^^^>>^^<>>>vvvvv>v^v<<<>>>vv^<^<vv^><>><^^<^<^^<<^>>^^^<>>><>^^vv^<^v>vv<<<v<v<vv<<>>vv>v^^vv^>^<^vv^v^v>v><vvv>>v^vv>>^vv><^v<<^>>^^^<<<<^<^v<><<v^v>>^v^v<v^>>^^v<^^^<^^<<<<^<>>^<>^>v>^v><^<^>^><^v<^^^^^vv<>^^<v>><v<<^vvv>v^>^<^><^vv<<<><>^>><v<v<<<v<<<>^^<>^><>v><><<>v><<>vv^><><>v<vvv>vv^<>^v^<^vv>><<^<<^v<<<>vv^v<v<vv^^^>>>^>>^>^v^^<v<<<>v>>v^^vv<^>>>vv^>^^<v>>v<^><v^^<>v^^<^v^>
            ^<>v>vvvv>^><v<^<<v><<<v<<^^<<>^v<>v>>v>vv^>v<v<>^><>v<<v<<<>vvv^><^>^><><^v<>>>v<<><vv^vv<<^<^v<^>^>><<^^^<>vv^^^>^<v<^<<<>>><>>>v<>>v>>^^v^<>^<>v^>vv^>><<vv>^v^v><^>>v^vv<^vv<>v<vv>^<>>>^>>>><v>>^^<<>>>v<<>v<^<^^>^<<^><>v<<^v^^^v<><^v><<>^^v^^^^>v><^^v><^<^v^>>v<^>^v<<v^^^>>^v^<><>^>v>v>>>vv^>>vv><>>^>v<^^>^<>^v^v>>^vvv>><<^<>^><<>^^<^v^^^v>v^v<v^^^<v^v^^^vv>>vv<><v^v>^<><<>>>>v>v^<v<<<v^<<<<vv>^^vv><^^>^^^<<<v^^<^<^v^<^<>><>^v^v><<v<<><<>v<>^^>^^>vv<v^v<^vv>^>>^^v<<<>^v^>v>>^<<v^><><<<<v<>^<^<<v^^>>^>>v<>v<^<<>>><v^^^<v^>v<^v^>^^><vvv>v^^^>^^vv>><<v^^><<<^v<^^v^<v>v^^<<>v>vv<>><>v>v<^v^<<<^>>^^^<^v^v^><^>^<<^v^v^v<>v>^^><v<<><><vvv^v>^<v><><<v<<<^<><>>><>>v><v^^^v>^v<^v<<<^^>>v>^<<^>^^v>>^^<vvv<<<<v>^^><vvvv<>^v^vv<<^<<<<>^^>v<v<^v><>v>v<<>^<<v^v<v<>v>>^<>v><<>vvvv^<>><>v><>v^v<>vv>v>v^v>>^<^v>^>v>><v>^<vv^vv^v^^><>>>^>><>^^><<>v><v^<<<^v<<<v<v^<v>^<>^>>><<v>vv<vv<<^v>v^v<vv^v<vvvv^v>>><<<>^^^<^>>^<vv>^^^>v<vvv>vv^v<<><v<^^<<><^<<^vvv^<^v^v^^<v<>^v^^vv><vvvv><v<<v<v<^^<^v><>>v<<<>v>
            <<^^<^>^v<v<^><v^<><vv^vv^<v<>v><vv^<^v^^>^>>^vvvv>v>^v^>^><^^^^v><<<v>^vv<^<^^^v<^^<><>v<v^<<^^<>><>vv>^v><>v^>^<v<<v<<>>^^^>><<>^<v>>>v>^>>^v>>vvv^^>><^v^v^v<v<<><^<<<vv^<v<<<^v<v<<v><>^v<vvv>^><>>>>>^vv>v><>^<>^^>>>v><>>><<<>>^>><v^v<<^vv^>^>><<^<><vvvv<^<vvv^<>>^<^>>>>^v<<^^^^><><><<<<^^<^v><><<<><^<>>><>>^<<^<^>^<^^<^>^>^><<^<vv^>v^vv<^<vv^^vv<<>>v^<^<vv<><vv^v<>><^>>v<vv^^<^>v><^vv^^<^<<v>^<<v>v>v<v>>v<^>^>^^><<v<>^vvv^><<<>^><^vv><^<<>^><<^^vv<v<^^v^^^^>^v<^v<<^^^<^^v<>><><^^><v<<>^^v>v^v<>vv<v^>>^<v><>>vv><v^v>>vv>v>v<v><><>>>>v><vv>>>^><><^v<>v>>>^^^>^v^v>^<<>^>><vv<v^v>^<^<^^<vv>v^^v>^><>>v^>v>>^v<>v>v^^<<><^><vv<>>v<<^>>^v^>>>><^<<<<^<v><v>v<<v^>^v>>v<>v<><<vv>v^><<^<^v<^<^>^>^vv<<vvv<v><vv>vv>^v><>^<<vvv><^^<<v<>^v<<^<<^v^>v^vvv^v>>>v<^v>^v<v>v><<^<vvv^v<^<vv^v^^>^<v<^>>v^<<<^<^v>^v^v^<v>>^^<^v^^v^<<^<><^>^^<>^>vv^v<<^v<^vv>v><>^^^>>v^>^<^v^<^v<><v^^>>>^v><>>^v^>^><>>><v<<v<^^^><vv^>vvv><^>vv>^^^<^^<^v<v^vv^<^^<>vv^v<<>vv<<>>^^v><<v>^v<<<><v^^>^<v>><^v<vvv<v>^^^>><<<<^<^>v<
            <><<<>^^>^^v^^>^^^vv>^>>^>v^^^v<^<^>v<<><v>^>^v>^<^<<^vv<<>^><<vv^v<v>^>^^<<^^<^<^><><^vvv><<>>>>>^>><>vvvv>^v^<^<^^>v^^v^><>v<v^>><>>^<>>^<v<<<v^><vv><v<v<<v^^>^^v<v<v^<<v^vv<<<v^>^v<>>v<v>^><^<>>>vv>vv>^v^^<<<vv<^>^^<^v>>>>v^><^><<^><>>><^^^v^^>>>>^>>v^^>><vvv>v^<<>>^>v<<<v^^<^v><v^vv>v>^v^><<><^v^^^<>^<>^^^v^>><<<^^^>v<<^^vv<v^<>>v<>^<^>><<>>^<v<v>><^>^>v<^v>><<^v<v><>v><^^vv<>v<v<>v^v^<<v<<><>v<><<<<v<>v^v<>>vvvv<v>v^^><^<<^^<vv<<v^<>^<<^<v<^>^v^v^<v^<^<><^v^<^^><>><^><^<^<<><vv<^><^<<v<^^v<v^vv<<v^^v>>v>v<<<^>><^^<<>^v^v<v>>^>v>v^>^v^^v>>>^>v>v^<^v>>^^>><v<v><<>^^>v^^^><v^<>>v>>>^vv^v>><><>><>^vvv^^><>vv><<v<v^vv^<v<v<^>>>v^>>>^>v>vv^^^vv<<^<>><v<^^^^<^v>>v^^^^^>^>vv<^^><>><v><^^<>><^<>^v<>vv>>>^v>>^<<<>^v>>^vv<<<<v<>v<v>>^^^v^><^^>>vv<>^<>v^<>>v^vv<<^v<vv<<<>>v>vv><><<v<<^^>^^<vv^^<v>>v^>v^<<<^>^^^v>v>>v<>>^^^vv<>^<v^^^^vv><^v<v^v<>>^>^vvv^^^<v<<<v>>>>v<>^<^vv>^v<>v^v^>v>^^<^^v>^>>v^vv^^v^^<^<<<v^^>^>v^><<<<><v>>vvvv>vvv^<><<^v^v<<><>v><<><>^>>><<<v^<>v^v^v<v<^<>v>^<v><v<<>>^<v<<
            vv><>v<><^><>>^><><^>v><>v<<^^^^v>^<>>^<^^^^<^<>^<>>>v<vv<>>^><<vvv^><<>>>>^vv^><>^>^>v<^v<v^><^><<<^^^<>v^<v^<v^<vv<^><><<v<^^vv^<<><^^<^vv>vv^<v<^<<<v>v>^<>^<<^>v^^>v<<v^><^^^<^>v<vv^^<v>v^^>^<>^v^^<v>^^^>^^v>>^>>><^>^^>vv><v>>^v^>vv<<>>^v>v>^v<<<>^v>>v<>>^>^v>^<>vv<v^<><>v>^^>v>v<><<^^^<v>^<<vv^><<vvv^<>vvv>>><vv^^v^<<v>^v>>>>><><^v<^<<<<<v<v^v^>v^vv^><vv>><<>v><>vv^<>^<>>v<<<><<vvvv><><>^>v^v<v<v><vvv>>^><>>^<>^vvvv>v<<<vv<><v><v^>^^v<<>vv^>>>>>>v^^<v><^v^^<^v<<^><<><^^^v>vv>>><>v^<>>vv>^<vv^<<<<v<>vv>v<v<<^<^v<><>^>>^v^v><v^<^<>>>v<<^<^>vvvv^<>><<>v>><>^>^<><v^^>v><v^>^<^vv><v>>^v^^^><<^<v<><^^^^<vv>>v<><<<>>^vv^<v^><^<v<>><>>^v><v^^>v>v^<vvv^^v>>^<>>><>v<>^v<^^^v><<v>^<>>^><><>v^^>><^<^^^>v^v<>v^v>^><v^<^<v>^>vv<>v<^^<v>>vvv>^^vv^><v^^>v<v<^>v<v<<<^v>><>^<>vv<vv^<<vv<^v^^><>><<<v^<<^>v>^>v^><^<<v>><v<^^v^v>v>>><>vv^v>><<v>^>><^^^<<<v^v<vvv><<<<^v^>>v^>><^>>^<<><v>>^><>^>>^<>vv<^>^>v>^>v>v^<<<vv^v<^^vvv<<>^v>^><v<v^vv^<^^<<>>>^<vv^<v^>^v>>^^^<>^v^>^^^^><<vv^^<^^vv<><>>>v<^^><v<>>^
            ^^>^^v><^><^vv<<<<^>>><v<v>^>vv^<>vv^vvv^<>>v<<v<><^<v^^>^v^^^vv>>v^<^<<>^v^>^v<<>^^>^<^vv<^^<>v>^>v<>v>>v^v<v>^<<<><>v^^>v^v>v^<<^^<>>>v^>^^vv<<<v<^v<v^v>v><>><>v<v><>>v><^<<^^^^<vv<><><^v<vvv>>v<vvv<^v>vvvv^<<^<^vv><<>^^^^v<<>vv<><vvv<v<<^v<>><><^>v^<<><^v^>^>^<>^^^>>^<<>v<^><v>>>>^v<^v>^v>^v<^>><><>>^<^>>v<<<^>v><<^<^v^vv<>><^<<<v^><>v<^^^v<v^<^<vv^v>><v<v>^<<v<>^<^v<<^v<>^v<<^>vvvv<v<<<<vv>>^^^<>v>vvvvv^v>>^<<^>^>v^<^>^v^^><^>v^<^>><^^^vvv>^<>v>v^^^>^>><<<><><<<^<vvv>^v^^<<^<^v<<<^<>>>>vv^><><v^>^v<^^>v<<v^<>>v>^<^vv<<vv><><><^v<<<>^>v^v<>v^^^^>^^>^<<>^><<^>^^^>^<^^<>><<^>^<<<v^^>^^<>^v<^><>^v>v^<>>^<<vv^^>>^^^^v<v^v>vvvv<<>v>^<<<>>v>^^>v><>>^<v^v^v><><<vv<><<<^^<<vv^<v^v^v>^vv^><vv>^v<^v<v>>^^<<<><<<v<^>><><<<<v>>^v^v<>>>v<><^^vv^v><>^<>vvvv>>>>>^>><<^>vvv^^v^>^>><<<^>^<>><vvv^>><v^<vv<^v>>>>v<^<<><^<^^>v<>>v^^^<^<vvvv<<^>>^^<^v>v>v^^v^^>v<^^<>><>>vv>^^>vv>v>vv<><v>^v^^v<^<^^>vvvv>v<<<<<^^<<v^><^>>^^v><<^>^^<v<<v<>^v^>>>^><vvv^^v><>vv>^^v>vv>v^v<<^>><<^^>^^><^<^>^>^>v>^<<><^>^^<^<
            vv>>^<v>><<<v>>^>><>><<<<^<^<<^>^>vv^v^<v^^^v>v><^<^>v^>>^v^<><<<^v^><v^vv>>>>v<><>vv<><vv><><<^<^<>><<^>^v><<vv^vv<^^<>v<>v>^>^<^<^>><>^^><vvv>v^<^<^<>v^><<<>>v<<<v^>^<>>>^v>v>v^vv><vv^>^v^<v><v^v^<>>^vv>^>>v<><>v>><^vv<<<<v^^>^<>><><^^^<><>>>v^^^^>v<v>^v^v>v^<v<<<><><><^>^v^v>^v^><<>>^><<v<^<v^v>vv^<^>v^v<^<>>>^^v><<^>><<<v^^<>>>^vv<>>vv>>>^<^^>>>^v<v^^^>^<^><<v<>>^^^^>><>v>^v><<v^<><v><v^><^<vv^><^<<v>><><^><>>v^<^<^>^^<^>^^<>>^<vv>vv<<>^<vv>>^>^<v<>v^<v><^<<v<^^<^>>^vv>^>vv^<vv<^v>v^v<vvvv^^>^^v>>>><>vv>^vv<>v^><><v>^v<<^>v<>^><v<<^vvv^>v^<<v^^>>>^^><^<<v^v>vv>v<^<<^v<>>^^<^>^^vv^^^^<^^<v<^v>><^<>^vv^><>>^v<vvv>v^^^vv<^<>>^><<>v^^^<>>^^<v^<vvv<^<<v^v<v><<v<<^>^v^><>><>^^^<><>>>v>>><vv><vvvv>^^^<^<><^^^>^v<^<^<>^^<vv>^>^v^><>>v<^<^>^><v><>vv>^v^>v^^v<><<v<><^<<>>^>^>>>v^><<vv<>^<^^v>v<<v^>>v>>^<vv>>v<v^v><<^><<><^^>v>v>>v^<><^>^<^v<>^^v<<<v<>v>>vv^><><>>^v<v>>>>^v^vvvv>><v<v<>^v<<^<v^<<v^>^<>v><<<^^^>^<^^^v>^<^^vv><>v^><<<>>^v^><<>>^<v<^^v>^>v<<<><><v^vv^v<vvv<>v>^^^^v<v><v>v>>^>^^>
            >^^v>><vvv<vv<>>vvv><>>^>>v>^v<^^vv^<>>v^^v^>>v<>^>v<^v>^^>^><><vv^>v>^vvv<<v>^v^<<>v>><^v^v>^>v^<v<^v>vv^>>v><<<<<^<vv^<>^>^<>v>v>>^^^><<^vv<<>v<><^<v<><vvv^v<^v^><<<v>vv<vvv>v>^^^<>><<v>><<>^^<><vv<^<<vv>^<<><>><vvv^>^v^vv>^^<v^<>v<>^^^>^v<^^>v^^<v>^<<v^vvv<<v<^><<v^<<>^^<><>^<><v^vv>>^^v>>v^><<<<vv<^<<vvv>^<<><<^>><>>><^v<<^^^<v^^vv><>^<>><>>v<^><<^^^><>v<<>v<><<^^v>^>>>v<>vv<>v<>^><v^^><v<>^v><><>><<^><v>>^>^><<v^>>v<v<<<><vvvvvvv><>vv>v<>>^><v<>vv^<><v><v^v>^^^^v<>>v>><<><v<v^<v^><^>>>>^<<vvv>^>v^>v^<v<>vv>v^<<<>>v<^<vvv^v^<><><<vv>v^<v<^v^>><v^>^^vvv^<><^^>^^<>v>^><>><v><>>vv<vv<^^<>v^v^v<<v<<v>><<<>>^^^vvvv>><<<v<>v>^^>^^<vv>^<<vv>v>v<><<^><<<v^<v^<vv^>>v>><>>><^v><<^<>^>v<<<vv^v^>^^^>><<^vv^<v<>^^>>>v<<^^^v>^^vv>v<<^><<vv^^>><<^<v<<v<<^<>v<<^>^<>>^<>^<^<v<v>>v^v>>^>v<^v<<>^^^^<v<^v<^<vv^<^<><^>v>^v<v^vv>^>v><^^<>v^<v>^>>>vv>v<<^v>>^^^>v><><v<<^<v^vv^<^>^<<v<<^^<v^v<><v<v<vv<vv<v^^v<^>>^^v^v^^<>>>>vv^>^><v<<v<^vv^>>^^^>v^<>^^<<v<^v^>^^^^<>^<vv^<>^<<^>>^><v^v<v<<^<><^vvvv^v<><>v>
            ^<<vvv><<<<^<<<v>v^v^^<>>v<v^^v<>^<^v><>><>^<^><^vv>vv>^<^>>v^^>v>><^>v><>>^^^<<v<^<>^>^>v>^v>^<>>>>>vv^v^^v<<>^^<vv>^v<v>>^<<v<<<>^<<<^vvv<v<^<><^v<^<><<^^^<v<<vvvv<^>v<<^^^v>^><v<>^<^<><<<>^<^v<^^<><<<<v>^<<vv<^<^<v<<<>>^>v>>>>v^<<<^<^v>>v>><<vv^>v^<^v<v<vvv<><v<v>^^vv><>><^<<<<^^<^^<>><<v>>v>v^v^>^^<vv><>>>^>^^>^vvv<vvv^<vv<v<v^v^>v>^^vv^<v<^<<^v>vv<<^^v><v^>^^^>v><<v^vv^<>v><^^>>>>>^<^>>>v<<<>^v^<^^^v>v^><<>><>>v>><^><v<<<>vv<><>><>><^v^v>v^<>vv^<vv<v><vv^<vvv^^^>v^^^vv>vv^vvv<<^><v><>vv>>v><<>v<>>v>><v>vv<><>>^vv^>>v<v<vv><^>v^v>^<^>^vv>v^^<^<<v><v><<^^<^<<^>v<^>v^><v>><^><^<<<<^vvv<^><<^<^vvv>v^^<^v^^><><^vv>^vv^<<^<<v>v<<<vv<^<v^>v>^<<><>vv<v^>v^^v<^^<>v>v^^>v>v<vv<>v<<<<v>>v^^v^>^v>^>v<><v^v^vv<<vvv^<>>>v^^>^><v^^<v>^^^>^<^^v<><>>^v<><vv^^v<><>>v>>>v^^vv^v<<><v^vv<v^<>>^<>v<v^^v^>>^<<^^<<<^v^^>^v^>>><v^vv<^^><v><<<<^<>v^<^^>^v^^v<<>v<<vv^<^<^>^v^<^v^>v^<<vv><^^>>^><v<<vvv^^<>v^<v>^v<^>^^<v^<^>v><vv><<><vvvv<>>>^<^<<^^v<>v^v^<^^^^^>>>><v^v<v^^^><<v^vv^v<>^v^v>>>^<^^>vv>^vv><<v^v
            vvv>vv><<<^>^<>^^^v<v>^<<<^v<v>v<^v>^<>v^>>vv<>>><>><^^v^v><^><><<>v><<v><v<<>^v^^><^^<v^v>^v^>v<>v^vv>^^>><v>^v<^vv>>><<>^^>vv<><>v>^>^>><v<^v<^v^>^<vv<v<^>^^>><<v<^^>v<v><^v^<v>><>^<>^>>vv<>>^^<v<><v>^<v<<<<^<><vv^v<>><^<<^><<v^^>v>v<>v^^^<<v^<>><^v>>><<vvv>^v<vv<>><^<^^v><^^>><^^^<><v<^^>^^>v<v><^<^^>v<<^<>>v<^v<^<^<v>>^^>><^<^^<>v><<vv>^>^^><><^^^<v>>v^^>v^^<^^><^^v><v<<>>>><><>vv^>^><^><v<^<>^><v<^^^^><>>>^v<vv^v^>v<v<<v^<<<<^>v<v>><>^<>><>>v<^<^><vvv><>^><v<<vv^<v<^v>><<<<<><^>^<<^>>vv>v>^<<>>>v<v^^><>vvv^^>>^>^vv^^v^v^v^v^<>^<^^<<<>v<>^^^>><<>v^v^>v^v>>>^<^>v<v<^^^><<v>vv<^v<v<v^^<^v^vv^>v<^vv<vv<<>^v><^>vv<^><<^v>^><<<v>^>vv>^^^>v^<<vvv<^v>>^^<<<<^^^><v>v^v^^^>^vvv^><v^<^>v^v^vv>^><^<^>>v>>><^<<>^<^>v>vvv<^><<>><^^>v>^^v^vv^>v^<^v>v^>^^^<<<^^<^v^>>^^<^>^<^>v>>v<v>>v^<<vv>v^v^>^<v><><<^<^^v<^><^<^>v>^<>vv><<><^v^<v<v>v>>^><v>^>^^>v<^^^>vvv<v><>^^<<vv>^<^^^^v<<v<<^v<v>v^^vvvv<>>v><><v><^^v^>>^^>v><>v>^^><v>^vvv>v<<<^>v^^>>^v^^><^vv>v^v>>v^^^v<^>v<>><>>^vv<<^<>^<^<>><^<^<>>^>^^^v<
            ^^>v^<^<v<<<v^<v<vvv>>v><vvv^v>v<vv^><>>>^>v^><<^^<^v^^<^<^^^v<^v><<v>>^^v<^<>v<<vv<><>>v^><>^<v<<^vv^>vv<<^^^>v^^>^vvv^v^^^v<^<>vv^v<>v^>vvvv<^<<vv>>v>><><^>vv<^>><><<v^>><^>><>v<><v^^<v><v^v^><>><v>>v<><^<<>v>v><v<>^><<v<^>^>^<<<^<^>^>v^<^<^><^^^^<<^v>v><v^>^<^>>v<<^>^>v^vv^v><>v><<vvv<v^<^><v>>v<v<^vv>vv><v>><<^vv>^>vv>^v<>><^<^^<^v^v^>v<<>v<^<^<>^<^<v^>^<>^^<v^v^v>>^>v^<v>v^<<>>><<^<v<<><><^^>^^v<^>>v<v<^^<^v<<><^vv<><>v^v<v^^v^v^>><^><<v<v><<<>>><v^^>>>v^><><v^v<>v<v<<^vv^^>^^^>^v^<><v^^>^<^^v>^^<v^>^v<<<^>v<^v><<>>v^<>^^^v<^v<<^v<>^v^><^>^><^v^><v<v^v^v<v>^>v^v<>^^v<<>>^<>vv^^^>^<^vv>>>^^v>vvv^<^v^vvvv<vv<<><v>v^^v^>^v^v^<v><>^v^vv><vvv<>><<vv<vv>v^vv<^v^v>^^<v>v^<>v^<>>vvvv<^>v^><^v<v>>>>v<<^<vv>^<<^^^^>^>>v>^vv>v^>v>^^^<^v^vv<<>v^v<><vv>>^^><<>^<<v<^>vv>v>>>v<vv>v>v<^<<<>v^<vvv<<<v>v>>v<<>><<^v<^v<^<>^><^<>v<>v<<^<<<v><^^<><^v><<^<^v<>v^>^>><>v>vv^<<v^<<vv<v^<v>v^^<>><^><><>>^^><^^vv>^<>^^>v<>vvv^>v^>v^>^<><v<<<vv<<^v^v>^<<^<^<<^v><^>^><>^><v<<>>>^^>v>><>><>^^<>>>^^>^v^<v>>>^^>
            ^<<<><>>>^>^<<vv^<>v><^v<>^<^><^><v<vv^>vv><<>^><><><^v^<>^<>vv^^<>v>><^>>>><>>^^v^<^^^>><^v^v^<v<<<<^<>><v^^>^v<>vv<>><<^^^^v>^<vv<<^>>>>vv>>v>^v^<<^><v>^>vv><<<<^>^^>>^<<>^>>^<<>v<<v^v^^v^<<^v<<v>>>>>v^>v>^<^v^<^<<^>v<^>v><>vv><v^^<<>>>v>>v^v^<^<vv<>>><<^v<v^v>vv>v^<>>>vv><>><>^^>v^>v<v<v^v>>>^v<>^v<>^vvv>^<><v^>v^<v^<><v>vv^v^<^<>><<v^><^>^<^><v^>^^^>><^v^<<^<^vv<v><^^v^<v<>v^^>>^^>vvv>^^v>><vv>^vv>vv<<vv<<>^<>>>v^v>>^vvv^v^v<^>v^v^<<v><>v<<<>v<<vv<>v<>v<>v<<v<v<>><^^^>v^>v>>^><><>^>^^>^<>>^>>v><<<<^^<v<><>>>^<v<<^^v^>^><^^vvvv<<>vv>^>^><^v>v>>vv<>^>>^>^<vv<>^<<^^v<^<>vv>vv<v>^v>v<<>v<^vv><^>v>>^><^vvvvv<<>^>>>^<<<<^><<><v<><<<^<<<>>v^vv>v<<^>^v^<^>vv^>>>^<>^v^v^vv>v>v><<v<>><v^v>^<v>^>^v^^<<v^v<><v<v^vv>v>v<v<v>>v<^v<<vvv><^<<<><^v^>v^>v<><^v>>^<^v>^><><>><>^<^<<<<^>^><^vv>v^^<^v^v>>^vv<<<^>>v^>^>>><<v>^>>><<v>^>v<><>v<v<>>vvv>^><>^>vv^^>v><>>^v^<<^v^v>>>>>vv^<<^>^>^^v>vv<<v>>^^^vv^<v<>>v^>v<v><v^v^^<^<<>^>v<^>v<<>>^><>v^>><^v>^>>v>^><vv<vv>><^><><<><>>v><><^>>vv<^>>^>v<<^<>v>^>v<^
            ><^<<vvv^^>>^^>v<^<v<>v<vvvvv><^v>>>^<^^>^>>><vv<>v<^vv<<vv<<v^<^><<>^^v^<v<<>^><v^>^>vv<>>>v>^><vv^<><<>v^v><v^v<v>^^<<<>^^>v<><^^>^<>v>vv<vv<^<>^<>^>v><>^^v>v<v<<^<^v<>v<^^vv^<>v><^>vvv<>><<^>v^<<v<<^^v<^v<<^>v><>^vv<>^<<vv^^<^v<^<vv>>^>v<^<v<>><><>^<v^^^^>^>^v<>^v>v><<^^<v>^>>><v^>>^^<^v><<v>>>>v<<>>>^><>v>>v<^^vv>^^v^<vv>^<v>><v<^^>v^^><^<^^<<>>v>>v<<<v>><>v<<vv>v><vv^<^<vvv^>><vv>^^>>v^<^<<<<<<<<<>^>>vv<^^^>>vv^><>^>><^^v<^<v^v^>^<<^>vv>^^>vv>^<<v<<v<^^<vv>v<<<v^>^^>^><^<<>^v^>^>v^<v^vv>>>^<vv<<>>^>>^^^<^>v^^>v^<v>^<^<v<^vvvvvvvvv^><^>^>><vv<<^v<>^>^v><>>^^<^>v<^<>^>>^>v><^v^<<>>vv^<v>v<v><v^^>^><^v^>^<v^^vv>>v^vv^v<<v<vv<^v><>^>vvv>^vvvv<<^vv^<<^^v^>v<^^^<^^v^v<^v><>>><^vv<><^>^^vv>>>v>>^<vvv^><^^vvvv^vv^>^>^><^>v^^<<^v^><vv^^v^<v>>>v^><^v><><<v^>>><v<^<^<><<>><<^v>>^^^v<>><>>v<^vv<v>><v<<^^<^><><^^>vv<v><v><vvvv<<><>><^><v<^>>>v^<>vv>^>v<<>vv>>^v^<<v^<v^^><v><^^^>v^<v>v<><><>^>>>v^<<>>v>^v<<>^>^>^<><^^v^^<>vv<<<vv^<^v^>^<>v<<^v>><^>v<v^^<^v>^<><^<<^<^<v^^<>>vv<><v<^v>^^<^<^<<>^>
            """;
}
