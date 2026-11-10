import java.util.*;
public class ConvertToHexadecimal {
    public String toHex(int num) {
        return Integer.toHexString(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new ConvertToHexadecimal().toHex(sc.nextInt()));
    }
}
