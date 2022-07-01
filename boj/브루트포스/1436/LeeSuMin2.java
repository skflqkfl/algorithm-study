import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(getNumber(N));
    }

    public static int getNumber(int n) {
        int idx = 0;
        int result = 0;
        int target = 0;

        for (int i = 666; idx < n; i++) {
            target = i;
            while(target > 100) {
                if((target % 1000) == 666) { // String contains 666을 수학적으로 풀이
                    idx++;
                    result = i;
                    break;
                }
                target /= 10;
            }
        }
        return result;
    }
}