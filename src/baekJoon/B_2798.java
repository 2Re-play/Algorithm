package baekJoon;

import java.util.Scanner;

public class B_2798 {


    public static void solution () {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        String buffer = sc.nextLine();
        String[] tmp = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }

        int max = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    if(max == 0) {
                        if(arr[i] + arr[j] + arr[k] <= target) {
                            max = arr[i] + arr[j] + arr[k];
                        }
                    } else {
                        if(arr[i] + arr[j] + arr[k] <= target) {
                            int temp = arr[i] + arr[j] + arr[k];
                            if (temp <=target && max < temp) max = arr[i] + arr[j] + arr[k];
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void main (String [] args) {

        solution();

    }
}
