/*
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
*/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,val=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 1){
                val++;
            }
            else{
                if(max < val){
                    max = val;
                }
                val = 0;
            }
        }
        if(max < val){
            max = val;
        }
        return max;
    }
}