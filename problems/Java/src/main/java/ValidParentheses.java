import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author niranjanjoglekar on 02/06/22
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 */
public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("(){}"));
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println(validParentheses.isValid("(]"));
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);

            //If opening bracket, then push into queue
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }

            // Now if closing bracket; then stack can't be empty
            if(stack.isEmpty()){
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '[' || check == '('){
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '('){
                        return false;
                    }
                    break;
                default:
            }
        }
        // Check Empty Stack
        return (stack.isEmpty());
    }
}