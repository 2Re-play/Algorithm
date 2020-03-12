package test;

public class NUM2 {

    public static long solution(int r, int c) {

        int[][] dp = new int[r+1][c+1];

        for(int i=0; i<=r; i++) {
            dp[i][0] = 1;
            dp[0][i] = 0;
        }

        for(int i=1; i<=r; i++) {
            for(int j=1; j<=c; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[r][c-1];
    }

    public static void main (String [] args) {
        System.out.println(solution(1,4));
    }
}
