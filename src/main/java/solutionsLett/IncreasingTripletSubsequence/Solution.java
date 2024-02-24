package solutionsLett.IncreasingTripletSubsequence;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min =Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++){
            if( i <= min){
                min = i;
            } else if( i <= secondMin){
                secondMin = i;
            } else{
                return true;
            }
        }
        return false;
    }
}
