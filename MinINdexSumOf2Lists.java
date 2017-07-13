/*
Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
*/

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        
        Map<String, Integer> map = new HashMap<String,Integer>();
        
        int i=0;
        for(String element : list1){
            map.put(element, i);
            i++;
        }
        
        i=0;
        int min = Integer.MAX_VALUE;
        List<String> lt = new ArrayList<String>();
        
        for(String element : list2)
        {
            if(map.containsKey(element)){
                if(map.get(element) + i < min){
                    min = i+map.get(element);
                    lt.clear();
                   
                }
                if(map.get(element) + i == min){
                     lt.add(element);
                }
                 
            }
            i++;
        }    
        
        
        return lt.toArray(new String[lt.size()]);
       
    }
        
}