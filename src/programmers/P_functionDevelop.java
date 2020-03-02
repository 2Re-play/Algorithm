package programmers;

import java.util.*;

public class P_functionDevelop {

    public static int[] solution(int[] progresses, int[] speeds) {
        int [] answer = {};
        int [] temp = new int[progresses.length];
        List<Integer> list = new ArrayList<Integer>();

        // 매칭되는 task마다 진행도를 매칭하여 몇일이 걸려야하는지 계산
        for(int i=0; i<progresses.length; i++) {
            int count = 0;
            int sum = progresses[i];
            while (sum < 100) {
                sum += speeds[i];
                count++;
            }
            temp[i] = count;
        }

        // 기준값을 설정하여 뒤에 자신보다 빨리 끝난 일이 있으면 자기의 카운트 ++
        // 자신보다 큰 값이 나오면 list에 add하고 피봇값 변경
        int pivot = temp[0];
        int count = 1;
        for(int j=1; j<temp.length; j++) {
            if(temp[j] <= pivot) {
                count++;
            } else {
                list.add(count);
                pivot = temp[j];
                count = 1;
            }
        }
        list.add(count);

        answer = new int[list.size()];
        for(int k=0; k<list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }

    public static void main (String[] args) {
        int[] progresses = {40, 93, 30, 55, 60, 65};
        int[] speeds = {60, 1, 30, 5, 10, 7};
        // [1, 2, 3]

        // [2,1]
        solution(progresses, speeds);

    }

}
