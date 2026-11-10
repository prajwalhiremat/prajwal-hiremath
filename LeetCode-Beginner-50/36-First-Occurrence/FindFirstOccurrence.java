import java.util.*;
public class FindFirstOccurrence {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i + needle.length() <= haystack.length(); i++)
            if (haystack.substring(i, i + needle.length()).equals(needle)) return i;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        System.out.println(new FindFirstOccurrence().strStr(haystack, needle));
    }
}
