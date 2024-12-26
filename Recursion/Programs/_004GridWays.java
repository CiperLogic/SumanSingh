package Programs;

public class _004GridWays {
    public static void main(String[] args) {
        System.out.println(ways(0,0,3,3));
    }
    public static int ways(int x, int y, int n, int m) {
        if(x == n || y == m)
            return 0;
        if(x == n-1 || y == m-1)
            return 1;
        int val1 = ways(x+1, y, n, m);  //top to bottom
        int val2 = ways(x, y+1, n, m);  //left to right
        return val1 + val2;
    }
}

/**
 *                                                                                                               0        1       2
 *                                                                                                            _________________________
 *                                          ways(0,0,3,3)=6                                             0    |       |        |       |
 *                                        /              \                                                   |_______|________|_______|
 *                          ways(1,0,3,3)=3              ways(0,1,3,3)=3                                1    |       |        |       |
 *                        /             \               /              \                                     |_______|________|_______|
 *           ways(2,0,3,3)=1    ways(1,1,3,3)=2       ways(1,1,3,3)=2   ways(0,2,3,3)=1                 2    |       |        |       |
 *                                 /      \               /          \                                       |_______|________|_______|
 *                    ways(2,1,3,3)   ways(1,2,3,3)   ways(2,1,3,3)   ways(1,2,3,3)
 *                        1               1               1               1
 * */