Determine whether an integer is a palindrome. Do this without extra space.
public class IfNumIsPalindrome {
    public boolean isPalindrome(int x) {
        int num = 0;
        if((x < 0) || ((x>0) && (x%10 == 0))){return false;}
        while(x > num){
          num = x%10 + 10*num;
          x = x/10;
        }
        if(x == num || x == num/10){
            return true;
        }
        else{
            return false;
        }
    }
}