package baekJoon.DP;

import java.util.Scanner;

public class B_1912 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = 0;
        dp[1] = arr[1];
        int max = dp[1];

        if(n > 1) {
            for(int i=2; i<=n; i++) {
                dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
                max = Math.max(max, dp[i]);
            }
        }


        System.out.println(max);


    }

    public static void main (String [] args) {

        solution();
    }
}
