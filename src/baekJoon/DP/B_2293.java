package baekJoon.DP;

import java.util.Scanner;

public class B_2293 {

    // 동전 1
    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n+1];
        int[] dp = new int[k+1];

        // input
        for (int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }

        dp[0] = 1;

        for (int i=1; i<=n; i++) {
            for(int j = input[i]; j<=k; j++) {
                dp[j] += dp[j - input[i]];
            }
        }

        System.out.println(dp[k]);

    }

    public static void main(String[] args) {
        solution();
    }
}
