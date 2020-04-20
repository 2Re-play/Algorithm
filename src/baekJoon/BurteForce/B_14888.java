package baekJoon.BurteForce;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class B_14888 {

    static int[] input;
    static int[] op;
    static int n;
    static int min = 1000000000;
    static int max = -1000000000;

    private static void solution () {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        input = new int[n];
        op = new int[4]; // +, -, *, / 순서대로 input

        for(int i=0; i<n; i++) {
            input[i] = sc.nextInt();
        }
        for(int j=0; j<4; j++) {
            op[j] = sc.nextInt();
        }
        dfs(1, input[0]);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs (int x, int sum) {
        for (int i=0; i<4; i++) {
            if(op[i] != 0) {
                op[i]--;
                switch (i) {
                    case 0 : dfs(x+1, sum + input[x]);
                    break;
                    case 1 : dfs(x+1, sum - input[x]);
                    break;
                    case 2 : dfs(x+1, sum * input[x]);
                    break;
                    case 3 : dfs(x+1, sum / input[x]);
                    break;
                }
                op[i]++; // 다시 연산자 처음 값으로 초기화
            }
        }
        if(x == n) {
            max = max < sum ? sum : max;
            min = min > sum ? sum : min;
        }
    }

    public static void main(String[] args) {
        solution();

    }
}
