
/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints

16 24
Function Description

Complete the miniMaxSum function in the editor below.

miniMaxSum has the following parameter(s):

arr: an array of  integers
Print

Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Sum everything except , the sum is .
Hints: Beware of integer overflow! Use 64-bit Integer.*/
package maatramcoding;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Rash {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    	long totalSum = 0;
        long minElement = Long.MAX_VALUE;
        long maxElement = Long.MIN_VALUE;

        // Calculate the total sum and find the minimum and maximum elements
        for (int num : arr) {
            totalSum += num;
            minElement = Math.min(minElement, num);
            maxElement = Math.max(maxElement, num);
        }

        // Calculate the minimum and maximum sums
        long minSum = totalSum - maxElement;
        long maxSum = totalSum - minElement;

        // Print the results
        System.out.println(minSum + " " + maxSum);
      /*i found  List<Integer> ar = new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
        	int sum=0;
            for(int j=0;j<arr.size();j++)
            {
                
                if(i!=j)
                {
                  sum=sum+arr.get(j); 
                  
                 }
            }
            ar.add(sum);
        }
         
         int n = Collections.min(ar);
         int m = Collections.max(ar);
         System.out.print(n);
         System.out.print(" ");
         System.out.print(m);*/
    // Write your code here

    }

}

public class MINMAX {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Rash.miniMaxSum(arr);

        bufferedReader.close();
    }
}

