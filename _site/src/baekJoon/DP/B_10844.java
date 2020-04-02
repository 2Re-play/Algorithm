package baekJoon.DP;

import java.util.Scanner;

public class B_10844 {

    // 계단수
    /*
    진짜 너무 어렵다...
     */
    public static void solution () {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[][] dp = new long[n+1][10];

        long sum = 0;
        for(int k=1; k<=9; k++) {
            dp[1][k] = 1;
        }

        if(n>1) {
            for(int i=2; i<=n; i++) {
                for(int j=0; j<=9; j++) {
                    if(j == 0) dp[i][j] = dp[i-1][j+1] % 1000000000;
                    else if (j == 9) dp[i][j] = dp[i-1][j-1] % 1000000000;
                    else dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
                }
            }
        }


        for(int m=0; m<=9; m++) {
            sum = (sum + dp[n][m]) % 1000000000;
        }

        System.out.println(sum);

    }

    public static void main (String [] args) {

        solution();
    }
}
