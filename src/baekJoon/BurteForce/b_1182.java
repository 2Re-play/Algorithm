package baekJoon.BurteForce;

import java.util.ArrayList;
import java.util.Scanner;

public class b_1182 {

    static int n;
    static int s;
    static int count = 0;
    static int[] input;

    private static void solution () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        input = new int[n];

        for(int i=0;i<n; i++) {
            input[i] = sc.nextInt();
        }

        dfs(0,0);

        System.out.println(s == 0 ? count -1 : count);
    }

    private static void dfs (int v, int sum) {
        if(v == n) {
            if(sum == s) count++;
            return;
        }
        dfs(v+1, sum); // 포함하지 않는 경우
        dfs(v+1, sum + input[v]); // 자신을 포함한 경우
    }

    public static void main(String[] args) {
        solution();
    }
}
