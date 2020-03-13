package baekJoon.DP;

import java.util.Scanner;

// 퇴사
public class B_14501 {

    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n+2][2];
        int[] dp = new int[n+2];
        int max = 0;

        for(int i=1; i<=n; i++) {
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
        }

        // 구현부

        for(int i=1; i<=n+1; i++) {
            for(int j=1; j<=i; j++) {
                dp[i] = Math.max(dp[i], dp[j]);
                if(j + input[j][0] == i) {
                    dp[i] = Math.max(dp[i], dp[j] + input[j][1]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }

    public static void main (String [] args) {
        solution();
    }
}
