package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 연결요소
public class B_11724 {

    private static void solution () {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] map = new int[M][2];
        for(int i=0; i<M; i++) {
            map[i][0] = sc.nextInt();
            map[i][1] = sc.nextInt();
        }


    }

    private static int bfs (int M, int[][] map) {
        boolean[] visited = new boolean[M];
        Queue<int[]> queue = new LinkedList<int[]>();

        queue.add(new int[] {map[1][0], map[1][1]});

        while(!queue.isEmpty()) {
            int[] data = queue.poll();
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
