package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class P_level1_HateSameNumber {

    // 프로그래머스 level1 같은 숫자는 싫어
    private static int[] solution (int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int prev = -1;
        for(int item : arr) {
            if(prev != item) {
                list.add(item);
                prev = item;
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,3,3,0,1,1}; // [1,3,0,1]
        int[] arr2 = {4,4,4,3,3}; // [4,3]
        int[] anwer = solution(arr1);
        for(int item : anwer) {
            System.out.println(item);
        }
    }
}
