/*
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    List<Integer> list = new ArrayList<Integer>();
    List<Integer>[] bucket = new List[nums.length + 1];
    
    for(Integer num: nums){
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    
    for(Integer n : map.keySet()){
        int frequency = map.get(n);
        if(bucket[frequency] == null){
            bucket[frequency] = new ArrayList<Integer>();
        }
        bucket[frequency].add(n);
    }
    
    for(int pos = bucket.length -1; pos >= 0 && list.size()<k; pos--){
        if(bucket[pos] != null){
            list.addAll(bucket[pos]);
        }
    }
    
    return list;
    }
}