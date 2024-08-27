import java.util.Stack;

public class ValidParenthesis20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    if (c == ')' || c == '}' || c == ']') {
                        return false;
                    }
                }
                char x = stack.peek();
                if ((x == '(' && c == ')') || (x == '{' && c == '}') || (x == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return true;

    }

}