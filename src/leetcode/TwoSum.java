package leetcode;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=nums.length-1; j>i; j--) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }
}
