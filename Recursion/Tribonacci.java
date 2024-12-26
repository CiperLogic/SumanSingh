//008
public class Tribonacci {
    public static void main(String[] args) {
        System.out.print(tribo(8));
    }
    public static int tribo(int n) {
        if(n == 0 || n == 1)
            return 0;
        else if(n == 2)
            return 1;
        return tribo(n-3) + tribo(n-2) + tribo(n-1);
    }
}

/**
 * Ex. tibonacci series > 0 0 1 1 2 4 7 13  24 ....
 *              Index   > 0 1 2 3 4 5 6  7  8 ....
 *  so, tri(6) = 8
 *
 *                                                                                 tri(4)
 *                                       V-------------------------------------------V-----------------------------------------v
 *                                    tri(3)                   +                   tri(2)                  +                 tri(1)
 *              V-----------------------v--------------------V
 *            tri(2)         +        tri(1)        +      tib(0)
 * */

