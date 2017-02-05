public class ValidParenthesis {
    public boolean isValid(String s) {
        char[] arrayParenthesis = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i<s.length() ; i++){
            if(arrayParenthesis[i] == '('){
                st.push(')');
            }
            else if(arrayParenthesis[i] == '['){
                st.push(']');
            }
            else if(arrayParenthesis[i] == '{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop() != arrayParenthesis[i]){
                return false;
            }
        }
        return st.isEmpty();
    }
}