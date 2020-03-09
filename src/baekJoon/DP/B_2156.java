package baekJoon.DP;

import java.util.Scanner;

public class B_2156 {

    // 포도주 마시기
    /*
    3번 연속 잔을 마실 수 없다는 조건이 있다.
    이 말은 즉, 0번 연속, 1번 연속, 2번 연속 마실 수 있다는 말로 표현할 수 있다.
    각각의 케이스로 나눠서 점화식을 세워보면
    case 0번 연속 : dp[n] = dp[n-1];
    case 1번 연속 : dp[n] = dp[n-2] + arr[n];
    case 2번 연속 : dp[n] = dp[n-3] + arr[n-1] + arr[n];
    으로 만들 수 있으며 이 값중 최댓값을 뽑아내면 가장 많이 마실 수 있는 양을 찾을 수 있다.
     */

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n+1];
        int[] dp = new int [n+1];

        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }

        dp[0] = 0;
        dp[1] = input[1];
        dp[2] = input[1] + input[2];


        for(int i=3; i<=n; i++) {
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + input[i] , dp[i-3] + input[i-1] + input[i]));
        }

        System.out.println(dp[n]);


    }

    public static void main (String [] args) {

        solution();
    }
}
