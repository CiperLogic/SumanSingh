package Backtraking;

public class NQueensProblem {
    public static void main(String[] args) {
        char[][] a = new char[3][3];
        populateBoard(a);
        nQueens(a, 0);
    }
    public static void nQueens(char[][] a, int row) {
        if(row == a.length) {
            System.out.print("----------------");
            printBoard(a);
            return;
        }
        for(int i=0; i<a.length; i++) {
                if(safe(a,row,i)) {
                    a[row][i] = 'Q';
                    nQueens(a, row+1);
                    a[row][i] = 'X';
                }
        }
    }
    public static boolean safe(char[][] a, int row, int col) {
        // CASE I: Vertical Up
        for(int i=0; i<row; i++) {
            if(a[i][col] == 'Q')
                return false;
        }
        // CASE II: Diagonal Leftup
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--) {
            if(a[i][j] == 'Q')
                return false;
        }
        // CASE III: Diagonal Rightup
        for(int i=row-1,j=col+1; i>=0 && j<a.length; i--, j++) {
            if(a[i][j] == 'Q')
                return false;
        }
        return true;
    }
    private static void printBoard(char[][] a) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void populateBoard(char[][] a) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                a[i][j] = 'X';
            }
        }
    }
}
