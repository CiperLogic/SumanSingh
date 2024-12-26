//009
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.print(toBinary(11));
    }
    public static int toBinary(int n) {
        if(n == 1 || n == 0)
            return n;
        return toBinary(n/2) * 10 + n%2;
    }
}

/**
 * toBinary(4)                          ->                             100
 * |- toBinary(4/2) * 10 + 4%2          ->              10 * 10 + 0    ^
 *      |- toBinary(2/2) * 10 + 2%2     -> 1 * 10 + 0   ^
 *
 * */