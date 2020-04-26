package baekJoon.BurteForce;

import java.util.Scanner;

public class B_1018 {

    private static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];

        for(int i=0; i<n; i++) {
            String temp = sc.nextLine();
            for(int j=0; j<m; j++) {
                arr[i][j] = temp.split("")[j];
            }
        }



    }

    public static void main(String[] args) {
        solution();
    }
}
