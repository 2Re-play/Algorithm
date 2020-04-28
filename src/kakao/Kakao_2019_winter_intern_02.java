package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Kakao_2019_winter_intern_02 {

    public static int[] solution(String s) {
        int[] answer = {};
        String[] tuples = s.substring(2,s.length()-2).replace("},{","-").split("-");
        ArrayList<String> result = new ArrayList<String>();
        Arrays.sort(tuples, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for(int i=0; i<tuples.length; i++) {
            String[] temp = tuples[i].split(",");
            for(int j=0; j<temp.length; j++) {
                if(!result.contains(temp[j])) {
                    result.add(temp[j]);
                }
            }
        }

        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = Integer.parseInt(result.get(i));
        }

        return answer;
    }



    public static void main(String[] args) {

        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}"; // [2, 1, 3, 4]
        String s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}"; // [2, 1, 3, 4]
        String s3 = "{{20,111},{111}}"; // 	[111, 20]
        System.out.println(solution(s3));
    }
}
