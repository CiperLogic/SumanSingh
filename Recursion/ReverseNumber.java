// 006
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print(reverse(1234, 4));
    }
    public static int reverse(int n, int len) {
        if(n == 0)
            return 0;
        return n%10 * power(10, len - 1) + reverse(n/10, len - 1);
    }
    public static int power(int x, int y) {
        if(y == 0)
            return 1;
        return x * power(x, y-1);
    }
}

/**
 *  reverse(1234, 4)                                                                                   ->                                  4321
 *  |- 4 * pow(10, 3) + reverse(123, 3)                                                                ->                  4000 + 321      ^
 *                      |- 3 * pow(10, 2) + reverse(12, 2)                                             ->              300 + 21    ^
 *                                          |- 2 * pow(10, 1) + reverse(1, 1)                          ->        20 + 1      ^
 *                                                              |- 1 * pow(10, 0) + reverse(0, 0)      ->  1 + 0      ^
 */
