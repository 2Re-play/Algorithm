import java.util.Scanner;

public class G {

    public static String test (String s) {

        int count = 0;

        String output = "";
        if (!s.isEmpty()) {
            char actual = s.charAt(0);
            for (char c : s.toCharArray()) {
                if (actual == c) {
                    count++;
                } else {
                    output += actual + Integer.toString(count);
                    actual = c;
                    count = 1;
                }
            }
            if (count > 0) {
                output += actual + Integer.toString(count);
            }
        }
        return output;
    }

    public static void main (String [] args) {

        System.out.println(test("aaabb"));


    }
}
