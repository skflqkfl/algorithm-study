package com.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Character> list = new ArrayList<>();
    static Map<Character, Integer> map = new HashMap<>();
    static String[] strArr;
    static boolean[] visited;
    static int result = 0;
    static int listSize;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        strArr = new String[N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            strArr[i] = str;
            char[] cArr = str.toCharArray();
            for (char c : cArr) {
                if(!list.contains(c)) list.add(c);
            }
        }
        listSize = list.size();
        visited = new boolean[listSize];

        solve(0);

        System.out.println(result);
    }


    static void solve(int len) {
        if (len == listSize) {
            int totalSum = 0;
            for (String str : strArr) {
                char[] strToCharArr = str.toCharArray();
                int wordSum = 0;
                for (int i = 0; i < strToCharArr.length ; i++) {
                    char c = strToCharArr[i];
                    wordSum = (wordSum * 10) + map.get(c);
                }
                totalSum += wordSum;
            }
            if (result < totalSum) result = totalSum;
            return;
        }

        for (int i = 0; i < listSize; i++) {
            if(visited[i]) continue;

            map.put(list.get(i), 9 - len);

            visited[i] = true;
            solve(len + 1);
            visited[i] = false;
        }
    }
}