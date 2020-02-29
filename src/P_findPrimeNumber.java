import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P_findPrimeNumber {

    // 프로그래머스 소수찾기

    public static int solution(String numbers) {

        int maxNum = makeMaxNum(numbers.toCharArray());
        boolean[] primeNum = findPrimeNum(maxNum);

        return findMakePossiblePrimeNum(primeNum, maxNum);
    }

    private static int makeMaxNum(char[] inputNum) {
        Arrays.sort(inputNum);
        int len = inputNum.length;
        for (int i = 0; i < len/2; i++) {
            char temp = inputNum[i];
            inputNum[i] = inputNum[len - 1 - i];
            inputNum[len - 1 - i] = temp;
        }
        return Integer.parseInt(new String(inputNum));
    }

    private static boolean[] findPrimeNum(int maxNum) {
        boolean[] result = new boolean[maxNum + 1];
        for (int i = 2; i < Math.sqrt(maxNum); i++) {
            if (!result[i]) {
                for (int j = i * 2; j <= maxNum; j += i) {
                    result[j] = true;
                }
            }
        }
        return result;
    }

    private static int findMakePossiblePrimeNum(boolean[] primeNum, int maxNum) {
        int possiblePrimeNumCount = 0;

        for (int primeNumIndex = 2; primeNumIndex <= maxNum; primeNumIndex++) {
            if (!primeNum[primeNumIndex] && isPossible(maxNum, primeNumIndex)) {
                possiblePrimeNumCount++;
            }
        }
        return possiblePrimeNumCount;
    }

    private static boolean isPossible(int maxNum, int primeNum) {
        int[] numCount = countAvailableNums(maxNum);

        while(primeNum != 0) {
            if (numCount[primeNum % 10] <= 0) return false;
            numCount[primeNum % 10]--;
            primeNum /= 10;
        }

        return true;
    }

    private static int[] countAvailableNums(int maxNum) {
        char[] str = String.valueOf(maxNum).toCharArray();
        int[] numCount = new int[10];
        for (int i = 0; i < str.length; i++) {
            numCount[str[i] - '0']++;
        }
        return numCount;
    }

    public static void main (String [] args) {
        System.out.println(solution("17")); // 3
    }
}
