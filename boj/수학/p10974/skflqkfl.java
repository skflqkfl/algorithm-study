package boj.수학.p10974;

import java.util.*;

public class skflqkfl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] target = new int[N];
        int[] output = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            target[i] = i+1;
        }

        permutation(target, output, visited, 0, N, N);

    }

    static void permutation(int[] target, int[] output, boolean[] visited, int depth, int n, int r) {
        if(depth == r) {
            for (int i : output) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(visited[i] == false) {
                visited[i] = true;
                output[depth] = target[i];
                permutation(target, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
}
