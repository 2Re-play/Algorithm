package baekJoon.DP;

import java.util.Scanner;

// 스티커 (*)
public class B_9465 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];

        for(int i=0; i<T; i++) {
            int n = sc.nextInt();
            int[][] input = new int[3][n+1];
            int[][] dp = new int[3][n+1];

            for(int j=1; j<=2; j++) {
                for(int k=1; k<=n; k++) {
                    input[j][k] = sc.nextInt();
                }
            }

            dp[1][1] = input[1][1];
            dp[2][1] = input[2][1];

            for(int k=2; k<=n; k++) {
                dp[1][k] = Math.max(dp[2][k-1], dp[2][k-2]) + input[1][k];
                dp[2][k] = Math.max(dp[1][k-1], dp[1][k-2]) + input[2][k];
            }
            answer[i] = Math.max(dp[1][n], dp[2][n]);
        }

        for(int result : answer) {
            System.out.println(result);
        }
    }

    public static void main(String [] args) {
        solution();
    }
}
