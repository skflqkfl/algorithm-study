import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] memory = new int[17];
        int[][] arr = new int[n + 1][2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int date = n; date > 0; date--) {
            int period = arr[date][0];
            int price = arr[date][1];
            if (date + period > n + 1)
                memory[date] = memory[date + 1];
            else
                memory[date] = Math.max(memory[date + 1], price + memory[date + period]);
        }
        System.out.println(memory[1]);
    }
}