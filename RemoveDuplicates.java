/*
*Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

*Do not allocate extra space for another array, you must do this in place with constant memory.
*/
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i=1; i<nums.length; i++){
            
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}