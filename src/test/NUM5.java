package test;

public class NUM5 {

    public static int solution(int n) {
        int answer = 5;
        int[][] m = new int[n+1][n+1];
        int[] d = new int[1001];


        for (int len = 2; len <= n; len++) {
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + d[i - 1] * d[k] * d[j];
                    m[i][j] = Math.min(m[i][j], cost);
                }
            }
        }

        return m[n][n];
    }


    public static void main (String [] args) {
        System.out.println(solution(5));

    }
}
