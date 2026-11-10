import java.util.*;
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[i].length; j++)
                if (matrix[i][j] != matrix[i - 1][j - 1]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matrix[i][j] = sc.nextInt();
        System.out.println(new ToeplitzMatrix().isToeplitzMatrix(matrix));
    }
}
