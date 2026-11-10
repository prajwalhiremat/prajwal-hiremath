import java.util.*;
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new ClimbingStairs().climbStairs(sc.nextInt()));
    }
}
