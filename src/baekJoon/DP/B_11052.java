package baekJoon.DP;

import java.util.Scanner;

public class B_11052 {

    // 카드 구매하기
    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }

        dp[0] = 0;
        dp[1] = input[1];

        if(n > 1) {
            for(int i=2; i<=n; i++) {
                dp[i] = 1;
                for(int j=1; j<=i; j++) {
                    dp[i] = Math.max(dp[i], input[j] + dp[i-j]);
                }
            }
        }

        System.out.println(dp[n]);

    }

    public static void main (String [] args) {

        solution();
    }
}
