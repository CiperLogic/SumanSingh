//010
public class DecimalToOctal {
    public static void main(String[] args) {
        System.out.print(toOctal(15));
    }
    public static int toOctal(int n) {
        if(n < 8)
            return n;
        return toOctal(n/8) * 10 + n%8;
    }
}