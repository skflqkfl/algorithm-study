import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result1 = recursionFib(n);
        int result2 = dynamicFib(n);
        System.out.println(count1 + " " + count2);
    }

    static int recursionFib(int n) {
        if (n <= 2) {
            count1++;
            return 1;
        }

        return recursionFib(n - 1) + recursionFib(n - 2);
    }

    static int dynamicFib(int n) {
        int[] memory = new int[n + 1];

        memory[1] = 1;
        memory[2] = 1;

        for (int i = 3; i <= n; i++) {
            count2++;
            memory[i] = memory[i - 1] + memory[i - 2];
        }

        return memory[n];
    }
}