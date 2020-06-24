package programmers;

public class P_GymSuit {

    // 체육복
    private static void solution (int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }


        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                int prev = reserve[j] - 1;
                int next = reserve[j] + 1;
                if(prev == lost[i] || next == lost[i]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1, 3, 5};

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        solution(n1, lost1, reserve1);
    }
}
