package kakao;

import java.util.ArrayList;
import java.util.Stack;

public class Kakao_2020_blind_01 {


    public static int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int unit=1; unit<s.length()/2+1; unit++) {
            String pre = s.substring(0, unit);
            int count = 1;
            for(int i=0; i<s.length(); i++) {
                if(pre.equals(s.substring(i, i+unit))) {
                    count++;
                } else {
                    if (count == 1) {
                        sb.append(pre);
                        pre = s.substring(i, i+unit);
                    } else {
                        sb.append(count+pre);
                        pre = s.substring(i, i+unit);
                        count = 1;
                    }
                }
            }
            System.out.println(sb.toString());
            sb.delete(0, sb.length());
        }

        return answer;
    }


    public static void main(String[] args) {

        String s1 = "aabbaccc"; // 7
        String s2 = "ababcdcdababcdcd"; // 9
        String s3 = "abcabcdede"; // 8
        String s4 = "abcabcabcabcdededededede"; // 14
        String s5 = "xababcdcdababcdcd"; // 17
        System.out.println(solution(s1));

    }
}
