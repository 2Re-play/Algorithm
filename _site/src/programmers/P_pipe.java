package programmers;

import java.util.Stack;

public class P_pipe {

    public static int solution(String arrangement) {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<arrangement.length(); i++) {
            if(arrangement.charAt(i) == '(') {
                stack.push(arrangement.charAt(i));
            } else {
                stack.pop();
                if(arrangement.charAt(i-1) == '(') {
                    answer += stack.size(); // 레이저를 만나 절단됐을 경우
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String [] args) {

        System.out.println(solution("()(((()())(())()))(())"));
    }
}
