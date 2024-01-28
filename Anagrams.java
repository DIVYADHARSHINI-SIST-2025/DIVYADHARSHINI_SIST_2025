package maatramcoding;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Results {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
       int strlen = s.length();
        if (strlen == 0 || strlen % 2 != 0) {
            return -1;
        }

        int toChange = 0;
        int subLen = strlen / 2;
        String lhs = s.substring(0, subLen);
        char[] rhs = s.substring(subLen).toCharArray();

        for (char c : lhs.toCharArray()) {
            int index = indexOf(rhs, c);
            if (index == -1) {
                toChange++;
            } else {
                rhs[index] = '\0'; // Mark the character as used
            }
        }

        return toChange;
    }

    private static int indexOf(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    // Write your code here

    }

}

public class Anagrams {

	public static void main(String[] args) {
		 Scanner bufferedReader = new Scanner(System.in);

		 int q = bufferedReader.nextInt();
		 bufferedReader.nextLine();
	        for (int qItr = 0; qItr < q; qItr++) {
	            String s = bufferedReader.nextLine();

	            int result = Results.anagram(s);

	            System.out.println(result);
	        }

	        bufferedReader.close();
        
    }
}

	
		// TODO Auto-generated method stub

	