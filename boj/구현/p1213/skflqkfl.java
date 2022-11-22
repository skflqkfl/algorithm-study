package boj.구현.p1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class skflqkfl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Map charCntMap = new HashMap();
        StringBuilder output = new StringBuilder();
        char oddChar = ' ';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCntMap.put(c, (int)charCntMap.getOrDefault(c, 0) + 1);
        }
        int oddNumCnt = 0;
        Set<Map.Entry> set = charCntMap.entrySet();
        for (Map.Entry entry : set) {
            if ((int)entry.getValue() % 2 == 1){
                oddNumCnt++;
                oddChar = (char)entry.getKey();
            }
        }

        if(oddNumCnt > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        Character[] charArray = (Character[]) charCntMap.keySet().toArray(new Character[0]);
        Arrays.sort(charArray, Collections.reverseOrder());

        for (Character character : charArray) {
            int cnt = (int)charCntMap.get(character);
            while(cnt > 0) {
                if(cnt == 1) {
                    output.insert(output.length() / 2, character);
                } else {
                    output.insert(0, character);
                }
                cnt--;
                if(cnt == 0) break;
                output.append(character);
                cnt--;
            }
        }

        System.out.println(output);

    }

}
