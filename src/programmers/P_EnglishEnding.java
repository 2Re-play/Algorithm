package programmers;

import java.util.ArrayList;

public class P_EnglishEnding {

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<String>();

        String temp = words[0].split("")[words[0].length() -1];
        list.add(words[0]);

        for(int i=1; i<words.length; i++) {
            if(list.contains(words[i]) || !temp.equals(words[i].split("")[0])) { // 중복된 경우
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            } else { // 중복되지 않은 경우
                temp = words[i].split("")[words[i].length() -1];
                list.add(words[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int n1 = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(solution(n1, words));
    }
}
