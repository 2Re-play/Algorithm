package baekJoon.DP;

import java.util.Scanner;

public class B_11727 {

    // 2xn 타일링 2
    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[0]=0;
        if(n == 1) {
            dp[1]=1;
        } else {
            dp[1]=1;
            dp[2]=3;
        }
        if(n>2) {
            for(int i=3; i<=n; i++) {
                dp[i] = (dp[i-1] + (2*dp[i-2])) % 10007;
            }
        }

        System.out.println(dp[n]%10007);

    }

    public static void main (String [] args) {
        solution();
    }
}
