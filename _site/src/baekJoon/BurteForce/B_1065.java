package baekJoon.BurteForce;

import java.util.Scanner;

public class B_1065 {

    public static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 99;

        if(n < 100) {
            System.out.println(n);
        } else {
            for(int i=100; i<=n; i++) {
                // 등차수열인지 판별 로직
                int num1 = i % 10;
                int num2 = (i / 10) % 10;
                int num3 = (i / 100) % 10;
                if(num3 - num2 == num2 - num1) {
                    answer++;
                }
                if(i == 1000) answer--;
            }
            System.out.println(answer);
        }

    }

    public static void main(String[] args) {
        solution();
    }
}
