//import java.util.Arrays;
//
//public class P_HIndex {
//
//    public static int solution(int[] citations) {
//        int answer = 0;
//        int sum = 0;
//        int avg = 0;
//        int max = 0;
//        int min = 0;
//        for(int i=0; i<citations.length; i++) {
//            sum += citations[i];
//        }
//        avg = sum / citations.length;
//        for(int j=0; j<citations.length; j++) {
//            if(avg < citations[j]) {
//                min++;
//            } else {
//                max++;
//            }
//        }
//        if(min <= avg && max >= avg) {
//        } else if (min )
//        return answer;
//    }
//
//    public static void main (String[] args) {
//        int[] citations = {3, 0, 6, 1, 5};
//        System.out.println(solution(citations));
//
//    }
//}
