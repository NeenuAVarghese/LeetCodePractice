/*Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
*/
public class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int cnt = 0;
        if(k < 0){
            return 0;
        }
        for(int i = 0; i < nums.length ; i ++){
            map.put(nums[i], i);
        }
        
        for(int i = 0 ; i < nums.length ; i ++){
            if(map.containsKey(k + nums[i]) && map.get(k + nums[i]) != i){
                cnt++;
                map.remove(k+nums[i]);
            }
        }
        
        return cnt;
    }
}
