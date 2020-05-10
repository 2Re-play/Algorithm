package programmers;

import java.util.ArrayList;

public class P_MockExam {

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i=0; i<answers.length; i++) {
            if(person1[i%person1.length] == answers[i]) count1++;
            if(person2[i%person2.length] == answers[i]) count2++;
            if(person3[i%person3.length] == answers[i]) count3++;
        }

        int max = Math.max(Math.max(count1, count2), count3);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == count1) list.add(1);
        if(max == count2) list.add(2);
        if(max == count3) list.add(3);

        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5}; // [1]
        System.out.println(solution(answers));
    }
}
