package Arrays;

public class MaximumAverageSubArray {
    public static double findMaxAverage(int[] nums , int k){

        int windowSum = 0;

        for(int i=0; i<k ;i++){
            windowSum+=nums[i];
        }
        int maxSum = windowSum;

        for(int j=k;j<nums.length;j++){
            windowSum+=nums[j]-nums[j-k];
            maxSum = Math.max(windowSum,maxSum);
        }

        return (double) maxSum /k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
}
