package boj.BFS.p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class skflqkfl {
    private static int T, N, M, K, mapCnt;
    private static int[][] map;
    private static boolean[][] visited;
    private static Queue<Pair> que;
    private static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            mapCnt = 0;
            que = new LinkedList<Pair>();

            map = new int[N][M];
            visited = new boolean[N][M];
            for(int i=0; i<K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x]++;
            }

//            for (int[] ints : map) {
//                System.out.println(Arrays.toString(ints));
//            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    bfs(new Pair(i, j));
//                    System.out.println("mapCnt = " + mapCnt);
                }
            }
            System.out.println(mapCnt);

        }
    }

    private static void bfs(Pair pair) {
        int cnt=0;
        que.add(pair);
        while(!que.isEmpty()) {
            Pair poll = que.poll();
            if(map[poll.y][poll.x] == 0 || visited[poll.y][poll.x] == true) continue;
            visited[poll.y][poll.x] = true;
            cnt++;
            for(int i=0; i<dy.length; i++) {
                int uy = poll.y + dy[i];
                int ux = poll.x + dx[i];
                if(uy < 0 || uy >= N || ux < 0 || ux >= M) continue;
                if(visited[uy][ux] == true || map[uy][ux] == 0) continue;
//                System.out.println("poll = [" + poll.y + ", " + poll.x + "]");
                que.add(new Pair(uy, ux));
            }
        }
        if(cnt > 0) mapCnt++;
    }

}

class Pair {
    int y, x;
    Pair(int y, int x) {
        this.y = y;
        this.x = x;
    }
}
