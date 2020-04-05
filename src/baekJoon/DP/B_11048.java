package baekJoon.DP;

import java.util.Scanner;

public class B_11048 {

    // 이동하기 [dp]
    private static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] input = new int[n+1][m+1];
        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                dp[i][j] += Math.max(dp[i-1][j], dp[i][j-1]) + input[i][j];
            }
        }

        System.out.println(dp[n][m]);

    }

    public static void main(String[] args) {
        solution();
    }
}
