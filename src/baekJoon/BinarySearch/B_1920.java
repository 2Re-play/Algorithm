package baekJoon.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class B_1920 {

/*
5
4 1 5 2 3
5
1 3 7 9 5
 */
    private static void solution () {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        long[] compareArray = new long[m];
        for(int i=0; i<m; i++) {
            compareArray[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for(int j=0; j<compareArray.length; j++) {
            int left = -1;
            int right = n;
            int middle;
            int flag = 0;
            while(right - left > 1) {
                middle = (left + right) / 2;

                if(compareArray[j] == array[middle]) {
                    flag = 1;
                    break;
                } else {
                    if(compareArray[j] < array[middle]) {
                        right = middle;
                    } else {
                        left = middle;
                    }
                }
            }
            System.out.println(flag);
        }
    }

    public static void main (String [] args) {
        solution();
    }

}
