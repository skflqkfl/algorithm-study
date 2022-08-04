import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[] memory = new int[16];
    static int[][] arr;
    static int max, sum, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        solve(n + 1);
        System.out.println(max);
    }

    static void solve(int date) {
        for (int d = date - 1; d > 0; d--) {
            int period = arr[d][0];
            int price = arr[d][1];

            if (d + period - 1 >= date) continue;

            sum += price;

            solve(d);

            memory[d] = sum;
            max = Math.max(max, memory[d]);
            sum -= price;
        }
    }
}