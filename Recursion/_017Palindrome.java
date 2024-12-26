public class _017Palindrome {
    public static void main(String []args) {
        String s = "madam";
        System.out.print(palindromeChekc(s, 0, s.length()-1));
    }
    public static boolean palindromeChekc(String s, int start, int end) {
        if(end <= start)
            return true;
        if(s.charAt(start) == s.charAt(end))
            return palindromeChekc(s, ++start, --end);
        return false;
    }
}
