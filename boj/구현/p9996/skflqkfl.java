package boj.구현.p9996;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class skflqkfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String pattern = scanner.next();
        String[] split = pattern.split("\\*");
        pattern = "^" + split[0] + ".*" + split[1] + "$";    //a*b => ^a.*b$

        for (int i = 0; i < cnt; i++) {
            String next = scanner.next();
            boolean matches = next.matches(pattern);

            if(matches) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }

    }
}
