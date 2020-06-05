package programmers;

public class P_TargetNumber {

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(0,0,numbers, target);
        return answer;
    }

    public static int dfs (int index, int sum, int[] numbers, int target) {
       if(index == numbers.length) {
           if(sum == target) {
               return 1;
           }
           return 0;
       }
       return dfs(index+1,sum+numbers[index], numbers, target) + dfs(index+1, sum-numbers[index], numbers, target);
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(solution(arr , 3));
    }
}
