import java.util.*;
public class SqrtX {
    public int mySqrt(int x) {
        if (x < 2) return x;
        long left = 1;
        long right = x / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == x) return (int) mid;
            if (square < x) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new SqrtX().mySqrt(sc.nextInt()));
    }
}
