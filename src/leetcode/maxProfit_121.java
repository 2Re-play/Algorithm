package leetcode;

public class maxProfit_121 {

    public static int maxProfit(int[] prices) {
        int sum = 0;
        for(int i=0; i<prices.length; i++) {
            for(int j=prices.length -1; j>i; j--) {
                if(prices[i] < prices[j]) {
                    sum = sum < prices[j]- prices[i] ? prices[j] - prices[i] : sum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices1));
    }
}
