package Programs;

public class _002SubSet {
    public static void main(String []args) {
        subset("abc", "", 0);
    }
    public static void subset(String s, String ans, int index) {
        if(index == s.length()) {
            System.out.println(ans);
            return;
        }
        subset(s, ans + s.charAt(index), index+1);
        subset(s, ans, index+1);
    }
}

/**
 *  ((2^n) - 1) subsets where n in the number of char in the given string
 *
 *  2^3 - 1 = 7 subsets for "abc"
 *
 *                                                                        subset("abc","",0)
 *                                                                      /                   \
 *                                                   subset("abc","a",1)                      subset("abc","",1)
 *                                                 /                    \                       /               \
 *                             subset("abc","ab",2)         subset("abc","a",2)       subset("abc","b",2)       subset("abc","",2)
 *                        /         \                           /          \                     \     \       /                \
 *  subset("abc","abc",3)    subset("abc","ab",3)    subset("abc","ac",3)  subset("abc","a",3)   |     |  subset("abc","c",3)   subset("abc","",3)
 *                                                                                              /      \
 *                                                                            subset("abc","bc",3)    subset("abc","b",3)
 *
 *
 */
