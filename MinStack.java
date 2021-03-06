/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
*/


public class MinStack {
    
Stack<Integer> stack = new Stack<Integer>();
int min = Integer.MAX_VALUE;
 
    
    public void push(int x) {
        
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
        
    }
    
    public void pop() {
        int top = stack.pop();
        
        if(top == min){
            min = stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */