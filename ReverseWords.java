/*

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.

*/

public class ReverseWords {
    
    public String convert(String a){
        
    
        char[] arr = a.toCharArray();
        int j, i;
        for(i=0,j=arr.length-1; i < j; i++,j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        return new String(arr);
        
        
        
    }
    
    public String reverseWords(String s) {
        
        
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++ ){
            
            arr[i] = convert(arr[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< arr.length; i++){
            sb.append(arr[i]);
            if(i != arr.length - 1){
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}