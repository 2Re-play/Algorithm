package test;

public class NUM3 {
    public static int solution(int N) {

        int[] dp = new int[N+1];

        dp[0] = 0;
        if(N == 1) {
            dp[1] = 1;
        } else if (N == 2) {
            dp[1] = 1;
            dp[2] = 2;
        } else {
            dp[1] = 1;
            dp[2] = 2;
            for(int i=3; i<=N; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[N];
    }

    public static void main (String [] args) {
        System.out.println(solution(3));

    }
}
