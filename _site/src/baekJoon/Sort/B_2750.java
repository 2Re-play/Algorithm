package baekJoon.Sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_2750 {

    public static void main (String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] data = new int[n];

            // input
            for(int i=0; i<n; i++) {
                data[i] = Integer.parseInt(br.readLine());
            }

            // sort
            int temp = 0;
            for (int j=0; j<n-1; j++) {
                while (data[j] > data[j+1]) {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    if(j>0) {
                        j--;
                    }
                }
            }

            // print
            for(int k=0; k<data.length; k++) {
                System.out.println(data[k]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
