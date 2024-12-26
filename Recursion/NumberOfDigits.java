// 004
public class NumberOfDigits {
    public static void main(String[] args) {
        System.out.print(countDigits(1234));
    }
    public static int countDigits(int n) {
        if(n == 0)
            return 0;
        return 1 + countDigits(n/10);
    }
}

/*
*       countDigits(1234)                                           ->                      4
*           |- 1 + countDigits(123)                                 ->              1 + 3   ^
*                      |- 1 + countDigits(12)                       ->          1 + 2   ^
*                               |- 1 + countDigits(1)               ->      1 + 1   ^
*                                          |- 1 + countDigits(0)    ->  1 + 0   ^
* */