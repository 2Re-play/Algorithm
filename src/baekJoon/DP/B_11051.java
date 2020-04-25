package baekJoon.DP;

import java.util.Scanner;

public class B_11051 {

    // 이항 계수 2
    // 파스칼 삼각형을 이용하여 2차원 배열로 간단히 풀이 가능
    // dp[n][k] = dp[n-1][k-1] + dp[n-1][k]
    private static void solutiuon () {
        Scanner sc = new Scanner(System.in);

        // (1 ≤ n ≤ 1,000, 0 ≤ k  ≤ n )
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] dp = new int[n+1][n+1];


            for(int i=0 ; i<=n; i++) {
                for(int j=0; j<=i; j++) {
                    if(i == j || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % 10007;
                    }
                }
            }

        System.out.println(dp[n][k]);
    }

    public static void main(String[] args) {
        solutiuon();
    }
}
