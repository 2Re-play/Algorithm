package programmers.level2;


import java.util.ArrayList;

public class P_makeMaxNumber {

    public static String solution(String number, int k) {

        StringBuilder sb = new StringBuilder(number);
        int count = 0;
        int index = 1;

        while(count != k) {
            if(index >= 1 &&Integer.parseInt(String.valueOf(sb.charAt(index - 1))) <  Integer.parseInt(String.valueOf(sb.charAt(index)))) {
                sb.deleteCharAt(index-1);
                index--;
                count++;
            } else {
                if(index == sb.length() - 1 && sb.charAt(index) <= sb.charAt(index-1)) {
                    sb.deleteCharAt(index);
                    index --;
                    count++;
                }
                else {
                    index ++;
                }
            }
        }

        return sb.toString();
    }


    public static void main (String[] args) {

        String number1 = "1924"; // 94
        int k1 = 2;
        String number2 = "1231234"; // 3234
        int k2 = 3;
        String number3 = "4177252841"; // 775841
        int k3 = 4;

        System.out.println(solution(number2, k2)); //94
    }
}
