package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1920 {

/*
5
4 1 5 2 3
5
1 3 7 9 5
 */
    public static void main (String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] beforeArray = br.readLine().split(" ");
        int [] array = new int[n];

        for (int i=0; i<n; i++) {
            array[i] = Integer.parseInt(beforeArray[i]);
        }

        Arrays.sort(array); // 비교대상

        int m = Integer.parseInt(br.readLine());
        String [] beforeComapreArray = br.readLine().split(" ");
        int [] compareArray = new int[m];

        for (int j=0; j<m; j++) {
            compareArray[j] = Integer.parseInt(beforeComapreArray[j]);
        }

        for(int k=0; k<m; k++) {
            int flag = 0;
            int max = m;
            int min = -1;
            int middle;

            while (max - min > 1) {
                middle = (min + max) / 2;
                if(compareArray[k] == array[middle]) {
                    flag = 1;
                    break;
                }
                if(compareArray[k] > array[middle]) {
                    min = middle;
                } else if (compareArray[k] < array[middle]) {
                    max = middle;
                }
            }
            System.out.println(flag);
        }
    }

}
