package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author niranjanjoglekar on 04/07/22 Given a string s containing just the characters '(', ')',
 *     '{', '}', '[' and ']', determine if the input string is valid.
 *     <p>An input string is valid if: 1. Open brackets must be closed by the same type of brackets.
 *     2. Open brackets must be closed in the correct order.
 *     <p>Input: s = "()[]{}" Output: true
 *     <p>Input: s = "(]" Output: false
 */
public class ValidParentheses {

  public static void main(String[] args) {
    System.out.println(isValid("()[]{[{()}]}"));
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack();
    Map<Character, Character> map = new HashMap();
    map.put(']', '[');
    map.put('}', '{');
    map.put(')', '(');

    for (char c : s.toCharArray()) {

      if (map.containsKey(c)) {
        if (!stack.empty() && stack.peek() == map.get(c)) {
          stack.pop();
        } else {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }
}
