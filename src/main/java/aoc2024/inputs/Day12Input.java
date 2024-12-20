package aoc2024.inputs;

public class Day12Input {

    public static final String SHORT_1 = """
            AAAA
            BBCD
            BBCC
            EEEC
            """;

    public static final String SHORT_2 = """
            OOOOO
            OXOXO
            OOOOO
            OXOXO
            OOOOO
            """;

    public static final String SHORT_3 = """
            RRRRIICCFF
            RRRRIICCCF
            VVRRRCCFFF
            VVRCCCJFFF
            VVVVCJJCFE
            VVIVCCJJEE
            VVIIICJJEE
            MIIIIIJJEE
            MIIISIJEEE
            MMMISSJEEE
            """;

    public static final String SHORT_4 = """
            EEEEE
            EXXXX
            EEEEE
            EXXXX
            EEEEE
            """;

    public static final String SHORT_5 = """
            AAAAAA
            AAABBA
            AAABBA
            ABBAAA
            ABBAAA
            AAAAAA
            """;

    public static final String FULL = """
            RRRRRRRRRRRRRRRRKKKKKKKKRRRRRRRRRRRRRRRRRRRROOPOOOOOOOOGOOONYYYYYYEDDDDDDDDDDDLLLLLLLLOOOOOOOOOOOOOOOXVVXHHHHHHHHHHLLLLLLLLLLLLLLJJJJJJJJJJC
            RRRRRRRRRRRRRRRRKKKKKKKKKRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOYXYYYYKEDDDDDDDIIIDLLLLLLLLLLOOOOOOOOOOOOOXXXXHHHHHHHLLLLLLLLLLLLLLLLJJJJJJJJJJJC
            RRRRRRRRRRRRRRKKKKKKKKKKRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOYYYYYYKEDDDDDDDDDILLLLLLLLLLLOOOOOOOOOOOOOOXXXXXXXHHHHHLLLLLLLLLLLLLJJJJJJJJJJJJC
            RRRRRRRRRRRRKKKKKKKKKKKKKRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOYYYYKDDDDDDDDDDIILLLLLLLLLLOOOOOOOOOOOOOOXXXXXXXHHHHHLLLLLLLLLLLLLLJJJJJJJJJJJC
            RRRRRRRRRRRRKKKKKKKKKKKKKERREREERRRRRMMMRRRROOOOOOOOOOOOOOOOYYYYYKKDDDDDDDDDDDDLLLLLLLLOOOOOOOOOOOOOOOXXXXXXXHHHHLLLLLLLLLLLLLLJJJJJJJJJJAAA
            RRRRRRRRRRRKKKKKKKKKKKKKKEEEEEBEERRRRRMRRRRROOOOOOOOOOOOOOQQQYYYKKKKDDDDDDDDDDDDLLLLLLOOOOOOOOOOOOOXXXXXXXXXXHLLLLLLLLLLLLLLLLLJLJJJJJJAAAAA
            RRRRRRSRRRRKKJKKKKKKKKKKKKEEEEEEEERCRMMMMRROOOOOOOOOOOOOQQQQQYYYKKKKDDDDDDDDDDDDLLLLLLOOOOOOOOOOOOXXXXXXXXXXXXTTLLLLLLLLLLLLLLLLLLJJJJAAAAAA
            RSRRRRSSRRRRRJKKLKKKKKHHKKEEEEEEEECCCWWCCRROOOOOOTOOTOOOQQQQQYQKKKKDDDDDDDDDRDDDDRLLLLLLOOOOOOOOOOXXXXXXXXXXXXXTLLLLLLLLLLLLLLLLLJJJAAAAAAAA
            SSSSSSSRRRRRRRRKKKKKKKHHEEEEEEEEEECCCCCCCCROOOOOOTOTTOTQQQQQQYQQKKKEEEDDDDDDRRRRRRLRLLLLOOOOOOOOCCXXXXXXXXXXXXXXLLLLLWLLLPPLPLLLLJJAAAAAAAAA
            SSSSSSSSSSRRRRKKKKKKOTHHHHEEEEEEECCCCCCCCCRROOOTTTTTTTTQQQQQQQQKKKEEEEEDEERRRRRRRRRRRRROOOOOOOOOCXXXXXXXXXXXXXXLLLLLLLLLLLPPPLLLLJJJAAAAAAAA
            SASSSSSSSSRRRRKKKKKKTTTTTHEEEEOOCCCCCCCNNCRRRROTTTTTTTQQQQQQQQQKKKAEEEEEEERRRRRRRRRRRROOSOOOOOOOCCXXXXXXXXXXXXXXLLLLLLLQLLPPPLLQQAAAAAAAAAAA
            SSSSSSSSSSSSRRKKKKKKKTTTTTODEEDOCCCCCCCCCRRRRRKKTTTTTTQQQQQQQQQKAAAELLEEEEERRRRRRRRRRRRSSSSOOOOCCXXDXXXXXXXXXXXXLLLLLLLQQPPHQLLQQAAAAAAAAAAA
            SSSSSSSSSSSRRRKKKKKKTTTTTTODDDDOCWCCCCCTTTRRRRRRTTTTTTQQQQQQQQTKAAALLLLEEEERRRRRRRRRRRSSSSSSSSOCCCCDXXXXXXLLXXXLLLLLLLLLQQPHQQLQQAAAAAAAAAAA
            SSSSSSSSSSUUZZZKKKKKKTTTTTDDDDDDWWCCCTTTTRRRRHRUUTTTTTWWQQQQQTTTTLLLLLLWLEERRRRRRRRRRRBSSSSSSSCCCCCDXSSXXLLLLLLLLLLLLLLQQQPQQQQQQQAAAAAAAAAA
            SSSSSSSSSSZZZZZZZZKKKTTTTDDDDDDWWWRCCTTTRRRRUUUUUTTZTTWWWWWQQQQTHLLLLLLLLEERRRRRRRRRRRRKSSSSSSCCJCCDDDDXXXLLLLLLJJLLLLLQQQQQQQQQQQAAAAAAAAAA
            SAQQSSSSSSQZZZZZZKKTTTTTTDDDDDRRRRRRRTTURURUUUUUUZZZTTWWWWWWQQQLLLLLLLLQLEERRRRRRRRRRRUSSSSSSSSJJJJDDDDXEXLLLLJJJJJEJJQQQQQQQQQQQQQAAAAAAAAA
            QQQQQSQQQQQZZZZGGKTTTTTTTTTDRRRRRRRRUUUUUUUUUUUUUZZVWTWWWWWWLQQQLLLLLPPEEEERRRRRRRRRRRUUSSSSSWSJJJJRRRRQRXLLLLJJJJJJJJJQQQQQQYQQQQQQAAAABBAA
            QQQQQQQQZZZZZZZGGGGGTTTTTTTTRNRRRRRRUUUUUUUUUUUUZZZVWTWWWWWWWWWWWLLLLLPPEEEEEEEEEEURUUUUSSSSSSJJJJJRRRRRRRRLLLJJJJJJJJBBBQQQYYYQQQAAAABBBAAA
            QQQQQQQKKKKZZZZGGGGGTTTTTTTTTTTRRRRRRRURUUUUUUCUZZVVWWWWWWWWWWWWWLLLLLLLEEEEEEENNUUUUUUUUSSSSSSJJJRRRRRRWRCRLJJJJJJJJJJJJBBQQYQQQQQQAAAABAAA
            QQQQQQQQQQQZZZZSSSSSSSSTTTTTTTTRRRRRRRRRRUUUUUCCVVVVVWWWWWWWWWWWLLLLLLLLEEEEEEENNUUUUUUUUSSISSJJJJJRRRRRRRRRRJJJJJJJJJJJJQQQYYYXXXQAAXXXXAAA
            QQQQQQQQQQQZZZZSSSSSSSSTTTTTTTWWWWWRRRROOUUCCCCCVVVWWWWWWWWWLCLLLLLLLLLLLLEEEEENNUNUUUUUUUUSSLJJJJJJRRRRRRRRJJJJJJJJJJJJJQLQQYYXXXXXXXXXXAGA
            QQQQQQQQQQQHLLLSSSSSSSSTTTTTTTWWWWWRRRROOOUCCCCCVVWWWWWWWWWWLLLOLGLLLLLLLLEEEEENNUNUUUUUUUUSJJJJJJJRRRRRRRRRRCCJJJJJJJYYYYQQQQYXXXXXXXXXXXGA
            QQQQQQQQQQQQLLLSSSSSSSSSSTVSSSWWWWWRROROOUUCCCCCVVWWWWWWWLLLLOOOLLLLLLLLLLLEEEENNNNNUUWWUWUJJJJJJJJJRRRRRRRRRRJJJJJMMJYYYYQQQYYYXXXXXXXXXXXX
            QQQQQQQQQQQQLLLSSSSSSSSSSVVSSSWWWWWRROOOOPCCCCCCNVWWWWWWWLLLLLOOOOOLLLLLLLEEEENNNNNNUUUWWWWWFJJJJJOOORRRRRRRRRJMMMJMMMYYYYYQYYYYXXXXXXXXXXXX
            QQQQQQQQQKQLLLNSSSSSSSSSSVVSSSWWWWWRRRROPPCCCCCNNWWWWWWWWLLLLLOOOOOOLLLLLLEEEENNNNNNNUWWWWWFFJFJJJOOORRRRRRRRRJMMMMMMYYYYYYYYYYXXXXXXXXXXXXX
            QQPQQQQQQQQLLLLSSSSSSSSSSRRSSSSDWWWRRRRPPPCCCNCNNNWWWWWWWLLLLLLOOOOOOOOLLEEEEEENNUUUNNWWWWWFFFFGGGOOORGRRIIMMMMMMMMMMMYYYYYYYYXXXXXXXXXXXXXF
            QPPPPPQQQQQQLLLSSSSSSSSSSRRSSSSDWWWRRRRPPCCCCNNNNNNNWWWLLLLLLLLOOWWWOOOLLEEEEEIINUUUWWWWWWWFFFGGGGGGRRGGGIMMMMMMMMMMMMYYZZZZYYYYYXXXXXXXXXFF
            QPPPPQQQQQQLLLLSSSSSSSSSSSSSSSSDWWWRRPPPPPCCCNNNNNFNWWWLLLLLLLLWWWWWWOOWLQEEIIIIIIQUWWWWWWFFFFGGLGGGGGGGIIIMMMMMMMMMMMMYYYYZYYYYYYYYXXXXFFFF
            PPPPPQQQQQQQLLLLMMMMMSSSSSSSSSSDWWWRRPPPPPCCCCNNNNNNWWLLLLLLLLWWWWWWWWOWGIIPPIIIHIQWWWWWWWWFFFFGLGGGGGGGGGIMMTMMMMMMMMMMYNYYYYYYYYYYXXXXFFFF
            PPPPPPQBQQOOMMMMMMMMMSSSSSSSSSSDWWWWWPPPPPPPCNNNNNNNWWTLLLLLLLWWWWWWWWWWWIIPPIIIIIQWWAWWAJAFFFFFGGGGGGGGGGIMMMMMMMMMZMMMMNNYYYYYYYYYXXXXLFFL
            PPPPPPPBBBOOMMMMMMMMMMSSSVVDDDDDWWWWWCLPPPPPCNNNNNNNTTTLLLLLLLWWWWWWWWWWWIIIIIIIMQQWWWQAAAAAAFFGGGGGGGLLLGIIIMMMMMMNNNNNNNNYYYYYYYYXXXXXLLLL
            PPPPPPPBBBOOOMMMMMMMMMMDDDDDDDDDWWWWWCPPPPPPCNNNNNNNTTTLLLLLLLWWWWWWTWWWWIIIIIIIQQQWWAAAAAAAAFFFFGGGGGLLLIIIMMMMMMMNNNNNNNNYYYYYYYYYXLLLLLLL
            PPPQPPPBBBOOOOMMMMMFMVMDDDDDDDDDWWWWWCPPPPPPCNNNNNNNNTTTTTTLLTTTTTTTTOOIIIIIIIIIDDDDDLLLLAAAJFFFFGGGGGLLLLIIIIINMNNNNNNNNNNSYYYYYYYYXXLLLLLL
            TTTQPPVBBBBBOOOMMMMMMVDDDDDDDDDDDDWWWCCPPPPPNNNNNNNNNNNTTTTTTTTTTTTTTOOOIIIIIIIIDDDDDLLLAAAKJJJJJKGGGGCLLIIIIIINMNNNNNNNNNNBYYYYYYYYXLLLLLLL
            TTTTPPVBBBBBBBMMCMMMMMDDDDDDDDDDDDWWWCPPPPPNNNNNNNNTTTTTWWWTTTTTTTTTTTTIIIIIIIIOKDDDLLLLKKKJJJJJJJGGGGCLLLLIIINNNNNNNNNNNNBBBYYYYYYMMMLLMMML
            TTTTPPVBBBBBBBMMCCMMMMDDDDDDWDDDDDWWWCCNNPNNNNNNNNNTTWWWWWTTTTTTTTATTTTTIIIIIIIKKDKLLLLLLKKJJJJJJJJGCGCCVVLIIINNNNNNNNNNNNBBYYYYYYMMMMLMMMML
            TTTTTTBBBBBBBBBCCCCMCMDDDDDDWDDDDDWWWNNNNPNNNNNNNNNNTTWWWWWWTTTTTAAEEEZTIIIKKIKKKKKKKKKLLKKKJJJJJOJCCCCVVCDDNNNNNNNNNNNNNNBBYYYYYYMMMMMMMMMM
            TTTTTTBBBBBBBBCCCCCMCBDDDDDDWDDDDDWWWCCNNNNNNNNNNNNNWWWWWWWWTTTTTTAAEEEEIIKKKKKKKKKKKKKKLKKKJJJJJCCCCCCCCCCDNBBBBBBBBBBBNNBBYYBYYMMMMMMMMMFF
            TTTTTBBBBBBBBBCCCCCCCBDDDDDDWDDDDDWWWCNNNNNNNNNNNNNNWWWWWWWTTTTTTTEEEEEJEIKKKKKKKKKKKKKKKKJJJJJJJCCCCCCCCCCDDBBBBBBBBBBNNNBBBBBYAMMMMMMMMMFM
            TTTTTTBBBBBBNNNCCCCCCBBBBBBBWDDDDDDDWIIINNNNNNNNAANLWWWWWWWTTTTTTTMEEEEEEKKKKKKKKKKKKKKKKKJJJJJJJCCCCCCCCCCCDBBBBBBBBBBNNNBBBBBBMMMMMMMMMMFM
            HHTHHBBBBBBNNNCCCCCCCBBBBBBBWDDDDDDDWIIIIIIINNZZZZZZZZWKWWWTTTTWTTMEEEEEEKKKKKKKKKKKKKKKKKJJJJJJJCCCCCCCCCJCJBBBBBBBBBBNKNBBBBBBBMMMMMMMMMMM
            GHHHHHBBBBNNNNNNCCCCCBBBBBBBWDDDDDDDWIIIIIINNAZZZZZZZZWKKWWWWWTWTTMEEEEEEKKKKKKKKKKKKKKKKKKKKJJJJCCCCCCCCJJJJBBBBBBBBBBDDNBBBBMMMMMMMMMMMMMV
            HHHHSSSBBBNNNNNNCCCBBBBBBBBBBDDDDDDDWIIIIIANAAZZZZZZZZKKWWWWWWWWWTTEEEEEEKKEKKKKKKKKKKKKKKKKKKKKKKCCCCCCCCCJJBBBBBBBBBBDDLBBBBMMMMMMMMMMMMMM
            HHHHSSSBBBNNNNNNCNNBBBBBBBBBBDDDDDDDIIIIIVAAAAZZZZZZZZKKKKWWWWWWWEEEEEEEEEEEEKKKKKKKKKKKKKKKKKKKKKBMBBCCDDDJJBBBBBBBBBBDDDBBBBBBMMMMMMMMMMMM
            HHHSSSSNNBNNNNNNNNNBBBGGGGGBBDDDDDDDIIIZZZZZZZZZZZZZZZKKKKKKWWWWEVVEEEEEEEEEEKKKKKNNNKKKKKKKKKKBBBBBBBBBBBBBBBBBBBBBBBBDDYYYABBBBMMMMMMMMMMM
            HHHSSSNNNNNNNNNNNNNBBBGGGGGBBBBBIIIIIIIZZZZZZZZZZZZZZKKKKKWKWWWWEEEEEEEEEEEEQQKKKKNNNNKKKKKKKKKBBBBBBBBBBBBBBBBBBBBBDDDDYYYYYBBBBMMMMMMMMGMG
            HHHSSSNNNNNNNNNNQNBBBBGGGGGBBBBBIIIIIIVZZZZZZZZZZZZZZKKKKKWWWWWEEEEEEEEEEEEEEEKCCCNNNKKKKZZKKKKKBBBBBBBBBBBBBBBBBBBBDDDYYYYYYBBBBBMMMMMMMGGG
            HHHSSSSNNNNNNNNNQQBVVBGGGGGBBBBYXIIIIIVZZZZZZZZZZZZZZKKKKKWWWWWWEEEEEEEEEEEECCCCCNNNNZZKKZZZZKKKBBBBBBBBBBBBBBBBBBBBGDDYYYYYYBBBBBBMMMMMGGGG
            SSSSSSNNNNNNNNNNQQQBBBGGGGGGGGGYXIIIIIBZZZZZZZZZZZZZZKKKKKWWWWEEEEEEEEEEEEETCTCCCNNNNZVZZZZZZZBBBBBBBBBBBBBBBBBBBBBBGDQQYYYYYBBBBBMMMUMSSGGG
            SSSUUUNFNNNZNNNQQQQBBBGGGGGGGGGGGXIIIIVZZZZZZZZZZZZZZKKKKWWWWWWWEEEEEEEEEWWTTTTNNNNNNZZZZZZZZZZBBBBBBBBBBBBBBBBBBBBBGGQQYYYYYYYBBBBSSUSSGGGG
            SCCUUUYFFNNNQQQQQQQBQQGGGGGGGGGGGNNINNVZZZZZZZZZZZZZZXKFOWWWWWWTETEEEEEETTWTTTTWNNNNZZZZZZZZZZZZBBBBBBBBBBBBBBBBBBBBGGQYYYYYYYBBBSSSSSSSGGGG
            SCCYUYYFFVVNQQQQQQQQQQQQQGGGGGGGGYNNNNVZZZZZZZZZZZZZZOOOOOOWWWTTTTTTTTETTTTTTTTTVTPPZZZZZZZZZZZZBBBBBBBBBBBBBBBBBBBBGGYYYYYYYYYYBSSSSSSSSSSS
            CCYYYYYYYVVVVVQQQQQQQQGGGGGGGGGGGNNNNNVZZZZZZZZZZKKKKOOOOOOOTTTTTTTTTTTTTTTTTTTTTTHPZZZZZZZZZZZBBBBBBBBBBBBBBBBBBBBBTYYYYYYYYYYYYSTSSSSSSSSS
            YYYYYYYYVVVVVVQQQQQQQHHHHGGGGGGGGNYNNNVZZZZZZZZVVVKKKOOOOOEEEETTTTTTTTTTTTTTTTTTHHHPPAZZZZZZUUTTTBBBBBBBBBBBBBBBBBBBYYYYYYYYYYYYYRTSSSSSSSSR
            YYYYYYYYYYYVVVQVQQQQQHHHYGGGGGGGGYYNNNVVVVVVVVVVUUUUOOOOOOYYYTTTTTTTTTTTTTTTTTHHHHAPAAZZZZZPUUTBBBBBBBBBBDIBBBBBBIIIYYYYYYYYYOYRRRRRSSSSRSRR
            YYYYYYYYYVYVVVVVVQQQQHHJYYYYYYGGGYNNNNNVLVVVVVVTOUOOOOOOOOYYYTTTTTSTTSTTTTTTTAAAAAAAAAZZHHHUUUBBBBBBBBBBDDDBBBBBBIIIYYYYYYYYYOYRRRRRSSSRRRRR
            YYYYYYYYUVVVVVVVQQQQQHHYYYYYYYYYNNNNNNVVVVVVVWVOOOOOOOOOOOYYYZTTTTSSSSTTTTTTTAZAAAAAAAAAHHHUUUUUBUBUUBDLDDDBBBBBBIIIYYYYYYYYYOORRRRRSSSSRRRR
            YYYYYYYYYVVVVVVQQQQQQPHYYYYWWYYYYNNNNNNNVNNVVWWWOOOOOOOOOYYYYZZOTTSSSSSSSSTTTAAAAAAAAAAAAHHVUUUUUUUUUUDDDDDIIIIIIIIIIYYYYYYYYYYROOQRRRRRRRRR
            YYYYYYYYYYVVVVVQQQQQQPPYPYUUYYYYNNNNNNNNNNNNVWWWOOOOOOOOOOUYYOOOOSSSSSSSSSSAAAAAAAAAAAAAHHVVUUUUUUUUUUUDDEEIIIIIIIIIIYYYYYYYYXYROQQQRRRRRRRR
            YYYYYYYYYYVZZVVZQQQQQPPPPUUUYRYYNNNNNNNNNNNNVWFFOOOOOOOODUUDYOOOOISSDDSSSSSAAAAAAAAAAAAVVVVUUUUUUUUUUKKKKEIIIIIIIIIIIIYIYYYYXXXXQQQRRRRRRRRR
            YYYYYYYYYZIZZZZZZQQQQPPPPUYUURYYYYNNNNZNNNNNNFFFOOOOOONNDDDDDDOOOOSSSDSSSQSAAAAAAAAAZAAVVVVVVUUUUUUUUKKKKKKIIIIIIIIIIIIIIYYYXXXQQQQOROORRRRR
            YYYYYYYYYZZZZZZZZQQQPPQUUPUUUUYUUYNNNNZNNNFFFFFFPOOOFONDDDDDDDDDDOSDDDDSSSSDDAAAAAAAZAAAVVVVUUUUUUUUUKKKKKVKIIIIIIIIIIIIIYMMMMMQQQQOOOOORRRR
            YYYYYYYZZZZZZZZZQQZQQQQQUUUUUUUUUONNNNZAAAAFFFFFPOOFFONNNDDDDDDDDDDDDDDSSSSDDAAAJABAAAAVVVVVUUUUUUUUKKKKKKKKIIIIIIIIIIMIIFMMMMKQQQQOOORRRRRR
            YYYYYJZZZZZZZZZZZZZQQQQQUUUUUUUUVOOONZZAAAAAFFFFFOGFFONNNDDDDDDDDDDDDDDDSSSDDAZAABBBBBAVVVVVUUUUUKKKKKKKKKKIIIIIIMMMMMMIMMMMMMKQOOOOOOOORRRR
            GGZZZZZZZZZZZZZZZZHQQQQQHUUUUUUUVOOOZZZAAAAAFFFFFFFFFFNNNNNNDDDDDDDDDDDDDDDDDRZRBBBBBBVVVVVVYUUUUUUURRKKKKIIIIIIILMMMMMMMMMMMMMOOOOOOOOORRRR
            GGZZZZZZZZZZZZZZZZHHQHQHHUUUUUUUVVOOOZZZAAAFLFFFFFFFFFFNNEEEEEEEEEEDDDDDDDDDDRRRRBBBBBBBVVVYYUUUUUUIIKKKKKKIIUMMMMMMMMMMMMMMMMMOOOOOOOOORRRR
            GZZZZZZZZZZZZZZZZHHHQHHHHHUVVUUUVVZZZZZZAAFFFFFFFFFFFFNNNEEEEEEEEEEDDDDDDDDRRRRRRBBBBBBBVVYYYYYUUUUIIIKKKKUUUUUUMMMMMMMFFFFMMMMOOOOOOOOOOORR
            GGZZZZZZZZZZZZZZZZHHHHHHHHVVVVUVVVZZZZZZZZMFFFFFFFFFFFNNNEEEEEEEEEEEEEEERRRRRRRRRBBBBFFBVVVYYYYYYUUUIJDDKKKUUUUUMMMMMMMFFFFMMMMOOOOOOOOORRRR
            ZZZZZZZZZZZWWWWZZCHWHHHHHHHVVVVVVVZZZZZZZAMFFFFFFFFFFFNNNEEEEEEEEEEEEEEERRRRRRRRRFBFFFFFFVVFFYYYYUUJSJDDKUUUUUUUMMMMMMMFFFFMMMMOOOOOOOMMMRMR
            QQZZZZZZZZZZZWWZZWWWHHHHHHHVVVVVVVZZZZZGZAFFFFFFFFFNFNNNNEEEEEEEEEEEEEEEDRRRRRRRRFFFFFFFFFFFFYYYYYJJJJUUEUUUUUUUUMMMMMMFFFFMMMMOOOOOOMMMMMMM
            QQZZZYZZZWZWWWWWWWWHHHHHHHHVVVVVVVZZZZZAAAAFFFFFFNNNNNNNNEEEEEEEEEEEEEEEVVRRRRRRRFFFFFFFFFFFFFYYYYJJJUUUUUUUUUUUUUXMMMMFFFFMMMNOOOOOOOOMMMMM
            QQQQZZZZZWWWWWWWWWWHHGKKHHHHVVVVVVZZZZZZAAAAFFFFNNNNNNNNNEEEEEEEEEEEEEEEVVRVRRRRRFFFFFFFFFFFFYYJJJJJZZZUUUUUUUUUUXXMMMMFFFFMMMOOOOOOOOOOMMMM
            QQQQQQKKKKKWWWWWWWWHKKKKKHHVVTTVVVVZZZZAAAAAFFFFNNNNNNNNNNNKKKKKEEEEEEEEVVVVVRFRFFFFFFFFFFFFFYYJJJJJJUZUUUUUUUUUUXXXMMMFFFFMMMOOOOOOUOUOMMMM
            QQQQQQQKKKKWWWWWWWWWUKKKKKHVITTVVVVZZZAAAAAAFFLLNNNNNNNNNNNKKHHKEEEEEEEEEVVVVRFFFFFFFFFFFFFFYYJJJJJJRUFFFFFFUUUIXXXXMMMFFFFMMMOOOOOOUUUOMMMM
            QQQQQXXXKKWWWWWWWWWKKKKKKKKIITTTVVVVAAAAAAAAAAAAVNNNNNNGGGNNKHKKEEEEEEEEEVVVVFFFFFFFFFFFFFFJYJJJJJJJJUFFFFFFUUIIFXXXXMMMMMMMMMOOOOOOUUUUUMMM
            QQQQQXXKKKWWWWWWWWOKKKKKKKKIITTTTTVVAAAAAAAAAAAAVNMNNNGGGGGNKHHHEEEEEEEEEEEEEVVFFFFFFFFFAAJJJJJJJJJJIUFFFFFFIIIIFXXXMMMMMMMMUUUUOOOUUUUUMMMM
            QQQQXXXKKKKWWWWDWWWKKKKKKKKTITTTTTTVVAAAAAAAAAAAAMMMMGGGGGGGHHHHEEEEEEEEEEEEEVFFFFFFFFFFFAJJJJJJJJJJJKFFFFFFIIIIIXXXMMMMMMMMUUUUUOOUUUUUMMMP
            QQQQXXXKKKKKKWDDWDDDKKKKKKTTTTTTTETVVAAAAAAAAAAAAMMMMMGGGGGGHHHHEEEEEEEEEEEEEVFFFFFFFFFFFAJJJJJJJJRRRKFFFFFFIIILIXXXXXMMMMMMMUUUUUUUUUUUMMPP
            QQQQXXXXKKKKKDDDDDDDKKKKTTTTTTTTTTPTTTAAAAAAAAMMMMMMMMMMGGWMHHHHEEEEEEEEEEEEELFFFFFRFFFFFFJJJJJJJJJRFFFFFFFFIIIIIXXXXXXXMMMMUUUUUUUUUUUUUUPP
            QQXXXXXXKXKKKDDDDDDDDDDTTTTTTTTTTTTTTTAAAAMMAAMMMMMMMMMMMMMMHHHHEEEEEEEEEEEEELFFFFFRFFFFJJJJJJJJRRRRFFFFFFFFIIIIIIXXXXXXXXMMUUUUUUUUUUUUUUUP
            QQQXXXXXXXXXDDDDDDDDDTTTTTTTTTTTTTTTTTTMMMMMAMMMMMMMMTMMMMMHHHHHEEEEEEEEEEEEEBRBFOFRRRFJJJJJJJJJRRRRFFFFFFFFFFFIIXXXXXXXXXXMUUUUUUUUUUUUUUPP
            QQXXXXXXXXXDDDDDDDDDDDTTTTTTTTTTTTTTTOEOOMMMMMMMMMTMMTTTTTMHHHHHEEEEEEEEHBBBBBBBBOORRRTTTTJJJJJJJRRRFFFFFFFFFFFXXXXXXXXXXXXMQUUUUUUUUUUUUPPP
            QXXXXXXXIXXXDDDDDDDDDTTTTTTTTTRRTOOTOOEOOMMMMMMMMMTMTTTTTHHHHHHHEEEEEEEEBBBBBBBBBORRRTTTPTTJJJJJRRRRFFFFFFFFFFFXXXXXXXXXXXXUUUUUUUUUUTUUPPPP
            XXXXXXIXIIXXDDDDDDTTTTTTTTTTRRRRTTOTOOOOOOMMMTMMTTTTTTTTTTHHHHYYEEEEEEEEEEEEBBBBBORRRTTTTTTJJJJJRRRRRFFFFFFFFXXXXXXXXXXXXXDLUUUUUUUUUUUPPPPP
            KXXXXXIIIIIDDDDDDDDDTTTTTTTTRRRRRROOOOOOOMMMTTTTGTTTTTTTTTTHYYYYYYYYYEEEEEEEBBBOOOTTTTTTTTTJJJJJRRRRRFFFFFFFFRXPPXXXXXXXXPLLMMMUUUUUUHUPPPPP
            KKKKKIIIIIIIIDDDDDDDDOTTTTTTRRRRRROOOOOOOMMMMTTTTTTTTTTTTTAYRRYYYYYYYEEEEEEEBBBOOTTTRRTTJJTJJJJJRRRRRFFFFFFFFXXXPXXXXXPPLLLMMMMUUUUUUUUPPPPP
            KKKKKKIIIIIIIIDDDDDDDDTTTTTRRRRRRRRROOOOOMOMTTTTTTTTTTTTTTAYYYYYYYYYDEEEEEEEBSBOOTOOOOOJJJJJJJRRRRRRRFFFFFFFFXOOPPPPPPPPLLLMMMMUUUUUUUUUUUPP
            KKKFFFFFIIIIDDDDDDDDDDTEEEERRRRRROOOOOOOOOOTTTTTTTTTTTTTTTAYYYYYYYYYBEEEEEEEBBOOOOOOOOJJJJBJJJRRRRRRRFFFFFFFFOOOOPPPPLLLLLMMMMMMWWUUUUUPPPPP
            KKFFFFFFIIIIDDDDDDDDDDDDDEEOSRRRROOOOOROOOTTTTTTTTTTTTTTTTYYYYYYYYYYBEEEEEEEBBOOOOOOOOFJJZJJJRRRRRFRRFRFFFFFFOOOOOPPPLLLLLLLMMMMWUUUUUUPBPPP
            KKFFFFFIIIIIDDMMDMDDDDDOOOOOSRRROOOOOOOOOOBTTTTTTTTTTTTTTTYYYYYYYYYYYBBBBBBBBOOOOOOOOOOZZZZZZZZZWWFFFFRFFFFFFOOOOOOOLLLLLLLLMWWWWWWUCULBBPBB
            KKFFFFFUIIIIDMMMDMMDDDDDOOOORROROOOOOOOOOOBTTTTTTTTTTTTTTYYYQYYYYYYYYYBBBBBBBBOOOOOOOOKZZZZZJZZFFFFFFFFFFFFFFOOOOOBBLLLLLLLWMMMMWWWWCCCBBPBB
            KFFKKFFUIMMMMMMMMMDDDDDNNOOORROOOOOOOOOOOOOTNTTOOOOTTTTOOYQQQYYYYYYYYYBVBOBBOOOOOOOOOKKZZZZJJZZFJFFFFFFFFUFFOOOOOBBBLLLLLLLWMMMMWWWCCCCBBPBB
            KKKKKFUUUMMMMMMMDDDVDNNNNOOJXXXXXXOOOOOOOUUTTTTOOOOOTTOOOQQQQYYYYYYYYNBOOOOOOOOOOOKKKKKKZZZJJJZZJJFFFFFFFFFFFOOOOBOBBBLLLLDWWWMWWWWCCCCBBBBB
            KKKKMFMMMMMMMMMMLLLNNNNNNNNXXXXXXDXOOOOOOOTTTOOOOOOOOOOOOQQYYYYYYYYYYYYYOOOOOOOOOOKKKKKZZZJJJJJSFFFFFFFFFFFFFOOOOOOBBBLLLLLWWWWWWWWCCCCBBBBB
            KKKKMMMMMMMMMMMMMNNNNNNNNNNXXXXXXXXXOOOOOOOOOOOOOOOOOXOOOQQYYYYLIIYYYYYYOOOOOOOOOOFKKKKZZZJJJJSSSSBFFFFFFFFFFFSOOOBBBBBBLLWWWWWWWWCCCCBBBBBB
            KKKKMMMMMMMMMMMHHNNNNNNNNNNNXXXXXXXXXXXOOOOJOOOBBOOOOOOOOOQQYYYLIPIYIVVVOOOOOOOOFFFFFZZZZZJJJJSSSFFFFFFFFFEWWWWWWOBBBBBBBAWWWWWWWWBBBBBBBBBB
            KKKKKKMMMMMMMMMMMNNNNNNNNNNXXXXXXXXXVXXOOOOJJBBBBBOOOTOOOIQIIRRIIIIIIIVVOOOOOOOOOOFFZZZZZZZZJJSSFFFFFFFFFWWWWWWWWBBBBBBBBAAWWWWWWWWBBBBBBBBB
            KKKKKMMMMMMMMMMMMNNNNNNNNNNXXXXXXXXVVVVOYYYBBBBBOOOOOOOOOIIIIIRIIIIIDDNNNNOOOOOOOOOFZZZZZZZZSSSSSFFFFFFFFWWWWWWWWBBBBBBBAAAWWAWWWWBBBBBBBBBB
            KKKMMMMMMMMMMMMMTNNNNNTNNTNXXXXXSXXVVVVOYYYBBBBBBOOOOOOOOIIIIIIIIIIDDDDNNOOOOLOOOODFZZZZZZZZSSSSSSSFQFFFFWWWWWWWWBBBBBBBBAAAWAAAWWBBBBBBBBBB
            KKKKKKMMMMMMMMDDNNNTNTTTTTTJXXSSSHVVVHVVYVYBBHBJBOOOOOOOOIIIIIIIIIDDDDNNDDOOOLXOOODZZZZZZZZZSSSSSSSQQFIFWWWWWWWBBBBBBBBBBAAAAAAAABBBBBBBBBBB
            KKKKKKMMMMMMMMMLLNNTTTTTTLTJJXSSSHHHHHVVVVYYBBBBOOOOOOOOOOIIIIIIIIDDDDDDDDDDOXXXDDDDZQZZZZZZCCCOSSQQQFWWWWWWWWWWBBBBBBBBBBBAAAAAAABBBBBBBBXX
            KKKKKMMMMMMMMMMMLNTTTTTTTTTJJXSSHHHHHHHYYVVYBBBBOOOOOOOUUUIIIIIIIIDDDDDDDDDDXDXXXDDDZZZZZZZZZZGGGGGGGGGGWWWWWWWWBBBBBBBBBBBBAAAAAATTTTBBXXXX
            UUUKZZDDZMMMMMMMLLLTLTTTTTJJJJHHHHHMMHHYYYYYBVVBOOOOOOOUUUUUIIIIIIGGDDGGDDXXXXXXXXXDZDZXIZIIOOGGGGGGGGGGWWWWWWWWBBBBBBBBBBBBBAAATTTBBBBXZZXX
            UUUZZZZZZMMMMMMLLLLTLTTTTTTTTTWHHHHMMMBYYYYBBBBBBBOOOOOUUUUIIIIIIIGGGGGDDXXXXXXXXXXDDDDIIIIIOOGGGGGGGGGGMMMWWWWWBBBBBBBBBBBBBAAATTTTXXXXXXXX
            UUZZZZZZZLMMMMLLLLLLLLTTTTTTSSHHHTTZMMBBYBYBBBBBBUOOUUUUUUIIIIIIIIGGGGGGXXXXXXXXXXXXDDDDIDIIIIGGGGGGGGGGMMMWWMMMMBBBBBBBBBBBBBAATTTTKKXFXXXX
            UUZZZZZZZLLMMMLLLLLLLLTTTTSSSSSSSZZZZBBBBBBBBBBBBUUUUUUUUUIIIIIIIGGGGGGXXXXXXXXXXXXXXMDDDDDIIIGGGGGGGGGGMMMWWMMMMMBBBBBBBBBBBBTTTTTTTTXXXXXX
            ZZZZZZZZZLLLLMLLLLLLLLTTTTSSSSSSSSZZZZUBBBBBBJBBUUUUUUUUUUIIIIIIIGGGGGGXXXXXXXXXXXXKMMDDDDDDIIGGGGGGGGGGMMMWMMMMMMBBBBBBBBBBEEEETTTTTTXXXXXX
            ZZZZZZZZLLLLLLLLLLLLLLTSSSSSSSSSSSSZZUUBBBBBBBBBBUUUUUUUUUIIIIIIIGGGGGGDXXXXXXXXXXXXMMMDDDDDDIGGGGGGGGGGMMMWMMMMBBBBBBBBBBBBETTTTTTTTSTHHHHH
            ZZZZZZZZLLLLLLLLLLLLLLSSSSVVVVSSSSSZSSSSBBBBBBBBRRUUUUUUUUIIIIIIIGGGGGDDDXXXXXXXXXXMMMMMMMDDIIGGGGGGGGGGGGGMMMMQBBBBBBBBBBBTTTTTTTTTTTTTHHHH
            ZZZZZZZZLLLLLLLLLLLLSSSSSSSVZZSSSSSSSSSSBBBBOOOORUUUUUUUUIIIIIIIGGGGGGDDDDXXXXXXXXXMMMMMMDDDIIGGGGGGGGGGGGGQMQQQBBBBBBBBBBCCTTTTTTTTTTTTHHHH
            ZZZZZZZLLLLLLLLLLLLLSSSSSSSJZJSSIISSSSSXXBBOOOORRKRRRUUUUUUUUUGGGGGGGGGGDXXXXXXXXXXMMMMMDDDDDIIGGGGGGGGGGGGQQQQQQBBBBBBBCCCCTTTTTTTTTTTTHHHH
            ZZZZZZLLLLLLLLLLLLLSSSSSSSSJJJJJJIIISYTYYYYYORRRRRRRRUZZZZZUGGGGGGGVXGXXXXXXXXXXNXMMMMMMMDDDDHIGGGGGGGGGGGGQQQQQQYBBBBBBBCCCCBTTTTTTTTTTHHHH
            ZZZZZZLLLLLLLLLGGGSSSSSSSSSSSJJJJJIIIYYYYYYOORRRRRRRRUZZZZZZZZGGVGVVXXXXXXXXXXXXXMMMMMMMDDDDHHHGGGGGGGGGGGGQQQQQQQQQQZZBBBBBCBDTTTTTTTTTTHHH
            ZFZZZZZLLLLLGGLGGGGGGSSSSSSSSJJJJJJIKYYYYYYRRRRRRRRRRZZZZZZZZVVVVVVVVXXXXXSSXXXBXMMMMMMMHDDHHHHGGGGGGGGGGGGQQQQQQQQQQQZZZBBBBBBEEEETTTTTTHHH
            VFFZZZZZLLLGGGGGGGGGGSSSSSSSSSJJJJJYYYYYYYYYYRRRRRRWZZZZZZZNNQQIVIVVXXXXDXXXXXXBYMMMMMMMHHHHHHHGGGGGGGGGGGGGQQQQQQQQQQZZZBZBBBBEEEEKTKTTTKHK
            VFFZZZZZLLLGGGGGGGGGYYSSUUUUPPJJJKJYYYYYYYYYYRRRRRRRRRZZZZCCNNQIIIVXXXXXXXXPPYYBYMMMMMMMHHHHHHHGGGGGGGGGGGGGQQQQQQQQQQQZZZZZBEEEEEKKKKKKKKKK
            VVFFZZLLLLGGGGGGGGGGGGSSUUUUPPJGJKKYYYYYYYYYYRRRRRRRRRZZZZCCCQQIIIXXXXXXXXXPYYYYYMMMMMMMHHHHHHHGGGGGGGGGGGGGQQQQQQQQQQQZZZZBBEEEEEKKKKKKKKKK
            VVFFZZLLLLLFGGGGGGGGGGGWUUUUPPKKKKKKYYYYYYYYRRRRRRRRRZZZZZCCQQQIIIIXXXXXXXXPYYYYYYYMMMMMMGGGGGGGGGGGHSPPKKQQQQQQQQDDPDQZZOOOOEOOOOKKKKKKKKKK
            VVVZZZVLLGGGGGGGGGGGGGGWUUUUPPKKBKKKYYYYYYYYRRRRRRZZZZZZCCCCCIIIIIIIIIIIIIXYYYYYYYYYMMMMMGGGGGGGGGHHHHKKKKQQQQQQQDDDDDDZZZOOOEOOOOKKKKKKKKKK
            VVVZZVVVLLUGGGGGGGGGGGWWWPPPPKKKKKKKYYYYYYYYRRRRRRRZZZCCCCCCCCIIIIIIIIIIIIIYYYYYYYYYYMMMMGGGGGGGGGHHHHKKKKQQQQQQQDDDDZZZZZZOOEOOODKKKKKKKKKK
            VVVVVVVVVVUGGGGGGGGGGGHHHPPPPPPKKKKKYYYYYYYYRRZZRRZZZCCCCCCCDCIIIIIIIIIIIIIYIYYYYYYYMMMMMGGGGGGGGGOHHHHHHKKKQKQQQQDDDZZKZZOOOOOOOOKKKKKKKKKE
            VVVVVVVUUUUGGGGGUGUUUUHHHPPPPPPKKKKKKKYYYYYZRRZZZZZZZZZZCCCCCCIIIIIIIIIIIIIIIYYYYYMMMMMMMJJJHHHHHOOUHQHKKKKKKKKQQQQQZZKKZVVVOOOOOOOMMKKKKKKE
            VVRVVUVUUUUUUUUUUUUUUUHPPPPPPPPKKKPPKPYYYYYZZZZZZZZZZZZZCCCCCCCIIIIIIIIIIIIIIIIYYYYMMMMJJJJJHHHHHOOUHHKKKKKKKKKKQQKKKKKZZVVVOOOOOOOOOOOSKSSS
            VRRUUUUUUUUUUUUUUUUUUUHHPPPPPPPKKPPPPPYYYYYZZZZZZZZZNZZCCCCCCCCCCIIIIIIIIIIIIIYYYYYYMMMJJVVJJHHHHHOUHKKKKKKKKKKKKKKKKYVVVVVVOOOOOOOOOOSSKSSS
            VVRRRUXXUUUUUUUUUUUUUUHHPHPPPPPPPPPPPPYYYYYZZZZZZZZZNNZCCCCCCCCCCIICCIIIIIIIEIYYYYYYMYVVVVRVJJHOTOOHHKIKKKKYYYKKKKYKKVVVVVVVVOOOOOOOOASSSSSS
            VVUUUUXXUUUUUUUUUUUUUUHHHHHPPPPPPPPPPPPZZZZZZZZZZZZNNNCCCCCCCCCCCCCCIIIIIIEEEEYYYYYYMMFVVVVVVOOOOOOPHKIKKKKYAYYYYYYEVVVVVVVVVOOOOOOOSSSSSSSS
            VUUUUUUUUUUUUUUUUUSSUUHHHPPPPPPPPPPPPPZZZZZZZZZZZZZNNICCCCCCCCCCCJCIIIIIIIEEEYYYYYYMMYYVVVVVVWOOOOOOOIIIIKKYYYYYYYYVVVVVVVVVVOOOOOOWSSSSSSSS
            UUUUUUUUUUUUUUUUUUUUUUHHHPPPPPPPPPPPPPMZZZZZZZZYYZZNNCCCCCCCCCCCCJIIIIIIIIEEEEYYYYYMMYYYYYYWWWOOOOOOOIIIIIIVYYYYYYYVVVVVVVVVVOEOOOUSSSSSSSSS
            UUUUUUUUUUUUUUUUUUHHHHHHSXXPPPPPPPPPPPMZZZZZZZZYYYYYNNTTCCCCCCCCCJIIIIIIIEEEEEEYYYYYYYYYYLJWJWOOOOIIIIIIIIIYYYYYYYYDVVVVVVVVVOOOCUUUUSSSSSSS
            UUUUUUUUUUUUUUUUUHHHHHHHSSXPPPPPPPPPPMMMZJYYZZZYYYYYNNNNCCCCCCCCCJJJIIIIIFFEEEEYYYYYYYYYYYJJJJJOOOOOIIIIIIYYYYYYYYDDVVVVVVVVVCCCCCCUSSSSSSSS
            QQBBBUUUBVVUUUUUHHHHHHSSSSSPPPPPPPPPPMMMMYYYYYYYYYYJNNSDDDCCCCCJJJJJJJIIIFYEYYYYYYYYYYYYJJJJJJJOORRRIIIIYYYYYYYYYYVVVVVVVVVVCCCCCCCSSSSSSSSS
            QQQBBUBBBBBBQQQHHHHHHSSSSSSLPPPPMMMMMMMMMYYYYYYYYYYYYYSSDDCRCCJJJJJJJJJJIFYYYYYYYYYYYYYJJVJJJJJOORJJIIIIIYYYYYYYYVVVVVVVVVVJCCCCCCSSSSSSSSSS
            QQQBBBBBBBBBBBQHHHHHHHVSSLLLPPLMMMMMMMMMMYYYYYYYYYYYYPSSSDSRRBBJBJJJJJJWFFWYYYYYYYYYYYYJJJJJJJJJJJJIIIIYYYYYYYYYYIIIIVIIIVVCCCCCCCCCSCSQSSSS
            BBBBBBBBBBBBBBBYHHHVHAVSLLLLLPLMMMMMMMMMMYYYYYYYYYYYPPSSSSSSSNBBBJJJJJWWFWWYYYYYYYYNNNCCCJJJJJJJJJJJIIIYYYYYYYYYYYIIIIIIIIVCCNCNCCCCSCCSSSSS
            BBBBBBBBBBBBBBBVVVVVVVVVVVLLLLLLMMMMMMMMMYYYYYYYYYYYPSSSSSSSSBBBBJJJJJWWWWWYYYYYYYYNNNCCCJJJJJJJJJJJJIIYYYYYYYYYYYIIIIIIIIIIBNCCCCCCCCSSSSSC
            BBBBBBBBBBBBBBVVVVVVVVVVLLLLLLLLLLMMMMMMMYYYYYYYYYYYYSSSSSSSBBBBBJJJWWWWWWWWWYYYYNNNNNCCJJJJJJJJJJJJJIIYYYYYYYYYYIIIIIIIIIIINNNNNCCCCCSCSCSC
            BBBBBBBBBBBBBBVVVVVVVVVVVLLLLLLLLMMMMMMMMMYYYYYYYYYYYMSSSSSSBJJJJJJJJJWWWWWWWYYYYYNNNNJJJJJJJJJJJJJJJIIIYYYYYYYYYIIIIIIIIIIINNNNNCCCCCCCSCCC
            BBBBBBBBBBBBBVVVVVVVVVVVLLLLLLLLLLMMMMMMMMYYYYYYYYYYYSSSSSSSBJJJJJJJJWWWWWWWWYYYXXNNNNNNJJJJJJJJJJJJUIYYYYYYMYYYYCIIIIIIIIIINNNNCCCCCCCCCCCC
            BBBBBBBBBBBBBBVVVVVVVVVLLLLLLLLLLLMMMMMMMMMMYYYYYYYYYESSSSSJJJJJJJJJJWWWWWWWWWWXXXXNNNJJJJJJJJJJJJJJUIIYYYYYYYYYIIIIIIIIIIIINNNNCCCCCCCCCCCC
            BBBBBBBBBBBBBBVVVVVVVVLLLLLLLLLLLLMMMMVMMMMMMFFFFFYYYEEEEESJJJJJJJJWWWWWWWWWWWWXXNNNNNNNNJJJJJJJJJJJJIIZZYYYYYYYYIIIIIIIIIICCCCCCCCCCCCCCCCC
            """;
}
