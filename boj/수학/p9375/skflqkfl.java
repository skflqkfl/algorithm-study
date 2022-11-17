package boj.수학.p9375;

import java.util.*;

public class skflqkfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = scanner.nextInt();
            List dressMapList = new ArrayList();
            List visitied = new ArrayList();
            Map dressMap = new HashMap();

            for (int j = 0; j < n; j++) {
                String name = scanner.next();
                String kind = scanner.next();
                dressMap.put(kind, dressMap.getOrDefault(kind, 0));
                dressMapList.add(dressMap);
            }


        }
    }

    private static void combination(List dressList, List visited, int start, int N, int R) {
        if(R == 0) {
            return;
        }
        for (int i = start; i < N; i++) {
//            visited.set(i, )
        }
    }



}
