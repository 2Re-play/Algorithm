package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_2468 {

    // 안정 영역
    // 우(0,1) 하 (1,0) 좌(0,-1) 상(-1,0)
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int n;
    static boolean[][] visited;
    static int[][] map;
    static int answer = 0;
    private static void solution () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];

        int max = 0;
        int count=0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                map[i][j] = sc.nextInt();
                max = max < map[i][j] ? map[i][j] : max;
            }
        }
        for(int k=0; k<max; k++) {
            visited = new boolean[n][n];
            count = 0;
            for(int x=0; x<n; x++) {
                for(int y=0; y<n; y++) {
                    if(map[x][y] > k && !visited[x][y]) {
                        bfs(x,y,k);
                        count++;
                    }
                }
            }
            answer = answer < count ? count : answer;
        }

        System.out.println(answer);
    }

    private static void bfs(int x, int y, int target) {
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[] {x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] data = queue.poll();
            int curX = data[0];
            int curY = data[1];

             for(int i=0; i<4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if(nextX >=0 && nextY >=0 && nextX < n && nextY < n) {
                    if(!visited[nextX][nextY] && map[nextX][nextY] > target) {
                        visited[nextX][nextY] = true;
                        queue.offer(new int[]{nextX, nextY});
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        solution();
    }
}
