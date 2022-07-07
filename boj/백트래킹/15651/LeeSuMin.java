import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    /**
     * 시간 초과 -> StringBuilder 사용하여 해결
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        solve(0, new int[M]);
        System.out.println(sb.toString());
    }

    static void solve(int len, int[] val) {
        if (len >= M) {
            for (int v : val) {
                sb.append(v + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            val[len] = i + 1;
            solve(len + 1, val);
        }

    }
}