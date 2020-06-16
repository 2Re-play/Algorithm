package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_7569 {

    // 토마토
    public static int[][][] map;
    static int h;
    static int n;
    static int m;
    static int[] dx = { -1, 0, 1, 0, 0, 0 };
    static int[] dy = { 0, 1, 0, -1, 0, 0 };
    static int[] dh = { 0, 0, 0, 0, -1, 1 };

    private static void solution () {

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();
        map = new int[h][n][m];

        // input
        for(int i=h-1; i>=0; i--) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<m; k++) {
                    map[i][j][k] = sc.nextInt();
                }
            }
        }

        bfs();

        int max = 0;
        for(int i=h-1; i>=0; i--) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (map[i][j][k] == 0) {
                        //토마토가 모두 익지 못한 상황이라면 -1 을 출력한다.
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, map[i][j][k]);
                }
            }
        }
        //그렇지 않다면 최대값을 출력한다.
        System.out.println(max - 1);

    }

    private static void bfs() {
        Queue<int[]> queue = new LinkedList<int[]>();

        for(int i=h-1; i>=0; i--) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<m; k++) {
                    if(map[i][j][k] == 1) {
                        queue.add(new int[] {i, j, k});
                    }
                }
            }
        }

        while (!queue.isEmpty()) {

            int[] data = queue.poll();
            int curH = data[0];
            int curN = data[1];
            int curM = data[2];

            for(int i=0; i<6; i++) {
                int nextH = curH + dh[i];
                int nextN = curN + dx[i];
                int nextM = curM + dy[i];

                if (nextH >= 0 && nextN >= 0 && nextM >= 0  && nextH < h && nextN < n && nextM < m ) { // map 범위
                    if(map[nextH][nextN][nextM] == 0) {
                        map[nextH][nextN][nextM] = map[curH][curN][curM] + 1;
                        queue.add(new int[]{nextH, nextN, nextM});
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
