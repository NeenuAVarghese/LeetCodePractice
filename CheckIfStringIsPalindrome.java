/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
*/

public class CheckIfStringIsPalindrome {
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty()){
            return true;
        }
        
        else{
            s = s.toLowerCase();
            s = s.replaceAll("[^a-z0-9]", "");
            char[] strArray = s.toCharArray();
            int j = s.length();
            for(int i=0;i <j/2;i++){
                if(strArray[i] != strArray[j - 1 - i]){
                    return false;
                }
            }
            return true;
        }
        
    }
}