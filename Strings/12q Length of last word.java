class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int length = 0;
        for (int i = trimmed.length() - 1; i >= 0; i--) {
            if (trimmed.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
    }
}
