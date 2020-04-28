package kakao;

import java.util.ArrayList;
import java.util.Arrays;

public class Kakao_2019_winter_intern_03 {

    static int answer = 0;
    static ArrayList<String> list;

    public static int solution(String[] user_id, String[] banned_id) {
        boolean[] visited = new boolean[user_id.length];
        list = new ArrayList<>();
        dfs(0, visited, user_id, banned_id);
        return answer;
    }

    private static void dfs (int v, boolean[] visited, String[] user_id, String[] banned_id) {
        if (v == user_id.length) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<visited.length; i++) {
                if (visited[i] == true) sb.append("1");
                else sb.append("0");
            }
            if (!list.contains(sb.toString())) {
                list.add(sb.toString());
                answer++;
            }
            return;
        }

        for (int i = 0; i < user_id.length; i++) {
            // i번째 원소가 단계에서 사용되지 않았을 경우 bangmoon[i] == false이다.
            if (visited[i] == false && "11010".charAt(i) == '1') {
                visited[i] = true;
                dfs(v + 1, visited, user_id, banned_id);
                visited[i] = false;
            }
        }


    }



    public static void main(String[] args) {
        String[] user_id1 = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id1 = {"fr*d*", "abc1**"};// 2
        String[] user_id2 = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id2 = {"*rodo", "*rodo", "******"}; // 2
        String[] user_id3 = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned_id3 = {"fr*d*", "*rodo", "******", "******"}; // 3

        System.out.println(solution(user_id1, banned_id1));

    }
}
