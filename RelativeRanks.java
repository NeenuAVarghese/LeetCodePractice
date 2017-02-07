/*
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
*/
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        Arrays.sort(nums);
        String[] relativeRanks = new String[nums.length];
        for(int i = 0; i< nums.length; i++){
            if(i==0){
                relativeRanks[i] = "Gold Medal";
            }
            else if(i==1){
                relativeRanks[i] = "Silver Medal";
            }
            else if(i==2){
                relativeRanks[i] = "Bronze Medal";
            }
            else{
                relativeRanks[i] = i+1 + "";
            }
        }
        return relativeRanks;
    }
}