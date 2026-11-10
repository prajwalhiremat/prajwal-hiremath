import java.util.*;
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for (int num : nums) if (num != 0) nums[position++] = num;
        while (position < nums.length) nums[position++] = 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
