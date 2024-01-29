/*You will be given a list of integers, , and a single integer . You must create an array of length  from elements of  such that its unfairness is minimized. Call that array . Unfairness of an array is calculated as

Where:
- max denotes the largest integer in 
- min denotes the smallest integer in 

Example



Pick any two elements, say .

Testing for all pairs, the solution  provides the minimum unfairness.

Note: Integers in  may not be unique.

Function Description

Complete the maxMin function in the editor below.
maxMin has the following parameter(s):

int k: the number of elements to select
int arr[n]:: an array of integers
Returns

int: the minimum possible unfairness
Input Format

The first line contains an integer , the number of elements in array .
The second line contains an integer .
Each of the next  lines contains an integer  where .

Constraints




Sample Input 0

7
3
10
100
300
200
1000
20
30
Sample Output 0

20
Explanation 0

Here ; selecting the  integers , unfairness equals

max(10,20,30) - min(10,20,30) = 30 - 10 = 20*/
package maatramcoding;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Resu {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */
	
    public static int maxMin(int k, List<Integer> arr) {
        Collections.sort(arr);

        int minUnfairness = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.size() - k; i++) {
            int currentUnfairness = arr.get(i + k - 1) - arr.get(i);
            minUnfairness = Math.min(minUnfairness, currentUnfairness);
        }

        return minUnfairness;
    // Write your code here

    }

}

public class Min_max {

	public static void main(String[] args) {
		Scanner bufferedReader = new Scanner(System.in);
       

        int n =bufferedReader.nextInt();
        int k =bufferedReader.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = bufferedReader.nextInt();
            arr.add(arrItem);
        }

        int result = Resu.maxMin(k, arr);

       System.out.println(result);
        
        bufferedReader.close();
        
		// TODO Auto-generated method stub

	}

}
