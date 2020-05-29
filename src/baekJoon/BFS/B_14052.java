package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_14052 {

    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int N;
    static int M;
    static int[][] map;
    static int[][] tempMap;
    static int answer = 0;

    public static void solution () {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        tempMap = new int[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                tempMap[i][j] = map[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0) {
                    tempMap[i][j] = 1; // 벽 하나 세우기
                    dfs(1);
                    tempMap[i][j] = 0;
                }
            }
        }
        System.out.println(answer);
    }

    public static void dfs (int count) {
        if(count == 3) {
            bfs(); // 바이러스 확산 시키기
            return;
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(tempMap[i][j] == 0) {
                    tempMap[i][j] = 1; // 벽 2개 더 세우기
                    dfs(count + 1);
                    tempMap[i][j] = 0;
                }
            }
        }
    }

    public static void bfs () {
        Queue<int[]> queue = new LinkedList<int[]>();
        int[][] virusMap = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                virusMap[i][j] = tempMap[i][j];
            }
        }

        for(int x=0; x<N; x++) {
            for(int y=0; y<M; y++) {
                if(virusMap[x][y] == 2) {
                    queue.add(new int[] {x, y});
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] data = queue.poll();
            int curX = data[0];
            int curY = data[1];
            visited[curX][curY] = true;

            for(int i=0; i<4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if(nextX >= 0 && nextY >= 0 && nextX < N && nextY < M ) {
                    if(virusMap[nextX][nextY] == 0 && !visited[nextX][nextY]) {
                        virusMap[nextX][nextY] = 2;
                        queue.add(new int[] {nextX, nextY});
                    }
                }
            }
        }
        calAnswer(virusMap);
    }

    public static void calAnswer(int[][] virusMap) {
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++){
                if(virusMap[i][j] == 0) {
                    cnt++;
                }
            }
        }
        answer = Math.max(answer, cnt);
    }

    public static void main(String[] args) {
        solution();
    }
}
