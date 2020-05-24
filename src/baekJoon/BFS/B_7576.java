package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Dot {
    int x;
    int y;
    Dot (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class B_7576 {

    // 토마토
    // 1은 익은 토마토, 정수 0은 익지 않은 토마토, 정수 -1은 토마토

    public static int[][] map;
    static int n;
    static int m;
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    private static void solution () {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        map = new int[n][m];

        // input
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        bfs(n, m);
    }

    public static void bfs (int n, int m) {
        Queue<Dot> queue = new LinkedList<Dot>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(map[i][j] == 1) {
                    queue.add(new Dot(i, j));
                }
            }
        }

        while(!queue.isEmpty()) {
            Dot dot = queue.poll();
            for(int i = 0; i<4; i++) {
                int nextX = dot.x + dx[i];
                int nextY = dot.y + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >=n  || nextY >= m) {
                    continue;
                }

                if(map[nextX][nextY] != 0) {
                    continue;
                }

                map[nextX][nextY] = map[dot.x][dot.y] + 1;;
                queue.add(new Dot(nextX, nextY));
            }
            print(map, n, m);
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    //토마토가 모두 익지 못한 상황이라면 -1 을 출력한다.
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }
        //그렇지 않다면 최대값을 출력한다.
        System.out.println(max - 1);
    }

    //농장을 전체 보여주는 함수
    public static void print(int[][] arr, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}


