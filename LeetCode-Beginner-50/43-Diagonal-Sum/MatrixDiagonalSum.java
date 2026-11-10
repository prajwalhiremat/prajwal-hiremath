import java.util.*;
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            if (i != n - 1 - i) sum += mat[i][n - 1 - i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
        System.out.println(new MatrixDiagonalSum().diagonalSum(mat));
    }
}
