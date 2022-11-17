package boj.구현.p1159;

import java.util.*;
import java.util.stream.Stream;

public class skflqkfl {
    private static int ALPHA_CNT = 26;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] cntFirstChar = new int[ALPHA_CNT];
        for (int i = 0; i < cnt; i++) {
            String s = scanner.next();
            cntFirstChar[(int)s.charAt(0)-97]++;
        }
        Map<Character, Integer> cntMap = new HashMap<>();

        for (int i = 0; i < ALPHA_CNT; i++) {
            int cntChar = cntFirstChar[i];
            if(cntChar >= 5) {
                cntMap.put((char) (i + 97), cntChar);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new LinkedList<>(cntMap.entrySet());
        entryList.sort((s1, s2) -> {
            return s1.getKey() - s2.getKey();
        });

        if(entryList.size() == 0) {
            System.out.println("PREDAJA");
        } else {
            entryList.forEach(m -> System.out.print(m.getKey()));
        }

    }
}
