package boj.구현.p11655;

import java.util.Scanner;

public class skflqkfl {
    private static int ROT13 = 13;
    private static int ALPHA_CNT = 26;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c >= 'a' && c <= 'z') {
                if((char)(c-ROT13) < 'a') {
                    System.out.print((char)(c - ROT13 + ALPHA_CNT));
                } else {
                    System.out.print((char)(c - ROT13));
                }
            } else if(c >= 'A' && c <= 'Z') {
                if((char)(c-ROT13) < 'A') {
                    System.out.print((char)(c - ROT13 + ALPHA_CNT));
                } else {
                    System.out.print((char)(c - ROT13));
                }
            } else {
                System.out.print(c);
            }
        }
    }
}
