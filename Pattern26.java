/*
 Output Pattern:
 				 1
   				12
  			   123
 			  1234
			 12345
 */
package Patterns1;
import java.util.*;
public class Pattern26
{
	public static void main(String[] args) {
		int n = 5; // 5 rows
		
		for(int i=1; i <= n ; i++)// 5 rows
		{
			for(int j= n-1; j >= i ; j--)// j=4 	>= 2 	
				System.out.print(" "); // 4,3,2,1,0 - > spaces
			
			for(int k=1; k <= i; k++) // repeating
				System.out.print(k); // 1,2,3,4,5 -> *
			
			System.out.println();			
		}
	}
}
