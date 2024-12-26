//003

public class XToThePowerY {
    public static void main(String[] args) {
        System.out.print(power(5, 3));
    }
    public static int power(int x, int y) {
        if(y == 0)
            return 1;
        return x * power(x, y-1);
    }
}

/*
*   |-power(5,3)                                ->                     125
*       |- 5 * power(5, 2)                      ->          5 * 25      ^
*               |- 5 * power(5, 1)              ->      5 * 5   ^
*                       |- 5 * power(5, 0)      ->  5 * 1   ^
*
* */