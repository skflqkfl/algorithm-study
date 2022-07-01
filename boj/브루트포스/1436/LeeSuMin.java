import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer> arr = new ArrayList<>();
    static int M = 1000001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr.add(-1);
        solve(100);
        System.out.println(arr.get(N));
    }

    /**
     * arrayList에 666 포함 숫자 전부 삽입
     * N 입력 시 바로 인덱스에 접근해서 가져오는 형태
     * 불필요한 연산 횟수가 너무 많음
     */
    static void solve(int len) {
        if (len >= M) return;

        for (int i = len; i <= len * 10; i++) {
            String temp = Integer.toString(i);
            if (temp.contains("666"))
                arr.add(i);
        }

        solve(len * 10);
    }
}