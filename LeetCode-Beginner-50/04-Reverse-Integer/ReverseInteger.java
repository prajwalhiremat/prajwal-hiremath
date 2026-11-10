import java.util.*;
public class ReverseInteger {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        }
        return (int) result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new ReverseInteger().reverse(sc.nextInt()));
    }
}
