package solutionsLett.MaximumAverageSubarray;
/*
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int left = 0;
        int right = nums.length - 1;

       for(int i = 0; i < k; i++){
           sum += nums[i];
       }

       double result = sum;
       for( int i = k; i < nums.length; i++){
           sum += nums[i] - nums[i - k];
           result = Math.max(result, sum);
       }

       return result/k;
    }
}
