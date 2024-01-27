/*Kristen loves playing with and comparing numbers. She thinks that if she takes two different positive numbers, the one whose digits sum to a larger number is better than the other. If the sum of digits is equal for both numbers, then she thinks the smaller number is better. For example, Kristen thinks that  is better than  and that  is better than .

Given an integer, , can you find the divisor of  that Kristin will consider to be the best?

Input Format

A single integer denoting .

Constraints

Output Format

Print an integer denoting the best divisor of .

Sample Input 0

12
Sample Output 0

6*/







package maatramcoding;
import java.util.Scanner;
import java.util.*;

public class Bestdvisor {

	public static void main(String[] args) {
		Scanner bufferedReader = new Scanner((System.in));

        int n = bufferedReader.nextInt();
        
        int[] arr = new int[n];
        int count = 0;

        // Find divisors of n and store them in arr
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[count] = i;
                count++;
            }
        }

        int a = 1;
        int maxDigitSum = 0;

        // Find the divisor whose digits sum to the largest number
        for (int i = 0; i < count; i++) {
            int cn = arr[i];
            int currentDigitSum = 0;

            while (cn != 0) {
                int b = cn % 10;
                currentDigitSum += b;
                cn = cn / 10;
            }

            if (currentDigitSum > maxDigitSum || (currentDigitSum == maxDigitSum && arr[i] < a)) {
                maxDigitSum = currentDigitSum;
                a = arr[i];
            }
        }

        System.out.println(a);

        


        bufferedReader.close();
    

		// TODO Auto-generated method stub

	}

}
