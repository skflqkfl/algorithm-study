package boj.수학.p9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class skflqkfl {
    static int N, M;
    static Map<String, Integer> outputMap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            outputMap = new HashMap<>();
            int multi = 1;
            for (int j = 0; j < M; j++) {
                String[] strings = br.readLine().split(" ");
                outputMap.put(strings[1], (int)outputMap.getOrDefault(strings[1], 0) + 1);
            }
            outputMap.forEach((key, value) -> {
                outputMap.put(key, value + 1);
            });

            Iterator<Integer> iterator = outputMap.values().iterator();
            while(iterator.hasNext()) {
                multi = multi * iterator.next();
            }
            multi--;

//            System.out.println(outputMap.toString());
            System.out.println(multi);

        }
    }

}
