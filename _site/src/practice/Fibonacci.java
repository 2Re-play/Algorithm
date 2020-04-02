package practice;

public class Fibonacci {

    public static int fibonacci (int n) {
        if( n <= 1) {
            return n;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int seqFibonacci (int n) {
        if(n <= 1) {
            return n;
        } else {
            int result = 0;
            int temp1 = 1;
            int temp2 = 0;
            for(int i = 2; i < n; i++) {
                result = temp1 + temp2;
                temp2 = temp1;
                temp1 = result;
            }
            return result;
        }
    }


    public static void main (String [] args) {
        int input = 50;

        for (int i= 1; i<= input; i++) {
            System.out.println(fibonacci(i));
        }
//        for(int i= 1; i<input; i++) {
//            System.out.println(seqFibonacci(i));
//        }

    }
}
