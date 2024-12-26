// 002

public class MultiplyTwoNumbers {
    public static void main(String []args) {
        System.out.print(multiply(2, 5));
    }
    public static int multiply(int n, int m) {
//        System.out.println(n + " " + m);
        if(n==0 || m==0)
            return 0;
        if(n < m)
            return m + multiply(m, n-1);
        return n + multiply(n, m-1);
    }
}
