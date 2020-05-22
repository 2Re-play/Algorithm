package programmers;

public class P_origami {
    // 종이접기

    private static int[] solution (int n) {
        StringBuilder sb = new StringBuilder('0');

        while (n > 0) {
            String str = sb.toString();
            sb.append('0');

            for(int i = str.length() - 1; i>= 0; i--) {
                if(str.charAt(i) == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
            n--;
        }

        int[] result = new int[sb.length()];

        for(int i=0; i<result.length; i++) {
            System.out.println(sb.charAt(i) - '0');
            result[i] = sb.charAt(i) - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
