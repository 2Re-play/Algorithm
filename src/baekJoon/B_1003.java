package baekJoon;

import java.util.Scanner;

public class B_1003 {

    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];

        for(int j=0; j<size; j++) {
            input[j] = sc.nextInt();
        }

        int [][] output = new int[41][2];

        output[0][0] = 1;
        output[0][1] = 0;
        output[1][0] = 0;
        output[1][1] = 1;
        output[2][0] = 1;
        output[2][1] = 1;

        for(int i=0; i<input.length; i++) {
            for(int j=3; j<=input[i]; j++) {
                output[j][0] = output[j-1][0] + output[j-2][0];
                output[j][1] = output[j-1][1] + output[j-2][1];
            }
            System.out.println(output[input[i]][0]+" "+output[input[i]][1]);
        }

    }


    public static void main (String [] args) {
        solution();
    }
}
