import java.util.*;
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int pairs = 0;
        for (int num : nums) {
            int count = counts.getOrDefault(num, 0);
            pairs += count;
            counts.put(num, count + 1);
        }
        return pairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(new NumberOfGoodPairs().numIdenticalPairs(nums));
    }
}
