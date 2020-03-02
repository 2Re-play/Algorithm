package practice;

import java.util.Scanner;

public class Permutation {

    public static void permutation (int[] arr, int[] output, boolean[] visited, int depth, int start, int r) {

        if(depth == r) {
            for(int i=0; i<r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<start; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth+1, start, r);
                visited[i] = false;
            }
        }
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        int [] arr = new int[n];
        int [] output = new int[n];
        boolean [] visited = new boolean[n];

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }
        permutation(arr, output, visited,0, n, n);
    }
}
