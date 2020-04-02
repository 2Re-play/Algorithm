package baekJoon.DP;

import java.util.Scanner;

public class B_9461 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] input = new int[101];
        long[] dp = new long[101];
        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;


        for(int j=1; j<=n; j++) {
            if(input[j] >= 4) {
                for(int i=4; i<=input[j]; i++) {
                    dp[i] = dp[i-2] + dp[i-3];
                }
            }
        }


        for(int i=1; i<=n; i++) {
            System.out.println(dp[input[i]]);
        }



    }

    public static void main (String [] args) {

        solution();
    }
}
