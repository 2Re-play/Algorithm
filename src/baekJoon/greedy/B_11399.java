package baekJoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class B_11399 {

    // ATM
    private static void solution () {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int sum = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++) {
            sum += arr[i];
            answer += sum;
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        solution();
    }
}
