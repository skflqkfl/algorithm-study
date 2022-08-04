import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coins = {1, 2, 5, 7};
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 100001);
        dp[0] = 0;
        for (int coin : coins)
            for (int i = coin; i <= n; i++){
                if (dp[i - coin] != 100001) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        System.out.println(dp[n]);
    }
}