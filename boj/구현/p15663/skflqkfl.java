package boj.구현.p15663;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class skflqkfl {
    static int N, R;
    static Integer[] input, output;
    static boolean[] visited;
    static Map outputMap;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        input = new Integer[N];
        visited = new boolean[N];
        output = new Integer[R];
        outputMap = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            input[i] = Integer.valueOf(st.nextToken());
        }

        Arrays.sort(input);
        sb = new StringBuilder();
        permutation(0);
        System.out.println(sb);
    }
    private static void permutation(int depth) {
        if(depth == R) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < output.length; i++) {
                tmp.append(output[i]).append(' ');
            }
            if(!outputMap.containsKey(tmp.toString())) {
                sb.append(tmp).append("\n");
                outputMap.put(tmp.toString(), tmp);
            }
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
