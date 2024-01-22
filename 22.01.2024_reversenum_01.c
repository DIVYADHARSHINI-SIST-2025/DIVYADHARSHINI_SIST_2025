/*Given a number N reverse the number and print it.

Example 1: Input: N = 123 Output: 321 Explanation: The reverse of 123 is 321

Example 2: Input: N = 234 Output: 432 Explanation: The reverse of 234 is 432

Input Format

123

Constraints

N <= 1000

Output Format

321

Sample Input 0

123
Sample Output 0

321*/





#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n,rev;
    scanf("%d",&n);
    while(n!=0)
    {
        rev=n%10;
        n=n/10;
        printf("%d",rev);
    }

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}