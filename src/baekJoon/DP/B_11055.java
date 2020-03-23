package baekJoon.DP;

import java.util.Scanner;

public class B_11055 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n+1];

        int[] dp = new int[n+1];

        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }

        for(int i=1; i<=n; i++) {
            dp[i] = input[i];
            for(int j=1; j<i; j++) {
                if(input[i] > input[j] && dp[i] < dp[j] +input[i]) {
                    dp[i] = dp[j]+input[i];
                }
            }
        }

        int max = 0;
        for(int item : dp) {
            max = max < item ? item : max;
        }
        System.out.println(max);


    }

    public static void main(String[] args) {
        solution();
    }
}
