import java.util.*;
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) wealth += money;
            richest = Math.max(richest, wealth);
        }
        return richest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) accounts[i][j] = sc.nextInt();
        System.out.println(new RichestCustomerWealth().maximumWealth(accounts));
    }
}
