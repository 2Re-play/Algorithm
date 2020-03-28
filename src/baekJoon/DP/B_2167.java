package baekJoon.DP;

import java.util.Scanner;

public class B_2167 {

    // 2차원 배열의 합
    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] input = new int[n+1][m+1];

        // input
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                input[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int[][] target = new int[k+1][4];

        for(int i=1; i<=k; i++) {
            target[i][0] = sc.nextInt(); // i
            target[i][1] = sc.nextInt(); // j
            target[i][2] = sc.nextInt(); // x
            target[i][3] = sc.nextInt(); // y
        }

        int[] result = new int[k+1];

        for(int i=1; i<=k; i++) {
            for(int j=target[i][0]; j<=target[i][2]; j++) {
                for(int l=target[i][1]; l<=target[i][3]; l++) {
                    if(j==target[i][0] && l>=target[i][1] || j > target[i][0] && l<=target[i][3]) {
                        result[i] += input[j][l];
                    }

                }
            }
        }


        // output
        for(int i=1; i<=k; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
