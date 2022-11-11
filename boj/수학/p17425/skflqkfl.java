package boj.수학.p17425;
/*문제
두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다. 예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다. 자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.

자연수 N이 주어졌을 때, g(N)을 구해보자.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 100,000)가 주어진다. 둘째 줄부터 테스트 케이스가 한 줄에 하나씩 주어지며 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
각각의 테스트 케이스마다, 한 줄에 하나씩 g(N)를 출력한다.

예제 입력 1
5
1
2
10
70
10000
예제 출력 1
1
4
87
4065
82256014
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class skflqkfl {

    private static boolean log = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        while(N-- > 0) {
            System.out.println(개같은(scanner.nextInt()));
        }

//        long beforeTime = System.currentTimeMillis();
//        TList.forEach(i -> System.out.println(functionG(N)));
//        long afterTime = System.currentTimeMillis();
//        if(log) System.out.println("runningTime : " + (afterTime - beforeTime));

    }

    private static long 개같은(int N) {
        long sum = 0;
        for(int i = 1; i<= N; i++) {
            sum += i * (N / i);
        }
        return sum;
    }

    //val보다 작거나 같은 모든 자연수를 functionA로 더한다.
    private static Long functionG(int val) {
        long sum = 0;

        for(int i: getAllNaturalNumberList(val)) {
            sum += functionA(i);
        }
        if(log) System.out.println("functionG.sum : " + sum);
        return sum;
    }

    //val의 모든 약수를 더한다
    private static Long functionA(int val) {
        long sum=0;

        for(int i:getAliquotList(val)) {
            sum += i;
        }
        if(log) System.out.println("functionA.sum : " + sum);
        return sum;
    }

    //val 보다 작거나 같은 모든 약수를 구한다
    private static List<Integer> getAliquotList(int val) {
        List<Integer> aliquotList = new ArrayList<>();

        for(int i=1; i<=val; i++) {
            if(val%i == 0) aliquotList.add(i);
        }
        if(log) System.out.println("getAliquotList.aliquotList : " + aliquotList.toString());
        return aliquotList;
    }

    //val 보다 작거나 같은 모든 자연수 구한다
    private static List<Integer> getAllNaturalNumberList(int val) {
        List<Integer> naturalNumberList = new ArrayList<>();

        for(int i=1; i<=val; i++) {
            naturalNumberList.add(i);
        }
        if(log) System.out.println("getAllNaturalNumberList.naturalNumberList : " + naturalNumberList.toString());
        return naturalNumberList;
    }
}
