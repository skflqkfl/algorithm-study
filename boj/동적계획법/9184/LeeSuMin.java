import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][][] memory = new int[21][21][21];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1) break;
            int d = solve(a, b, c);
            System.out.println("w(" + a +", " + b + ", " + c +") = " + d);
        }
    }

    static int solve(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) return 1;
        if (a > 20 || b > 20 || c > 20) return solve(20, 20, 20);

        if (memory[a][b][c] != 0) return memory[a][b][c];

        memory[a][b][c] = a < b && b < c ? solve(a, b, c-1) + solve(a, b-1, c-1) - solve(a, b-1, c)
                                           : solve(a-1, b, c) + solve(a-1, b-1, c) + solve(a-1, b, c-1) - solve(a-1, b-1, c-1);
        return memory[a][b][c];
    }

}