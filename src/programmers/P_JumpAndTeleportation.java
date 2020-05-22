package programmers;

public class P_JumpAndTeleportation {

    private static int solution (int n) {
        int answer = 0;

        while (n > 0) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n--;
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int n = 23;
        System.out.println(solution(n));
    }
}
