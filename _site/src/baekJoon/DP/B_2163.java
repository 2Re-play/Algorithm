package baekJoon.DP;

import java.util.Scanner;

public class B_2163 {

    // 초콜릿 자르기
    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dp = new int[m+1];

        dp[1] = n-1;

        for(int i=2; i<=m; i++) {
            dp[i] = dp[i-1] + n;
        }

        System.out.println(dp[m]);
    }

    public static void main (String [] args) {
        solution();
    }
}
