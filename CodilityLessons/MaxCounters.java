/**
Lesson 4
 MaxCounters
Calculate the values of counters after applying all alternating operations:
increase counter by 1; set value of all counters to current maximum.**/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
/**
 * Created by Fang on 4/20/17.
 */
 // O(N*M) time complexity;
 class Solution {
     public int[] solution(int N, int[] A) {
         // write your code in Java SE 8
         int [] counter = new int[N];
         int maxC = 0;
         for (int i = 0; i < A.length; i++) {
             if (A[i] <= N) {
                 counter[A[i]-1] +=1;
                 maxC = Math.max(maxC, counter[A[i]-1]);
             }
             else if (A[i] == N+1) {
                 for (int j =0; j < N; j++) counter[j] = maxC;

             }
         }
         return counter;
     }
 }

//Method 2
 class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        int min = Integer.MIN_VALUE;
        int tmin = 0;

        int length = A.length;

        for(int i = 0; i < length; ++i) {
            int index = A[i] - 1;
            if(index == N) {
                min = tmin;
            } else {
                if(counters[index] < min) {
                    counters[index] = min;
                }

                ++counters[index];

                if(tmin < counters[index]) {
                    tmin = counters[index];
                }
            }
        }

        for(int i = 0; i < counters.length; ++i) {
            if(counters[i] < min) {
                counters[i] = min;
            }
        }

        return counters;
    }
}
