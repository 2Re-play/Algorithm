package kakao;

import java.util.Arrays;

public class Kakao_2019_winter_intern_05 {

    public static int solution(int[] stones, int k) {
        int answer = 0;
        int [] arr = Arrays.copyOf(stones, stones.length);
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length -1];
        int mid;

        while (min <= max) {
            mid = (min + max) / 2;

            int zeroCount = 0;
            int maxZeroCount = 0;

            for(int i=0; i<stones.length; i++) {
                if(stones[i] >= mid) {
                    zeroCount = 0;
                } else {
                    zeroCount++; // 0이 되는 연속된 돌의 갯수를 센다.
                    maxZeroCount = Math.max(maxZeroCount, zeroCount); // 계속해서
                }
            }
            if(maxZeroCount > k-1) { // 돌의 연속된 최대 갯수가 > 점프할 수 잇는 수 - 1
                max = mid - 1;
            } else {
                answer = Math.max(answer, mid);
                min = mid + 1;
            }
        }
        return answer;
    }



    public static void main(String[] args) {

        int k = 3;
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        System.out.println(solution(stones, k));

    }
}
