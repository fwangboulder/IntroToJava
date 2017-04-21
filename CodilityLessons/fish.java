/**

N voracious fish are moving along a river. Calculate how many fish are alive.
 * Created by Fang on 4/20/17.
 */
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack<Integer> upStream = new Stack<Integer>();
        int downStreamCount=0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] == 1) {
                //upStream value
                upStream.push(A[i]);
            }
            else {
                downStreamCount++;
                while(upStream.size() > 0) {
                    int upStreamItem = upStream.pop();
                    if (A[i] < upStreamItem) {
                        upStream.push(upStreamItem);
                        downStreamCount--;
                        break;
                    }
                }
            }

        }
        return downStreamCount + upStream.size();
    }
}
