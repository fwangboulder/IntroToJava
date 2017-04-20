/**
Lesson 4
Find the earliest time when a frog can jump to the other side of a river.
**/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
/**
 * Created by Fang on 4/20/17.
 */
class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        boolean[] arr= new boolean[X];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && arr[A[i]-1] == false) {
                arr[A[i]-1] = true;
                sum += 1;
            }
            if (sum == X) return i;

        }
        return -1;
    }
}
