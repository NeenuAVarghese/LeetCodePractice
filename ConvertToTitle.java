public class ConvertToTitle {
    public String convertToTitle(int n) {
        
       StringBuilder sb = new StringBuilder();
        
        while(n > 0 ){
            int val = n%26;
            sb.insert(0, (char)(val+25));
            n=n/26;
        }
        
        return sb.toString();
        
    }
}