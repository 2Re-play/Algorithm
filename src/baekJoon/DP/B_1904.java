package baekJoon.DP;

import java.util.Scanner;

public class B_1904 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];

        dp[0] = 0;
        if(n == 1) {
            dp[1] = 1;
        } else if (n == 2 ) {
            dp[2] = 2;
        } else {
            dp[1] = 1;
            dp[2] = 2;
            for(int i=3; i<=n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
                dp[i] %= 15746;
            }
        }
        System.out.println(dp[n]);
    }

    public static void main (String [] args) {

        solution();
    }
}
