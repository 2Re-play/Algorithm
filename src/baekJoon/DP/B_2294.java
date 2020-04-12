package baekJoon.DP;

import java.util.Scanner;

// 동전2
public class B_2294 {

    private static void solution () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] input = new int[n+1];
        int[] dp = new int[100001];

        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }
        for(int j=1; j<=k; j++) {
            dp[j] = 100001; // 최솟값을 문제기 때문에 최댓값 + 1로 초기 세팅
        }
        dp[0] = 0;

        for(int i=1; i<=n; i++) {
            for(int j=input[i]; j<=k; j++) {
                dp[j] = Math.min(dp[j], dp[j-input[i]] + 1);
            }
        }

        System.out.println(dp[k] == 100001 ? -1 : dp[k]);

    }

    public static void main(String[] args) {
        solution();
    }
}
