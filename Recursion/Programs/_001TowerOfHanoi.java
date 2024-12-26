package Programs;

public class _001TowerOfHanoi {
    public static void main(String []args) {
        resolve(3, "source", "temp", "destination");
    }
    public static void resolve(int n, String src, String temp, String dest) {
        if(n==1) {
            System.out.println("move disk " + n + " from " + src + " to " + dest);
            return;
        }
        resolve(n-1, src, dest, temp);
        System.out.println("move disk " + n + " from " + src + " to " + dest);
        resolve(n-1, temp, src, dest);
    }
}

/***
 *  7 steps:
 *              t(3)
 *             /    \
 *         t(2)     t(2)
 *        /    \     /  \
 *   t(1)    t(1)  t(1) t(1)
 *
 * output:
 *          move disk 1 from source to destination
 *          move disk 2 from source to temp
 *          move disk 1 from destination to temp
 *          move disk 3 from source to destination
 *          move disk 1 from temp to source
 *          move disk 2 from temp to destination
 *          move disk 1 from source to destination
 */