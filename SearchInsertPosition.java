/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
*/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(; i< nums.length ; i++){
            if(nums[i] >= target){
                if(nums[i] == target){
                    return i;
                }
                else{
                    return i;
                }
            }
        }
        return i;
        
    }
}