package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class P_findPrimeNumber {

    public static int solution(String numbers) {
        int answer = 0;
        String [] arr = numbers.split("");
        String [] output = new String[arr.length];
        boolean [] visited = new boolean[arr.length];
        ArrayList<Integer> list = new ArrayList<Integer>();


        for(int j=0; j<arr.length; j++) {
            perm(arr, output, list, visited,0, arr.length, j+1);
        }

        System.out.println(list);

        int count = 0;
        for(int i=0; i<list.size(); i++) {
            boolean status = true;
            if(list.get(i) == 0 || list.get(i) == 1){
                continue;
            } else {
                for(int k=2; k<list.get(i); k++) {
                    if(list.get(i) % k ==0){
                        status = false;
                        break;
                    }
                }
                if(status) count++;
            }
        }

        return count;
    }

    public static void perm (String [] arr,  String [] output, ArrayList<Integer> list, boolean[] visited, int depth, int n, int r ) {

        if(depth == r) {
            String sum = "";
            for(int i=0; i<r; i++) {
                sum += output[i];
            }
            if(list.contains(Integer.parseInt(sum)) == false) list.add(Integer.parseInt(sum));
            sum = "";
        }

        for(int i=0; i<n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output,list, visited,depth+1, arr.length, r);
                visited[i] = false;
            }
        }
    }

    public static void main (String [] args) {
        System.out.println(solution("011")); // 3
    }
}
