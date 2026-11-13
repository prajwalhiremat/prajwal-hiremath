class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n <= 1) {
            return true;
        }

        boolean allCaps = Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1));
        boolean allLower = Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1));
        boolean firstCapOnly = Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1));

        if (allCaps) {
            for (int i = 2; i < n; i++) {
                if (!Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } else if (allLower || firstCapOnly) {
            for (int i = 2; i < n; i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            return false;
        }

        return true;
    }
}
