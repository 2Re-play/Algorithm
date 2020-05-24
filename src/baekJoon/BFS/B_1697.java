package baekJoon.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B_1697 {


    static boolean[] visited = new boolean[100001];
    static int[] distance = new int[100001];
    static int[] move = { 1, -1, 2 };

    private static void solution () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if(n >= k)
            System.out.println(n-k);
        else
            bfs(n, k);
    }

    public static void bfs (int n, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(n);
        visited[n] = true;
        distance[n] = 1;

        while(!queue.isEmpty()) {
            int num = queue.poll();

            for(int i=0; i<3; i++) {
                int next;
                if(i == 2) {
                    next = num * move[i];
                } else {
                    next = num + move[i];
                }

                if(next <= 100000 && -1 < next && !visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                    distance[next] = distance[num] + 1;
                }
            }
        }
        System.out.println(distance[k] - 1);
    }

    public static void main(String[] args) {
        solution();
    }
}
