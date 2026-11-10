import java.util.*;
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];
            if (a > b) {
                result[i] = a;
                left++;
            } else {
                result[i] = b;
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(Arrays.toString(new SquaresOfSortedArray().sortedSquares(nums)));
    }
}
