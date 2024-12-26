//012
public class RemoveCharFromString {
    public static void main(String args[]) {
        String s = "Suman";
        System.out.print(remove(s, 'n', s.length()-1));
    }
    public static String remove(String s, char ch, int len) {
        if(len < 0)
            return "";
        if(s.charAt(len) == ch)
            return remove(s, ch, len-1);
        return remove(s, ch, len-1) + s.charAt(len);
    }
}