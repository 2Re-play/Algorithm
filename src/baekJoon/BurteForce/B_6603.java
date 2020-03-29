package baekJoon.BurteForce;

import java.util.Scanner;

public class B_6603 {

    // 로또
    public static void solution () {

        Scanner sc = new Scanner(System.in) ;

        while (true) {
            int T = sc.nextInt();
            if(T == 0) break;
            int[] input = new int[T];

            for(int i=0; i<T; i++) {
                input[i] = sc.nextInt();
            }


        }
    }

    public static void main(String[] args) {
        solution();
    }
}