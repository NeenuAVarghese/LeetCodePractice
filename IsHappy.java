/*
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

public class IsHappy {
    
    int evaluate(int n){
        int sum  = 0;
        while(n != 0 ){
               sum = sum + (int)Math.pow(n%10 , 2);
               n = n/10;
           }
           
           return sum;
    }
    
    public boolean isHappy(int n) {
        
        if(n < 0){
            return false;
        }
        else{
            int val1= n;
            int val2 = evaluate(n);
            while(val1 != val2){
                val1 = evaluate(val1);
                val2 = evaluate(evaluate(val2));
            }
            
            if(val1 == 1){
                return true;
            }
            else{
                return false;
            }
            
            
        }
    }
}