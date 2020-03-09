package baekJoon.BurteForce;

import java.util.Arrays;
import java.util.Scanner;

public class B_2309 {

    /*
    백준 2309번, 백설공주와 일곱난쟁이
     */
    public static void solution () {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[9];
        int sum = 0;
        boolean status = false;
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        for(int i=0; i<9; i++) {
            if(status) break;
            for(int j=0; j<9; j++) {
                if(i==j) continue;
                if(sum - arr[i] - arr[j] == 100) {
                    arr[i] = 0;
                    arr[j] = 0;
                    status = true;
                    break;
                }
            }
        }
        Arrays.sort(arr);

        for(int i=2; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main (String [] args) {

        solution();
    }
}
