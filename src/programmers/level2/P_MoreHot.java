package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

public class P_MoreHot {

    // 더 맵게
    private static int solution(int[] scoville, int K) {

        Arrays.sort(scoville);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int item : scoville) {
            list.add(item);
        }
        int count = 0;

        while(true) {
            if(list.get(0) < K) {
                if(list.size() <= 2) {
                    int first = list.get(0);
                    int second = list.get(1);
                    int newData = first + (second * 2);
                    if(newData < K) {
                        return -1;
                    }else {
                        return count;
                    }
                } else {
                    int first = list.get(0);
                    int second = list.get(1);
                    int newData = first + (second * 2);
                    list.remove(0);
                    list.remove(1);
                    list.add(0, newData);
                    count++;
                }
            } else {
                return count;
            }
        }
    }
    public static void main(String[] args) {
        int[] scoville = {1, 2};
        int k = 7; // 2
        solution(scoville, k);
    }
}
