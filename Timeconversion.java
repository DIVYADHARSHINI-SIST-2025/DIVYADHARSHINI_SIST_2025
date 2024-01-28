/*Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45*/
package maatramcoding;
import java.util.*;
  class Resultse {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
         String first_two_digit=s.substring(0,2);
        if(s.contains("PM"))
        {
            if(first_two_digit.equals("12"))
            {
                return s.substring(0,8);
            }
            else 
            {
                int originalIntValue = Integer.parseInt(first_two_digit);
                int d=originalIntValue+12;
                
                return d+s.substring(2,8);
            }
        }
        else
        {
                if(first_two_digit.equals("12"))
                 {
                   
                  return "00"+s.substring(2,8);
                 }
                else
                 {
                  return s.substring(0,8);
                 }
        }
    // Write your code here

    }

}


public class Timeconversion {

	public static void main(String[] args) {
		
		       Scanner bufferedReader = new  Scanner(System.in);
		      

		        String s = bufferedReader.nextLine();

		        String result = Resultse.timeConversion(s);

		        System.out.println(result);
		        

		        bufferedReader.close();
		       
		// TODO Auto-generated method stub

	}

}
