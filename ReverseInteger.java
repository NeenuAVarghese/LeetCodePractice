//Reverse digits of an integer.
public class ReverseInteger {
    public int reverse(int x) {
        long val = 0;
        while(x!=0){
            val = val * 10 + x%10;
            x = x/10;
            
            if(val > Integer.MAX_VALUE || val < Integer.MIN_VALUE)
                return 0;
        }
        return (int)val;
    }
}
