class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for(String c : tokens){
            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                s.push(Integer.parseInt(c));
            } else {
                int op2 = s.pop();
                int op1 = s.pop();
                
                if(c.equals("+")){
                    s.push(op1 + op2);
                } else if(c.equals("-")){
                    s.push(op1 - op2);
                } else if(c.equals("*")){
                    s.push(op1 * op2);
                } else {
                    s.push(op1 / op2);
                }
            }
        }
        return s.pop();
    }
}