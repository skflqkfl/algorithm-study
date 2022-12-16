package boj.DFS.p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class skflqkfl {
    static int mapCnt, cnt, N, M, K;
    static int[][] map, visited;
    static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int c = 0; c < cnt; c++) {
            String[] strings = br.readLine().split(" ");
            M = Integer.parseInt(strings[0]);
            N = Integer.parseInt(strings[1]);
            K = Integer.parseInt(strings[2]);
            map = new int[N][M];
            visited = new int[N][M];

            for (int i = 0; i < K; i++) {
                strings = br.readLine().split(" ");
                int x = Integer.parseInt(strings[0]);
                int y = Integer.parseInt(strings[1]);
                map[y][x] = 1;
            }

            //출력
            //for (int[] ints : map) System.out.println(Arrays.toString(ints));
            mapCnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(map[i][j] == 1 && visited[i][j] == 0) {
                        mapCnt++;dfs(i,j);
                    }
                }
            }
            System.out.println(mapCnt);
        }
    }
    static void dfs(int y, int x) {
        int ny, nx;
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            ny = dy[i] + y;
            nx = dx[i] + x;
            if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
            if(visited[ny][nx] > 0 || map[ny][nx] == 0) continue;
            dfs(ny, nx);
        }
    }
}
