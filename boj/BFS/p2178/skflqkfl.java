package boj.BFS.p2178;

import java.io.*;
import java.util.*;

public class skflqkfl {
    static int N, M;
    static int[][] map, visited;
    static Queue<Pair> que;
    static int uy, ux, vy, vx;
    static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new int[N][M];
        uy = 0; ux = 0; vy = N-1; vx = M-1;
        que = new LinkedList();

        for (int i = 0; i < N; i++)
            map[i] = Arrays.stream(br.readLine().split(""))
                            .mapToInt(Integer::parseInt).toArray();

        //출력
        //for (int[] ints : map) System.out.println(Arrays.toString(ints));

        bfs(new Pair(0, 0));
        System.out.println(visited[vy][vx]);

    }
    static void bfs(Pair pair) {
        visited[ux][uy] = 1;
        que.add(pair);
        while(!que.isEmpty()) {
            Pair poll = que.poll();
            for (int i = 0; i < 4; i++) {
                int ny = poll.y + dy[i];
                int nx = poll.x + dx[i];
                if(ny < 0 || ny >= N || nx < 0 || nx >= M) continue;
                if(visited[ny][nx] > 0 || map[ny][nx] == 0) continue;
                visited[ny][nx] = visited[poll.y][poll.x] + 1;
                que.add(new Pair(ny, nx));
            }
        }
    }
}
class Pair {
    int x, y;
    Pair(int y, int x) {this.y = y;this.x = x;}
}
