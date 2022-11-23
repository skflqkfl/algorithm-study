package boj.수학.p1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class skflqkfl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(rec(A,B,C));
    }

    static long rec(int A, int B, int C) {
        if(B == 1) {
            return A%C;
        }

        long cal = rec(A, B/2, C);
        cal = (cal * cal) % C;
        if(B%2 == 0) {
            return cal;
        } else {
            return (cal * A)%C;
        }
    }

}
