/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?      */
package maatramcoding;
import java.util.Scanner;
class Soluti {
    public boolean isPalindrome(int x) {
        int y=x;
        int rev=0;
        if(x<0)
        {
            return false;
        }
        while(y!=0)
        {
            int b=y%10;
            rev=rev*10+b;
            y=y/10;
        }
        if(x==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Soluti sol=new Soluti();
		boolean results=sol.isPalindrome(n);
		System.out.println(results);
		
		// TODO Auto-generated method stub

	}

}
