package boj.구현.p2559;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class skflqkfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] days = new int[N];
        int[] sumDays = new int[N-K+1];

        for (int i = 0; i < N; i++) {
            days[i] = scanner.nextInt();
            if(i == K-1) {
                for(int j=i; j>=i-(K-1); j--) {
                    sumDays[i-(K-1)] += days[j];
                }
            } else if (i > K-1) {
                sumDays[i-(K-1)] += sumDays[(i-1)-(K-1)] + days[i] - days[i-K];
            }
        }

        OptionalInt max = Arrays.stream(sumDays).max();
        System.out.println(max.getAsInt());

    }
}
