package programmers;

import java.util.Stack;

public class P_rightBlock {

    // 괄호 짝 맞는지 검사

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else  {
                if(!stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }


    public static void main (String [] args) {

        System.out.println(solution("()"));

    }
}
