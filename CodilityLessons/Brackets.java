/**
Lesson 5
Brackets: Determine whether a given string of parentheses is properly nested.
**/

/**
 * Created by Fang on 4/20/17.
 */
// you can also use imports, for example
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' || S.charAt(i) == '[' || S.charAt(i) == '{') {
                stack.push(S.charAt(i));
            }
            else if (S.charAt(i) == ')' && !stack.empty() && stack.peek() == '(') stack.pop();
            else if (S.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') stack.pop();
            else if (S.charAt(i) == ']' && !stack.empty() && stack.peek() == '[') stack.pop();
            else return 0;
        }


        if (stack.empty()) return 1;
        else return 0;
    }
}
