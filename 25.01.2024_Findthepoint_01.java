/*Consider two points,  and . We consider the inversion or point reflection, , of point  across point  to be a  rotation of point  around .

Given  sets of points  and , find  for each pair of points and print two space-separated integers denoting the respective values of  and  on a new line.

Function Description

Complete the findPoint function in the editor below.

findPoint has the following parameters:

int px, py, qx, qy: x and y coordinates for points  and 
Returns

int[2]: x and y coordinates of the reflected point 
Input Format

The first line contains an integer, , denoting the number of sets of points.
Each of the  subsequent lines contains four space-separated integers that describe the respective values of , , , and  defining points  and .

Constraints

Sample Input

2
0 0 1 1
1 1 2 2
Sample Output

2 2
3 3
*/
package maatramcoding;
import java.util.Scanner;
import java.util.*;
class Tivya {

    /*
     * Complete the 'findPoint' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER px
     *  2. INTEGER py
     *  3. INTEGER qx
     *  4. INTEGER qy
     */

    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
         List<Integer> reflectedPoint = new ArrayList<>();
        // Calculate the coordinates of the reflected point
        reflectedPoint.add(2 * qx - px);
        reflectedPoint.add(2 * qy - py);
        return reflectedPoint;
    // Write your code here

    }

}
public class Findthepoint {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after reading n

        StringBuilder inputBuilder = new StringBuilder();

        for (int nItr = 0; nItr < n; nItr++) {
            String[] firstMultipleInput = scanner.nextLine().replaceAll("\\s+$", "").split(" ");

            int px = Integer.parseInt(firstMultipleInput[0]);
            int py = Integer.parseInt(firstMultipleInput[1]);
            int qx = Integer.parseInt(firstMultipleInput[2]);
            int qy = Integer.parseInt(firstMultipleInput[3]);

            List<Integer> result = Tivya.findPoint(px, py, qx, qy);

            for (int i = 0; i < result.size(); i++) {
                inputBuilder.append(result.get(i));

                if (i==0) {
                	inputBuilder.append(" ");
                }
            }

            inputBuilder.append("\n");
        }

        // Process all inputs at once
        System.out.print(inputBuilder.toString());

        scanner.close();
	}

}
