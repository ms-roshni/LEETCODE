class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        
        stack.push(val); // push all into stack
        if(minStack.isEmpty() || val<=minStack.peek()){ //oly push if new val<minstack's top
            minStack.push(val);
        }
    }
    
    public void pop() {
        int removed = stack.pop();
        if(removed == minStack.peek()){
            minStack.pop();
        }
        
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */