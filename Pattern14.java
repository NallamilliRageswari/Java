/*
Output Pattern:
				A
				AB
				ABC
				ABCD	
				ABCDE
 */
package Patterns;
import java.util.*;
public class Pattern14
{
	public static void main(String[] args) {
		char i;
		char j;
		for( i ='A'; i<='E';i++) //5 rows
		{
			for( j='A'; j<=i;j++) // cols
			{
				System.out.print(j); //A
			}
			System.out.println();
		}
	} 
}
