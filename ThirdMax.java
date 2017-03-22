/*
Given a non-empty array of integers, return the third maximum number in this array. 
If it does not exist, return the maximum number. The time complexity must be in O(n).
*/
public class ThirdMax {
    
    public int thirdMax(int[] nums) {
        
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        
        
        for(Integer num : nums ){
            if((num== max1) || (num== max1) || (num== max1)){
                continue;
            }
            else{
                if(max1 == null || num > max1 ){
                max3 = max2;
                max2 = max1;
                max1 = num;
                }
                else{
                    if(max2 == null || num > max2){
                        max3 = max2;
                        max2 = num;
                    }
                    else{
                        if(max3 == null || num > max3){
                            max3 = num;
                        }
                    }
                }
            }
        }
        
        if(max3 == max2 || max3 == null){
            return max1;
        }
        else{
            return max3;
        }
        
        
        
        
        
    }
}