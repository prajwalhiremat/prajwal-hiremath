class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[102];
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }
}
