package boj.구현.p15664;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class skflqkfl {
    static int N, R;
    static int[] input, output;
    static Map outputMap;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        input = new int[N];
        output = new int[R];
        outputMap = new HashMap();
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        combination(0, 0);
        System.out.println(sb);
    }
    private static void combination(int at, int depth) {
        if(depth == R) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < output.length; i++) {
                tmp.append(output[i]).append(' ');
            }
            tmp.append("\n");
            if(!outputMap.containsKey(tmp.toString())) {
                outputMap.put(tmp.toString(), tmp);
                sb.append(tmp);
            }
            return;
        }
        for(int i=at; i<N; i++) {
            output[depth] = input[i];
            combination(i+1, depth + 1);
        }
    }
}
