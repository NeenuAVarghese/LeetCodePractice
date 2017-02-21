/*
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
*/
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
       
       for(int i = 0; i<nums.length; i++){
           map.put(nums[i], i);
       }
       Arrays.sort(nums);
       int j = 0 ;
        String[] relativeRanks = new String[nums.length];
        for(int i = nums.length - 1; i>= 0; i--){
            int val = map.get(nums[i]);
            if(i==nums.length - 1){
                relativeRanks[val] = "Gold Medal";
            }
            else if(i==nums.length - 2){
                relativeRanks[val] = "Silver Medal";
            }
            else if(i ==nums.length - 3){
                relativeRanks[val] = "Bronze Medal";
            }
            else{
                relativeRanks[val] =j+1 +  "";
            }
            j++;
        }
        return relativeRanks;
    }
}