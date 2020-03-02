package baekJoon;

import java.util.Scanner;

public class B_10974 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] arr = new int[n]; // 순열을 만들 배열
        int[] output = new int[n]; // 순열을 만든 후 배열
        boolean[] visited = new boolean[n]; // 방문체크

        // 1부터 n까지 순서대로 arr배열에 삽입
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        perm(arr, output, visited, 0, n, n);
    }

    // n개중 r개를 뽑는 순열
    public static void perm (int[] arr, int[] output,boolean[] visited, int depth, int n, int r) {
        if(depth == r) { // 만약 dfs깊이가 r까지 갔다면
            for(int i=0; i<r; i++)
                System.out.print(output[i] + " ");
            System.out.println();
            return;
        }

        for(int i=0; i<n; i++) {
            if(visited[i] != true) { // 방문하지 않았다면
                visited[i] = true;
                output[depth] = arr[i]; // 순열을 만든 후 배열에 값 삽입
                perm(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    public static void main (String [] args) {
        solution();
    }
}
