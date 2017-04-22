/**
Created by Fang April 21, 2017
1. Nesting
Determine whether given string of parentheses is properly nested.

O(N)
**/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int leftSum = 0;
        if (S.length()==0) return 1;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')  leftSum++;
            else if (S.charAt(i) == ')' && leftSum > 0) leftSum--;
            else if (S.charAt(i) == ')' && leftSum == 0) return 0;
        }
        if (leftSum == 0) return 1;
        else return 0;
    }
}
