package baekJoon.BurteForce;

import java.util.Scanner;

public class B_1107 {

    // 리모컨
    private static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] button = new boolean[10]; // 고장난 버튼 ture, 고장나지 않은 버튼 false

        for (int i = 0; i < m; i++) {
            button[sc.nextInt()] = true;
        }

        int answer = Math.abs(n - 100);
        for(int i=0; i<1000000; i++) {
            int length = onlyButton(i, button);
            if (length > 0) {
                int press = Math.abs(i - n);
                if (answer > length + press) {
                    answer = length + press;
                }
            }
        }
        System.out.println(answer);
    }

    private static int onlyButton (int n, boolean[] button) {
        if (n == 0) {
            if(button[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int answer = 0;
        while (n > 0) {
            if (button[n % 10]) {
                return 0;
            }
            answer += 1;
            n /= 10;
        }
        return answer;
    }



    public static void main(String[] args) {
        solution();
    }
}
