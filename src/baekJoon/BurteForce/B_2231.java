package baekJoon.BurteForce;

import java.util.Scanner;

public class B_2231 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 분해합
        int min = n;

        for(int i=1; i<n; i++) {

            // 해당 수가 n의 분해합인지 확인하는 로직
            int result = 0;
            int temp = i;

            while(temp>0) {
                result += temp % 10;
                temp /= 10;
            }
            // 최솟값 갱신
            if(i+result == n) min = i < min ? i : min;
        }
        // 최솟값 출력
        if(min == n) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }

    }

    public static void main(String[] args) {
        solution();
    }
}
