/*Cities on a map are connected by a number of roads. The number of roads between each city is in an array and city  is the starting location. The number of roads from city  to city  is the first value in the array, from city  to city  is the second, and so on.

How many paths are there from city  to the last city in the list, modulo ?

Example


There are  roads to city ,  roads to city  and  roads to city . The total number of roads is .

Note
Pass all the towns Ti for i=1 to n-1 in numerical order to reach Tn.

Function Description

Complete the connectingTowns function in the editor below.

connectingTowns has the following parameters:

int n: the number of towns
int routes[n-1]: the number of routes between towns
Returns

int: the total number of routes, modulo 1234567.
Input Format
The first line contains an integer T, T test-cases follow.

Each test-case has 2 lines.
The first line contains an integer N (the number of towns).
The second line contains N - 1 space separated integers where the ith integer denotes the number of routes, Ni, from the town Ti to Ti+1

Constraints
1 <= T<=1000
2< N <=100
1 <= routes[i] <=1000

Sample Input

2
3
1 3
4
2 2 2
Sample Output

3
8*/
package maatramcoding;
import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class Result {

    /*
     * Complete the 'connectingTowns' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY routes
     */

    public static int connectingTowns(int n, List<Integer> routes) {
        int total=1;
        for(int i=0;i<n-1;i++)
        {
            total=(total*routes.get(i))%1234567;
        }
        return total;
       
    // Write your code here

    }

}

public class Connectingtowns {

	public static void main(String[] args) {
		Scanner bufferedReader = new Scanner(System.in);
		

        int t = Integer.parseInt(bufferedReader.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.nextLine().trim());

            String[] routesTemp = bufferedReader.nextLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> routes = new ArrayList<>();

            for (int i = 0; i < n - 1; i++) {
                int routesItem = Integer.parseInt(routesTemp[i]);
                routes.add(routesItem);
            }

            int result = Result.connectingTowns(n, routes);

            System.out.println(result);
            System.out.println();
        }

        bufferedReader.close();
        
		// TODO Auto-generated method stub

	}

}
