public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
      
        
        for(int j=0; j <magazine.length();j++){
            if(map.containsKey(magazine.charAt(j)))
            {
                int val1 = map.get(magazine.charAt(j)) + 1;
                map.put(magazine.charAt(j), val1);
                
               
            }
            else{
                map.put(magazine.charAt(j), 1);
            }
        }
        
          for(int i =0; i < ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i))){
                int val = map.get(ransomNote.charAt(i)) - 1;
                map.put(ransomNote.charAt(i), val);
                 if(val < 0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
         return true;  
        }
    }