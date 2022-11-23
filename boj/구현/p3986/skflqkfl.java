package boj.구현.p3986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class skflqkfl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        int goodWordCnt = 0;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            stack.clear();

            for (int j = 0; j < word.length(); j++) {
                stack.push(word.charAt(j));
                int stackSize = stack.size();

                if(stackSize > 1) {
                    if(stack.get(stackSize-1) == stack.get(stackSize-2)) {
                        stack.pop();
                        stack.pop();
                    }
                }
            }
            if(stack.size() == 0) goodWordCnt++;
        }
        System.out.println(goodWordCnt);
    }
}
