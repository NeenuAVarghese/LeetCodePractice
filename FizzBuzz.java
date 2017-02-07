/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
*/
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        
        List arrayString = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if(i%5==0 && i%3==0){
                arrayString.add("FizzBuzz");
            }
            else if(i%5==0){
                arrayString.add("Buzz");
            }
            else if(i%3==0){
                arrayString.add("Fizz");
            }
            else{
                arrayString.add(Integer.toString(i));
            }
        }
        return arrayString;
    }
}