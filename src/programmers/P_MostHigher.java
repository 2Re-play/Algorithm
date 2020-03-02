package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P_MostHigher {

    public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        for(int i = 0; i<numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo((o1+o2));
            }
        });

        if(arr[0] == "0") {
            return "0";
        }

        for(int j=0; j<arr.length; j++) {
            answer += arr[j];
        }
        return answer;
    }


    public static void main (String[]args){
        int[] array = {3, 30, 34, 5, 9};
        System.out.println(solution(array));

    }
}
