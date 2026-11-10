import java.util.*;
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) max = Math.max(max, candy);
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) result.add(candy + extraCandies >= max);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) candies[i] = sc.nextInt();
        int extra = sc.nextInt();
        System.out.println(new KidsWithCandies().kidsWithCandies(candies, extra));
    }
}
