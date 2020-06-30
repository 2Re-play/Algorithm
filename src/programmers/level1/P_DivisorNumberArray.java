package programmers.level1;

import java.util.*;

public class P_DivisorNumberArray {

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int item : arr) {
            if(item % divisor == 0) {
                list.add(item);
            }
        }
        if(list.size() == 0) return new int[] {-1};

        Collections.sort(list);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3,2,6};
        int divisor1 = 5;
        int divisor2 = 1;
        int divisor3 = 10;

        System.out.println(solution(arr1, divisor1));
    }

}
