import java.util.*;
public class CountNegativeNumbers {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid)
            for (int value : row) if (value < 0) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) grid[i][j] = sc.nextInt();
        System.out.println(new CountNegativeNumbers().countNegatives(grid));
    }
}
