import java.util.*;
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) count[magazine.charAt(i) - 'a']++;
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            if (--count[index] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ransom = sc.next();
        String magazine = sc.next();
        System.out.println(new RansomNote().canConstruct(ransom, magazine));
    }
}
