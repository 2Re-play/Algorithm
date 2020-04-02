package baekJoon.BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1260 {

    static int n;
    static int m;
    static int v;
    static int[][] map;
    static boolean[] visit;

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        map = new int[n+1][n+1]; // 간선을 표현하는 배열
        visit = new boolean[n+1]; // 방문 배열

        for(int j=0;j<n+1; j++) {
            Arrays.fill(map[j], 0);
        }
        Arrays.fill(visit, false);

        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        //dfs
        dfs(v);
        System.out.println();
        Arrays.fill(visit, false);
        //bfs
        bfs(v);

    }

    public static void dfs(int v) {
        visit[v] = true; // 방문 true
        System.out.print(v+ " ");
        for(int j=1; j<=n; j++) {
            if(map[v][j] == 1 && visit[j] == false) {
                dfs(j); // 내가 찾은 경로가 만약에 다른 경로가 있으면 바로 다음 곳으로 이동시키고 만약 없으면, 다시 돌아옴.
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(v);
        visit[v] = true;

        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp+ " ");

            for(int k=1; k<=n; k++) {
                if(map[temp][k] == 1 && visit[k] == false) {
                    q.offer(k);
                    visit[k] = true;
                }
            }
        }
    }



    public static void main (String [] args) {
        solution();

    }
}
