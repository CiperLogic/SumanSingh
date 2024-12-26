// 001

public class Factorial {
    public static void main(String args[]) {
        System.out.print(mul(5));
    }
    public static int mul(int n) {
        if(n == 0)
            return 1;
        return n * mul(n-1);
    }
}