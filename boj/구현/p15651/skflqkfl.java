package boj.구현.p15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class skflqkfl {

    static int N, R;
    static int[] input, output;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        input = new int[N];
        output = new int[R];
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            input[i] = i+1;
        }

        permutation(0);
        System.out.println(sb);
    }
    private static void permutation(int depth) {
        if(depth == R) {
            for (int i = 0; i < output.length; i++) {
                sb.append(output[i]).append(' ');
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            output[depth] = input[i];
            permutation(depth + 1);
        }
    }
}
