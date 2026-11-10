import java.util.*;
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new PowerOfTwo().isPowerOfTwo(sc.nextInt()));
    }
}
