package practice;

import java.util.Scanner;

public class Palindron {

    public static int palindron () {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String text = input.toString();
        String reverseText = input.reverse().toString();
        int answer = 0;

        for(int i = text.length(); i>1; i--) {
            for (int j=0; j<=text.length()-i; j++) {
                if(reverseText.contains(text.substring(j, i+j))){
                    answer = i;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static int palindrome () {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String text = input.toString();
        String reverseText = input.reverse().toString();
        input.delete(0, input.toString().length());
        int answer = 0;

        for(int i = text.length(); i>1; i--) {
            for(int j=0; j<=text.length()-i; j++) {
                if (reverseText.contains(text.substring(j,i+j))) {
                    input.append(text.substring(j,i+j));
//                    return input.toString();
                    answer = i;
                    return answer;
//                    System.out.println(i);
                }
            }
        }
        return answer;
//        System.out.println(answer);
//        return input.toString();
    }

    public static void main (String [] args) {
//palindrome();
        System.out.println(palindrome());
    }

}
