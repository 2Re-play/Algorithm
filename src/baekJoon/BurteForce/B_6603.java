package baekJoon.BurteForce;

import java.util.Scanner;

public class B_6603 {

    static int[] input;
    static int T;
    static boolean[] visited;
    static StringBuilder sb;

    // 로또
    public static void solution () {

        Scanner sc = new Scanner(System.in) ;

        while (true) {
            T = sc.nextInt();
            if(T == 0) break;
            input = new int[T];
            visited = new boolean[T];
            sb = new StringBuilder();

            for(int i=0; i<T; i++) {
                input[i] = sc.nextInt();
            }

            calculate(0,0);
            System.out.println(sb);
        }
        sc.close();
    }

    public static void calculate (int v, int length) {
        if(length == 6) {
            for(int i=0; i<T; i++) {
                if(visited[i]) sb.append(input[i] + " ");
            }
            sb.append("\n");
            return;
        }
        if(v >= T) return;

        visited[v] = true;
        calculate(v+1, length+1);
        visited[v] = false;
        calculate(v+1, length);
    }

    public static void main(String[] args) {
        solution();
    }
}