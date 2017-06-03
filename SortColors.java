/*
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
*/

public class SortColors {
    public void sortColors(int[] nums) {
        int maxLimit = nums.length - 1;
        int minLimit = 0;
        int temp;
        
        for(int i = 0; i< nums.length; i++){
            while(nums[i] == 2 && i < maxLimit){
                temp = nums[i];
                nums[i] = nums[maxLimit];
                nums[maxLimit] = temp;
                
                maxLimit --;
            }
            while(nums[i] == 0 && i > minLimit){
                temp = nums[i];
                nums[i] = nums[minLimit];
                nums[minLimit] = temp;
                
                minLimit++;
            }
        }
    }
}