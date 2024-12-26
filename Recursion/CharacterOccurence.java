//011
public class CharacterOccurence {
    public static void main(String args[]) {
        String s = "Suman Singh";
        System.out.println(countChar(s, s.length()-1, 'S'));
    }
    public static int countChar(String s, int len, char ch) {
        if(len < 0)
            return 0;
        if(s.charAt(len) == ch)
            return 1 + countChar(s, len-1, ch);
        return countChar(s, len-1, ch);
    }
}