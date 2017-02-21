/*
Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
*/

public class FrequencySort {
    public String frequencySort(String s) {
        
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max= 0;
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(charArray[i])){
                int val = map.get(charArray[i]) + 1;
                map.put(charArray[i], val);
                max = Math.max(max, val);
            }
            else{
                map.put(charArray[i], 1);
            }
        }
        
        List<Character>[] bucket = new List[s.length() + 1];
        
        for(char key : map.keySet()){
            int frequency = map.get(key);
            
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<Character>();
            }
            
            bucket[frequency].add(key);
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int pos = bucket.length -1; pos >= 0;pos-- ){
            if(bucket[pos] !=null){
                for(char val: bucket[pos]){
                    for(int i=0;i<map.get(val);i++){
                        sb.append(val);
                    }
                }
            }
        }
        
        return sb.toString();
        
    }
}