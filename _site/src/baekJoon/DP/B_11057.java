package baekJoon.DP;

import java.util.Scanner;

public class B_11057 {

    // 오르막 수
    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[n+1][11];
        long result = 0;

        for(int i=1; i<=10; i++) {
            dp[1][i] = 1;
        }

        for(int i=2; i<=n; i++) {
            for(int j=1; j<=10; j++) {
                for(int k=1; k<=j; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }

        for(int k=1; k<=10; k++) {
            result += dp[n][k] % 10007 ;
        }

        System.out.println(result % 10007);

    }

    public static void main(String[] args) {

        solution();
    }
}
