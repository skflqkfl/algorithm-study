package boj.구현.p15649;
/*
https://st-lab.tistory.com/114#%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class skflqkfl {
    static int N, R;
    static int[] input, output;
    static boolean[] visited;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        input = new int[N];
        output = new int[R];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            input[i] = i+1;
        }

        sb = new StringBuilder();

        permutation(0);
        System.out.println(sb);

    }
    static void permutation(int depth) {
        if(depth == R) {
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(' ');
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            output[depth] = input[i];
            permutation(depth + 1);
            visited[i] = false;
        }
    }
}
