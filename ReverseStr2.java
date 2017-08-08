/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
*/

public class ReverseStr2 {
    
    public String reverseStr(String s, int k) {
        
        if(s.length()+1 < k){
            return s;
        }
        
        for(int i=0; i <= s.length()-k; i+=2*k){
            s = reverse(s, i, i+k-1);
            System.out.println(i);
        }
        
        return s;
        
    }
    
    public String reverse(String s, int start, int end){
        char[] str = s.toCharArray();
        int j = end;
        for(int i=start; i<= (start+end)/2; i++){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            j--;
        }
        
        return new String(str);
    }
}