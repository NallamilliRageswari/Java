/*
Output patterns:
				1
				22
				333
				4444
				55555
 */
package Patterns;
import java.util.*;
public class Pattern12
{
	public static void main(String[] args) {
		for(int i =1; i<=5;i++) //5 rows
		{
			for(int j=1; j<=i;j++) // cols
			{
				System.out.print(i); 
			}
			System.out.println();
		}
	} 
}
