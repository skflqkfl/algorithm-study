package boj.브루드포스.p3085;

/*
문제
상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.

가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다. 상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다. 이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.

사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)

다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.

사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.

출력
첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.

예제 입력 1
3
CCP
CCP
PPC
예제 출력 1
3
예제 입력 2
4
PPPP
CYZY
CCPY
PPCC
예제 출력 2
4
예제 입력 3
5
YCPZY
CYZZP
CCPPP
YCYZC
CPPZZ
예제 출력 3
4

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class skflqkfl {

    final static int MAX_N = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> inputList = new ArrayList();
        char[][] array;

        for(int i=0; i<N; i++) {
            inputList.add(scanner.next());
        }

        array = new char[inputList.size()][];

        for(int i=0; i<inputList.size(); i++) {
            array[i] = inputList.get(i).toCharArray();
        }

        int maxXLength = 1;
        int maxYLength = 1;
        int count = 1;

        for(int i=0; i<N; i++) {
            count = 1;
            for(int j=0; j<N; j++) {
                if(j+1 == N) continue;
                if(array[i][j] == array[i][j+1]) {
                    System.out.println("array[" + i + "][" + j + "] : " + array[i][j]);
                    count++;
                    continue;
                }
                if(maxXLength < count) maxXLength = count;
                count = 1;
            }
        }

        count = 1;
        for(int i=0; i<N; i++) {
            count = 1;
            for(int j=0; j<N; j++) {
                if(j+1 == N) continue;
                if(array[j][i] == array[j+1][i]) {
                    count++;
                    continue;
                }
                if(maxYLength < count) maxYLength = count;
                count = 1;
            }
        }

        System.out.println("maxXLength : " + maxXLength);
        System.out.println("maxYLength : " + maxYLength);

    }
}
