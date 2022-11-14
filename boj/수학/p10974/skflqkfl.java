package boj.수학.p10974;

import java.util.*;

public class skflqkfl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> inputList = new ArrayList<>();

        for(int i=1; i<=N; i++) {
            inputList.add(i);
        }

        int n = N;
        int r = N;
        int depth = 0;

        List<Boolean> selectList = new ArrayList<>();
        
        permutation(n, r, depth, inputList, selectList);

    }

    private static void permutation(int n, int r, int depth, List<Integer> inputList, List<Boolean> selectList) {
        if(depth == n) {
            inputList.forEach(i -> System.out.print(i + " "));
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++) {
            if(selectList.size()-1 <i)
                selectList.add(false);
            if(selectList.get(i) == true)
                continue;

            selectList.set(i, true);
            permutation(n, r, depth + 1, inputList, selectList);
            selectList.set(i, false);
        }

        return;
    }

}
