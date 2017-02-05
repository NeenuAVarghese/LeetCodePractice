/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.
*/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i+1 <nums.length; i++){
            if(nums[i] != val ){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }
}