package baekJoon;

import java.util.Scanner;

public class B_1149 {

    public static void solution () {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[][] output = new int[size+1][3];

        for(int i=0; i<size; i++) {
            output[i][0] = sc.nextInt();
            output[i][1] = sc.nextInt();
            output[i][2] = sc.nextInt();
        }

        for(int j=1; j<=size; j++) {
            output[j][0] += Math.min(output[j-1][1],output[j-1][2]); // i번째 집이 빨강을 골랐을 경우, i-1번째와 색이 겹치지 않으면서 최솟값
            output[j][1] += Math.min(output[j-1][0],output[j-1][2]); // i번째 집이 초록을 골랐을 경우, i-1번째와 색이 겹치지 않으면서 최솟값
            output[j][2] += Math.min(output[j-1][0],output[j-1][1]); // i번째 집이 파랑을 골랐을 경우, i-1번째와 색이 겹치지 않으면서 최솟값
        }

        System.out.println(Math.min(output[size][0],Math.min(output[size][1], output[size][2]))); // 각각의 최솟값중에서 또 최솟값을 뽑아냄

    }

    public static void main (String [] args) {
        solution();
    }
}
