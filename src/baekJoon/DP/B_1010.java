package baekJoon.DP;

import java.util.Scanner;

public class B_1010 {

    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] dp = new long[n+1][m+1];

//            dp[1][1] = 1;
//            dp[1][2] = 2;
//            dp[1][3] = 3;
//            dp[2][2] = 1;
//            dp[2][3] = 3;
//            dp[2][4] = 5;


            for(int j=1; j<=n; j++) {
                for(int k=j; k<=m; k++) {
                    dp[j][k] = dp[j][k-1] + j;
                }
            }

            System.out.println(dp[n][m]);


        }
    }

    public static void main(String[] args) {
        solution();

    }
}
