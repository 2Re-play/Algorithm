package daily;

public class Daily20200209 {

    public static void solution (String[] input) {

        StringBuilder standard = new StringBuilder();
        int answer = 1;
        for(int i=0; i<input.length; i++) {
            if(i == 0) {
                standard.append(input[i]);
                answer = input[i].length();
            } else {
                for(int j=standard.length(); j>1; j--) {
                    for(int k=0; k<standard.length() - j; k++) {
                        if(input[i].contains(standard.toString().substring(k , j+k))) {
                            String temp = input[i].substring(k, j+k);
                            standard.delete(0, standard.length());
                            standard.append(temp);
                            answer = j;
                        }
                    }
                }
            }
        }
        System.out.println(standard.toString());
        System.out.println(answer);

    }


    public static void main (String [] args) {
        String [] input = {"apple", "apps", "ap"};
        String [] input2 = {"hawaii", "happy"};
        String [] input3 = {"dog", "dogs", "doge"};
        solution(input);
        solution(input2);
        solution(input3);


    }
}
