package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class P_StringSorting {

    private static String[] solution (String[] stirngs, int n) {

        Arrays.sort(stirngs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char s1 = o2.charAt(n);
                char s2 = o1.charAt(n);
                if(s1 == s2) {
                    return o1.compareTo(o2);
                }
                return  s2 - s1;
            }
        });
        return stirngs;
    }

    public static void main(String[] args) {
        String[] strings1 = {"sun", "bed", "car"};
        int n1 = 1;
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        for(String item : solution(strings2, n2)) {
            System.out.println(item);
        }
    }
}
