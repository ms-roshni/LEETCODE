import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);

            // handle closing brackets
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;

            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;

            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }

        // valid only if no unmatched opening brackets left
        return stack.isEmpty();
    }
}