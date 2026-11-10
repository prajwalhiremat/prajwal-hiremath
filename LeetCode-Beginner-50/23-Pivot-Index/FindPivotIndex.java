import java.util.*;
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) total += num;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(new FindPivotIndex().pivotIndex(nums));
    }
}
