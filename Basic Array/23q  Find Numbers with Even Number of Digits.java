class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            // Convert the number to a string to easily count its digits
            String s = String.valueOf(num);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}
