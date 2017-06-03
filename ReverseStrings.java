/*Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
*/
public class ReverseStrings {
    public String reverseWords(String s) {
        String words[] = s.split("\\s+");
        int j = words.length - 1;
        
       
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length ;i > 0 ; i--){
            sb.append(words[i-1] + " ");
        }
         return sb.toString().trim();
    }
   
}