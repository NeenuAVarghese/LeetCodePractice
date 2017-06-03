/*Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].*/

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = null;
        
        for(int i = 0 ;i < rowIndex+1; i++){
            A = new ArrayList<Integer>();
            for(int j = 0; j <= i ;j++){
             
                
                if(j == 0 || j==i){
                    A.add(1);
                }
                else{
                     System.out.println(B.get(j-1) +" , " + B.get(j));
                     A.add(B.get(j-1) + B.get(j));
                }
            }
            B = A;
            
        }
        
        return A;
    }
}