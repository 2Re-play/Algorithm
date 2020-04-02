package baekJoon.DP;

import java.util.Scanner;

public class B_1932 {

    // 정수 삼각형 (DP)
    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];
        int max = 0;

        // 삼각형 input 값
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        if(n == 1) {
            dp[1][1] = input[1][1];
        } else if (n == 2) {
            dp[2][1] = dp[1][1] + input[2][1];
            dp[2][2] = dp[1][1] + input[2][2];
        } else {
            dp[1][1] = input[1][1];
            dp[2][1] = dp[1][1] + input[2][1];
            dp[2][2] = dp[1][1] + input[2][2];

            for(int i=3; i<=n; i++) {
                for(int j=1; j<=i; j++) {
                    if(j==1) dp[i][j] = dp[i-1][j] + input[i][j]; // 삼각형 왼쪽 대각선
                    else if(j==i) dp[i][j] = dp[i-1][j-1] + input[i][j]; // 삼각형 오른쪽 대각선
                    else dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + input[i][j]; // 그 사이에서 더한 값 중 최댓값을 나와 더하기
                    if(max < dp[i][j]) max = dp[i][j];
                }
            }
        }


        System.out.println(max);
    }

    public static void main (String [] args) {

        solution();
    }
}
