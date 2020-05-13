package baekJoon.BFS;

import java.util.*;

public class B_2667 {


    // 단지번호붙이기
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    private static int[][] map;
    private static boolean[][] visited;
    static int []dy = {0, 1, -1, 0}; // 하상우
    static int []dx = {1, 0, 0, -1};
    static int n;

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++) {
            String input = sc.next();
            for(int j=0; j<n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    bfs(i,j);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for(int result : list) {
            System.out.println(result);
        }

    }

    private static void bfs (int y, int x) {
        Queue<int[]> queue = new LinkedList<int[]>();
        int count = 1;
        queue.offer(new int[] {y, x});
        visited[y][x] = true;

        while(!queue.isEmpty()) {
            int [] data = queue.poll();
            int curY = data[0];
            int curX = data[1];

            for(int i=0; i<4; i++) {
                int newY = curY + dy[i];
                int newX = curX + dx[i];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n ) { // map 범위
                    if(map[newY][newX] != 0 && !visited[newY][newX]) {
                        visited[newY][newX] = true;
                        queue.offer(new int[]{newY, newX});
                        count++;
                    }
                }
            }
        }
        list.add(count);
    }

    public static void main(String[] args) {
        solution();
    }
}
