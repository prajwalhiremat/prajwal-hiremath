import java.util.*;
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= n - 1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new NumberOfOneBits().hammingWeight(sc.nextInt()));
    }
}
