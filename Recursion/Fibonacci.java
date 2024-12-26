// 0007
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(fib(8));
    }
    public static int fib(int index) {
        if(index == 0 || index == 1)
            return index;
        return fib(index-1) + fib(index-2);
    }
}

/**
 * Ex. fibonacci series > 0 1 1 2 3 5 8 13 21 ....
 *              Index   > 0 1 2 3 4 5 6 7  8 ....
 *  so, fib(6) = 8
 *
 *                                                                                fib(4)
 *                                                                   V-----------------------------V
 *                                                                fib(3)            +                          fib(2)
 *                                          V-------------------------------------------V              V-------------------V
 *                                        fib(2)                    +                 fib(1)        fib(1)      +       fib(0)
 *                                        0
 *                                    V------------V
 *                                  fib(1)  +   fib(0)
 * */