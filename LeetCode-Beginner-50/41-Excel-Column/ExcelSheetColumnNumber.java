import java.util.*;
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++)
            result = result * 26 + columnTitle.charAt(i) - 'A' + 1;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new ExcelSheetColumnNumber().titleToNumber(sc.next()));
    }
}
