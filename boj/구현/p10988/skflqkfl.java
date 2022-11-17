package boj.구현.p10988;

import java.util.Scanner;

public class skflqkfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(isPalindrome(input));
    }

    private static int isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if(!(input.charAt(i) == input.charAt(length-i-1))) {
                return 0;
            }
        }
        return 1;
    }
}
