/*
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

*/
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] numsClone = nums.clone();
        Arrays.sort(numsClone);
        
        int start = nums.length , end = 0;
        for(int i=0; i<nums.length;i++){
            
            if(nums[i] != numsClone[i]){
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
            
           
        }
         return end - start >=0 ? end-start+1 : 0;
    }
}