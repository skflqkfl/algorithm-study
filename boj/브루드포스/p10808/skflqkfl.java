package boj.브루드포스.p10808;

import java.util.Arrays;
import java.util.Scanner;

public class skflqkfl {
    private static int ALPHA_COUNT = 26;
    private static int ALPHA_MINUS_VALUE = 97;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int[] alphaCOunt = new int[ALPHA_COUNT];

        for(int i=0; i<inputString.length(); i++) {
            alphaCOunt[inputString.charAt(i) - ALPHA_MINUS_VALUE]++;
        }

        Arrays.stream(alphaCOunt).forEach(i -> System.out.print(i + " "));
    }
}
