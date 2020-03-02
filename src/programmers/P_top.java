package programmers;

import java.util.Stack;

public class P_top {

        public static int[] solution(int[] heights) {
            int[] answer = new int[heights.length];
            Stack<Integer> stack = new Stack<Integer>();
            int sender, receiver;
            for(int i=0; i<heights.length; i++) {
                stack.push(heights[i]);
            }

            for(int k= stack.size() - 1; k>=0; k--) {
                sender = stack.pop();

                int rollBackCount = 0;

                while(!stack.empty()) {
                    receiver = stack.pop();
                    rollBackCount++;
                    if(sender < receiver) {
                        answer[k] = (k - rollBackCount) + 1;
                        break;
                    }
                }
                for(int j=k - rollBackCount; j<k; j++) {
                    stack.push(heights[j]);
                }

            }
            for(int i =0; i<answer.length; i++) {
                System.out.println(answer[i]);
            }
            return answer;
        }

    public static void main (String [] args) {

        //input : [6,9,5,7,4]
        //output : [0,0,2,2,4]
        int [] height = {6,9,5,7,4};
        int [] height2 = {3,9,9,3,5,7,2};
        int [] height3 = {1,5,3,6,7,6,5};
        System.out.println(solution(height3));
    }
}
