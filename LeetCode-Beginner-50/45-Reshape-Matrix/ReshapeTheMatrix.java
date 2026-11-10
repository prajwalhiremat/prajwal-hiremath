import java.util.*;
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        if (rows * cols != r * c) return mat;
        int[][] result = new int[r][c];
        for (int i = 0; i < rows * cols; i++)
            result[i / c][i % c] = mat[i / cols][i % cols];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) mat[i][j] = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Arrays.deepToString(new ReshapeTheMatrix().matrixReshape(mat, r, c)));
    }
}
