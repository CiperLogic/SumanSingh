// 005
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print(sum(1234));
    }
    public static int sum(int n) {
        if(n == 0)
            return 0;
        return n%10 + sum(n/10);
    }
}

/*
*   sum(1234)                                   ->                      10
*     |- 4 + sum(123)                           ->              4 + 6   ^
*              |- 3 + sum(12)                   ->          3 + 3   ^
*                      |- 2 + sum(1)            ->      2 + 1   ^
*                               |- 1 + sum(0)   ->  1 + 0   ^
*
* */