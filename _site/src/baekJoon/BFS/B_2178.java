package baekJoon.BFS;

import java.util.*;

// 미로 탐색
public class B_2178 {

    // 우(0,1) 하 (1,0) 좌(0,-1) 상(-1,0)
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;

    public static void solution () {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for(int i=1; i<=n; i++) {
            String temp = sc.next();
            for(int j=1; j<=m; j++) {
                map[i][j] = temp.charAt(j-1) - 48;
                visited[i][j] = false;
            }
        }

        bfs(1,1);
        System.out.println(map[n][m]);
    }

    public static void bfs(int x, int y) {
        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();

        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty() && !qy.isEmpty()) {
            x = qx.poll();
            y = qy.poll();

            visited[x][y] = true;

            for(int i=0; i<4; i++) {
                int _x = x + dx[i];
                int _y = y + dy[i];

                if(_x >= 0 && _y >= 0 && _x <= n && _y <= m) {
                    if(map[_x][_y] == 1 && visited[_x][_y] == false) {
                        qx.add(_x);
                        qy.add(_y);
                        visited[_x][_y] = true;
                        map[_x][_y] = map[x][y] + 1;
                    }
                }
            }
        }
    }

    public static void main (String [] args) {
        solution();

    }
}
