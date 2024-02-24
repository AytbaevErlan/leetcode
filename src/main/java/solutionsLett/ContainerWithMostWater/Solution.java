package solutionsLett.ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int maxWaterUnits = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right ){
            int h = Math.min(height[left], height[right]);
            int w = right - left;

            maxWaterUnits = Math.max(maxWaterUnits, h * w);

            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxWaterUnits;
    }
}
