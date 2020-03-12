package test;

public class Num1 {


    public static int solution(int n) {
        int answer = 0;

        for( int i = 5; i<= n; i*=5) {
            answer += n/i;
        }

        return answer;
    }
//    public static int solution2(int n) {
//        int answer = 0;
//
//        int input = 1;
//
//        for(int i=1; i<=n; i++) {
//            input = i;
//
//            while(input % 2 == 0 || input % 5 == 0) {
//                if(input % 2 == 0) {
//                    input /= 2;
//                }
//                if(input % 5 == 0) {
//                    input /= 5;
//                    answer++;
//                }
//            }
//        }
//
//        return answer;
//    }

    public static void main (String [] args) {
        System.out.println(solution(10));

    }
}
