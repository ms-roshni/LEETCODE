class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for(String c : tokens){
            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                s.push(Integer.parseInt(c));
            }else{
                int op2 = s.pop();
                int op1 = s.pop();
                int res=0;
                if(c.equals("+")){
                    res = op1+op2;
                }else if(c.equals("-")){
                    res = op1-op2;
                }else if(c.equals("*")){
                    res = op1*op2;
                }else if(c.equals("/")){
                    res = op1/op2;
                }
                s.push(res);
            }
        }
        return s.pop();
    }
}