package boj.구현.p1620;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class skflqkfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> numberMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String name = scanner.next();
            nameMap.put(name, i);
            numberMap.put(i, name);
        }

        for (int i = 0; i < M; i++) {
            String input = scanner.next();
            boolean isName = input.charAt(0) >= 'A' && input.charAt(0) <= 'Z';
            if(isName) {
                System.out.println(nameMap.get(input));
            } else {
                System.out.println(numberMap.get(Integer.parseInt(input)));
            }
        }
    }
}
