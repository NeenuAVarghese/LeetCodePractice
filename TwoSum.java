/*
*Given an array of integers, return indices of the two numbers such that they add up to a specific target.You *may assume that each input would have exactly one solution, and you may not use the same element twice.
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapInt = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(mapInt.containsKey(target - nums[i])){
                return new int[] {mapInt.get(target - nums[i]), i};
            }
            else{
                mapInt.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}