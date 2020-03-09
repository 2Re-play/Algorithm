package baekJoon.DP;

import java.util.Scanner;

public class B_9095 {

    // 1,2,3 더하기 (DP)
    /*
    d[n] = d[n-1] + d[n-2] + d[n-2];

    1 -> 1 : 1개
    2 -> 1+1, 2개 : 2개
    3 -> 1+1+1, 1+2, 2+1, 3 : 4개
    dn [1] = d[n-1] + 1;
    db [2] = d[n-2] + 2;
    dn [3] = d[n-3] + 3;
     */
    public static void solution () {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] input = new int[size];

        for(int i=0; i<size; i++) {
            input[i] = sc.nextInt();
        }
        int[] output = new int[11];
        output[0] = 0;
        output[1] = 1;
        output[2] = 2;
        output[3] = 4;

        for(int i=0; i<size; i++) {
            for(int j=4; j<=input[i]; j++) {
                output[j] = output[j-1] + output[j-2] + output[j-3];
            }
        }

        for(int j=0; j<size; j++) {
            System.out.println(output[input[j]]);
        }
    }

    public static void main (String [] args) {
        solution();

    }
}
