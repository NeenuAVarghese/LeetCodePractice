/*
*Split the Roman Numeral string into Roman Symbols (character).
*Convert each symbol of Roman Numerals into the value it represents.
*Take symbol one by one from starting from index 0:
*   If current value of symbol is greater than or equal to the value of next symbol, 
    then add this value to the running total.
*   else subtract this value by adding the value of next symbol to the running total.
*/

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] romans = s.toCharArray();
        int intVal=0, val=0;
        Map<Character,Integer> romanToNum = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length() ; i++){
            switch(romans[i]){
                case 'I':
                            val = 1;
                            break;
                case 'V':
                            val = 5;
                            break;
                case 'X':
                            val = 10;
                            break;
                case 'L':
                            val = 50;
                            break;
                case 'C':
                            val = 100;
                            break;
                case 'D':
                            val = 500;
                            break;
                case 'M':
                            val = 1000;
                            break;
            }
            romanToNum.put(romans[i], val);
        }
        int s1=0,s2=0;
        for(int i = 0; i < s.length(); i++){
            s1 = romanToNum.get(romans[i]);
            
            if(i+1 < s.length()){
                 s2 = romanToNum.get(romans[i+1]);
                 
                 if( s1 >= s2){
                    intVal = intVal + s1;
                }
                else{
                    intVal = intVal + s2 - s1;
                    i++;
                }
            }
            else{
                intVal = intVal + s1;
                i++;
            }
            
            System.out.println(intVal);
        }
        
        return intVal;
    }
}