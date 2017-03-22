/*
You have an array a composed of exactly n elements.
 Given a number x, determine whether or not a contains three elements for which the sum is exactly x.
*/

public class TripletSum{

    boolean tripletSum(int x, int[] a) {

    Arrays.sort(a);
    for(int i=0; i< a.length-2;i++){
        
        int l = i+1;
        int r = a.length - 1;
            
            while(l < r){
                if(a[i] + a[l] + a[r] == x){
                    return true;
                }
                else{
                    if(a[i] + a[l] + a[r] < x){
                        l++;
                    }
                    else{
                        if(a[i] + a[l] + a[r] > x){
                            r--;
                        }
                    }
                        
                }
            }
    }
    
    return false;
}
}

