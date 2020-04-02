package baekJoon.DP;

import java.util.Scanner;

public class B_1010 {

    // 다리 놓기
    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] result = new long[T];

        for(int i=0; i<T; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] dp = new long[n+1][m+1];

            for(int temp=1; temp<=m; temp++){
                dp[1][temp] = temp;
            }


            for(int j=2; j<=n; j++) {
                for(int k=j; k<=m; k++) {
                    for(int t = k-1; t>=j-1; t--) {
                        dp[j][k] += dp[j-1][t];
                    }
                }
            }

            result[i] = dp[n][m];
        }

        for(long item : result) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        solution();

    }
}
