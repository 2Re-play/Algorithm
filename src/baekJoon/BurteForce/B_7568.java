package baekJoon.BurteForce;

import java.util.Scanner;

public class B_7568 {

    private static void solution () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] input = new int[n][2];
        int[] result = new int[n];

        // input
        for(int i=0; i<n; i++) {
            input[i][0] = sc.nextInt(); // 몸무게
            input[i][1] = sc.nextInt(); // 키
            result[i] = 1;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(input[i][0] > input[j][0] && input[i][1] > input[j][1]) {
                    result[j]++;
                }
            }
        }

        for(int rank : result) {
            System.out.print(rank + " ");
        }

    }

    public static void main(String[] args) {
        solution();
    }
}
