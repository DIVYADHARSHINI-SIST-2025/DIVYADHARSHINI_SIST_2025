/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?   */
package maatramcoding;
import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
    for(int i=0;i<nums.length;i++)
    {
          for(int j=i+1;j<nums.length;j++)
          {
              int add=nums[i]+nums[j];
              if(add==target)
              {
                  a[0]=i;
                  a[1]=j;
                  return a;
              }
          }
    }
   
        return new int[0]; 
    }
}

public class two_sum_with_target {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Solution solution = new Solution();
        int[] results = solution.twoSum(a, t);

        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
		// TODO Auto-generated method stub

	}

}
