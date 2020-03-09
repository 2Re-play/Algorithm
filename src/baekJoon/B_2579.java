package baekJoon;

import java.util.Scanner;

public class B_2579 {

    // 계단오르기 (DP)
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] input = new int[n+1];
        int[] output = new int[n+1];

        for(int i=1; i<=n; i++) {
            input[i] = sc.nextInt();
        }
        if(n == 1) {
            output[0] = 0;
            output[1] = input[1];
        } else {
            output[0] = 0;
            output[1] = input[1];
            output[2] = input[1] + input[2];

            for(int j=3; j<=n; j++) {
                output[j] = Math.max(input[j-1] + output[j-3] + input[j], input[j] + output[j-2]);
            }
        }

        System.out.println(output[n]);
    }

    public static void main (String [] args) {

        solution();
    }
}
