package Programs;

public class _003StringDiffCombinations {
    public static void main(String[] args) {
        combinations("abc","");
    }
    public static void combinations(String s, String ans) {
        if(s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++) {
            // get char from s
            char ch = s.charAt(i);
            // remove char from s
            String s1 = s.substring(0, i) + s.substring(i+1);
            // put char into ans
            combinations(s1, ans+ch);
        }
    }
}

/**
 *
 * Combinations:
 * a    1!    --  a
 * ab   2!    --  ab, ba
 * abc  3!    --  abc, acb, bac, bca, cab, cba
 *
 *                                                      combination("abc","")
 *                                                   0/         1|            2\
 *                             combination("bc","a")   combination("ac","b")    combination("ab","c")
 *                           0/           1\               0/       1\              0/              1\
 *      combination("c","ab")   combination("b","ac")      |         |       combination("b","ca")   combination("a","cb")
 *       |                       |                        /          \                          |               |
 *       |                       |         combination("c","ba")   combination("a","bc")        |               |
 *       |                       |                       |            |                         |               |
 * combination("","abc")    combination("","acb")        |            |         combination("","cab")       combination("","cba")
 *                                                       |            |
 *                                         combination("","bac")    combination("","bca")
 *
 */