package Programs;

public class MobileKeyPadCombinations {
    private static final char[][] L = {
            {},//0
            {},//1
            {'a','b','c'},//2
            {'d','e','f'},//3
            {'g','h','i'},//4
            {'j','k','l'},//5
            {'m','n','o'},//6
            {'p','q','r','s'},//7
            {'t','u','v'},//8
            {'w','x','y','z'}//9
    };
    public static void main(String[] args) {
        letterCombination("23");
    }
    private static void letterCombination(String keys) {
        StringBuffer sb = new StringBuffer();
        if(!keys.isEmpty()) {
            method(0, keys.length(), sb, keys);
        }
    }

    private static void method(int i, int length, StringBuffer sb, String ckeyNum) {
        if(i == length) {
            System.out.println(sb.toString());
        } else {
            char[] keys = L[Character.getNumericValue(ckeyNum.charAt(i))];
            for(int j=0; j<keys.length; j++)
                method(i+1, length, new StringBuffer(sb).append(keys[j]), ckeyNum);
        }
    }
}


/**
 *
 *
 *
 *
 *
 *
 * */