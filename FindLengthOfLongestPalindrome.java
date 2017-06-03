public class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length() == 0 || s == null){
            return 0;
        }
        
        HashSet<Character> hSet = new HashSet<Character>();
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            if(hSet.contains(s.charAt(i))){
                hSet.remove(s.charAt(i));
                count++;
            }
            else{
                hSet.add(s.charAt(i));
            }
        }
            
            if(!hSet.isEmpty()){
                return count * 2 + 1;
            }
            else{
                return count * 2;
            }
    }
}