package baekJoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class B_1463 {

    // 1로 만들기 (DP)
    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 0; // 0과 1일 때는 반복횟수가 0이다.

        // Bottom-up
        for (int i = 2; i <= n; i++) { //최종 숫자는 n이기 때문에 n까지 반복연산
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }
        System.out.println(dp[n]);
        sc.close();


    }

    public static void main (String [] args) {

        solution();
    }
}
