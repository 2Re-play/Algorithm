package baekJoon;

import java.util.Scanner;

public class B_11726 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] output = new int[1001];
        output[0] = 0;
        output[1] = 1;
        output[2] = 2;

        for(int i=3; i<=n; i++) {
            output[i] = output[i-1] + output[i-2];
            output[i] %= 10007;
        }
        System.out.println(output[n]);
    }

    public static void main (String [] args) {
        solution();

    }
}
