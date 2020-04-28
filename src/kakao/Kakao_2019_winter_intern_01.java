package kakao;

import java.util.Stack;

public class Kakao_2019_winter_intern_01 {

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int n = board.length;
        int[][] newBoard = new int[n][n];
        Stack<Integer> basket = new Stack<Integer>();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                newBoard[i][j] = board[j][i];
            }
        }

        for(int i=0; i<moves.length; i++) {
            int pick = moves[i] -1;
            int pickItem;
            int index = 0;
            while (true) {
                if(newBoard[pick][index] == 0) {
                    if(index == n-1) {
                        break;
                    }
                    index++;
                } else {
                    pickItem = newBoard[pick][index];
                    newBoard[pick][index] = 0;
                    if(!basket.isEmpty() && basket.peek() == pickItem) {
                        basket.pop();
                        answer += 2;
                        index = 0;
                    } else {
                        basket.push(pickItem);
                        index = 0;
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0},
                         {0,0,1,0,3},
                         {0,2,5,0,1},
                         {4,2,4,4,2},
                         {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4}; // result : 4
        System.out.println(solution(board, moves));
    }
}
