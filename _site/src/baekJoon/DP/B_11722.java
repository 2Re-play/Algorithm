package baekJoon.DP;

import java.util.Scanner;

public class B_11722 {

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }
        dp[1] = 1;

        if(n>1) {
            for(int i=2; i<=n; i++) {
                dp[i] = 1;
                for(int j=1; j<i; j++) {
                    if(input[j] == input[i])
                        dp[i] = dp[j];
                    else if (input[i] < input[j] && dp[i] <= dp[j])
                        dp[i] = dp[j] + 1;
                }
            }
        }

        int max = 0;
        for(int i=1; i<=n; i++) {
            max = max < dp[i] ? dp[i] : max;
        }
        System.out.println(max);

    }

    public static void main(String [] args) {

        solution();
    }
}
