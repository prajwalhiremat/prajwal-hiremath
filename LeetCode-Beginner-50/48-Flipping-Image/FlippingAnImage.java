import java.util.*;
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;
            while (left <= right) {
                int a = row[left] ^ 1;
                int b = row[right] ^ 1;
                row[left] = b;
                row[right] = a;
                left++;
                right--;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] image = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) image[i][j] = sc.nextInt();
        System.out.println(Arrays.deepToString(new FlippingAnImage().flipAndInvertImage(image)));
    }
}
