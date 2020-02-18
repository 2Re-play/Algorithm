import java.util.*;

public class P_functionDevelop {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> answer2 = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<progresses.length; i++) {
            int sum = progresses[i];
//            if(sum + speeds[i] <= 100) {
                int index = 0;
                while(sum < 100) {
                    sum += speeds[i];
                    index++;
                }
                queue.add(index);
//            }
        }
        System.out.println(queue);
        int j = 0;
        int max = queue.poll(); // 7 // 9
        answer2.add(j,1);
        while (queue.peek() != null) {
            int temp = queue.poll();
            if(max > temp) { // 7 > 3
                int x = answer2.get(j);
                answer2.set(j, x+1); //2
            } else {
                answer2.add(j+1, 1);
                max = temp;
                j++;
            }
        }
        answer = new int[answer2.size()];
        for(int k = 0; k<answer2.size(); k++) {
            System.out.println(answer2.get(k));
            answer[k] = answer2.get(k);
        }

        return answer;
    }

    public static void main (String[] args) {
        int[] progresses = {93, 30, 55, 60, 40, 65};
        int[] speeds = {1, 30, 5, 10, 60, 7};

        solution(progresses, speeds);

    }

}
