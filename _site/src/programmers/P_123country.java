package programmers;

public class P_123country {

    public static String solution(int n) {
        String answer = "";

        int rest = 0;

        while (n > 0) {
            rest = n % 3; // 나머지
            n /= 3; // 몫

            if(rest == 0) { // 나머지가 0일 때 4로 바꿔주기
                n -= 1;
                rest = 4;
            }
            answer = rest + answer ; // 뒤에서부터 앞으로 채우기
        }

        return answer;
    }

    public static void main (String [] args) {

        solution(6);

    }
}
