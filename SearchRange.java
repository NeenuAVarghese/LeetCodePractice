/*
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4]
*/

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        boolean gotIt = false;
        int start = -1;
        int end = -1;
        
        for(int i=0; i<nums.length; i++){
           
           if(!gotIt && nums[i] == target){
               start = i;
               end = i;
               gotIt = true;
           }

               if(gotIt && nums[i] == target){
                   end = i;
                   
           }
          
        }
        
        
        
        return new int[]{start, end};
    }
}