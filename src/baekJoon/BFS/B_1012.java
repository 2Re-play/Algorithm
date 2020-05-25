package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Dot2 {
    int x;
    int y;

    public Dot2 (int y, int x) {
        this.x = x;
        this.y = y;
    }
}
public class B_1012 {
    public static int[][] map;
    static int N;
    static int M;
    private static boolean[][] visited;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    // 유기농 배추
    private static void solution () {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];

        for(int testCase = 0; testCase < T; testCase++) {
            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();
            map = new int[N][M];
            visited = new boolean[N][M];
            int count = 0;
            for(int i=0; i<K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }
            answer[testCase] = count;
        }

        for (int result : answer) {
            System.out.println(result);
        }

    }

    public static void bfs (int y, int x) {
        Queue<Dot2> queue = new LinkedList<Dot2>();
        queue.add(new Dot2(y,x));

        while (!queue.isEmpty()) {

            Dot2 dot = queue.poll();
            int curX = dot.x;
            int curY = dot.y;
            visited[curY][curX] = true;


            for(int i=0; i<4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N) {
                    if(map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
                        queue.add(new Dot2(nextY, nextX));
                        visited[nextY][nextX] = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
