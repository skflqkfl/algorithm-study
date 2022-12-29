package boj.BFS.p2468;

import java.io.*;
import java.util.*;

public class skflqkfl {

    private static boolean log = false;
    private static int N, safetyHeigh, minHeigh, maxHeigh, maxSafetyHeighCnt, maxCnt;
    private static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};
    private static int[][] map, visited;
    private static Queue<Pair> que;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        safetyHeigh = 0;
        minHeigh = 101;
        maxHeigh = 0;
        maxSafetyHeighCnt = 0;
        map = new int[N][N];
        visited = new int[N][N];

        que = new LinkedList<>();

        //input map
        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int min = Arrays.stream(map[i]).min().getAsInt();
            int max = Arrays.stream(map[i]).max().getAsInt();
            if(minHeigh > min) minHeigh = min;
            if(maxHeigh < max) maxHeigh = max;
        }


        //print start
        if(log) {
            for (int[] ints : map) {
                System.out.println(Arrays.toString(ints));
            }
            System.out.println("minHeigh = " + minHeigh + ", maxHeigh = " + maxHeigh);
        }
        //print end

        for(int i=0; i<=maxHeigh; i++) {
//        for(int i=4; i<=4; i++) {
            safetyHeigh = i;
            maxCnt = 0;
            visited = new int[N][N];
            if(log) System.out.println("safetyHeigh = " + safetyHeigh);
            for(int j=0; j<N; j++) {
                for (int k = 0; k < N; k++) {
                    if(log) System.out.println("j, k = " + j + ", " + k);
                    bfs(new Pair(j, k));
                }
            }
            if(maxSafetyHeighCnt < maxCnt) maxSafetyHeighCnt = maxCnt;
            if(log) System.out.println("maxCnt = " + maxCnt);
        }
        System.out.println(maxSafetyHeighCnt);

    }

    public static void bfs(Pair pair) {
        int cnt = 0;
        que.add(pair);
        while(!que.isEmpty()) {
            Pair poll = que.poll();
            if(visited[poll.y][poll.x] > 0 || map[poll.y][poll.x] <= safetyHeigh) continue;
            if(log) System.out.println("poll = {" + poll.y + ", " + poll.x + "}");
            visited[poll.y][poll.x]++;
            cnt++;
            for(int i=0; i<4; i++) {
                int uy = poll.y + dy[i];
                int ux = poll.x + dx[i];
                if(uy < 0 || uy >= N || ux < 0 || ux >= N) continue;
                if(visited[uy][ux] > 0 || map[uy][ux] <= safetyHeigh) continue;
//                visited[uy][ux] = visited[pair.y][pair.x]+1;
                if(log) System.out.println(" uy, ux = " + uy + ", " + ux);
                que.add(new Pair(uy, ux));
            }
        }
        if(cnt > 0) maxCnt++;
    }
}

class Pair {
    int x, y;
    Pair(int y, int x) {this.y = y;this.x = x;}
}
