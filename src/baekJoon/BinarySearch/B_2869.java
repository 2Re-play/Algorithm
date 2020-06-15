package baekJoon.BinarySearch;

import java.util.Scanner;

public class B_2869 {

    // 달팽이는 올라가고 싶다.
    private static void solution () {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int left = 0;
        int right = v;
        int mid = 0;
        int answer = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if(v <= (mid-1)*(a-b)+a) {
                right = mid - 1;
                answer = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        solution();
    }
}
