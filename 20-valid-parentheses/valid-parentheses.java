import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if ((c == ')' && opening != '(') ||
                    (c == '}' && opening != '{') ||
                    (c == ']' && opening != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}