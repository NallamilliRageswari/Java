/*
Output Pattern:
				A B C D E 
				A B C D 
				A B C 
				A B 
				A 
*/
package Patterns1;
import java.util.*;
public class Pattern19
{
	public static void main(String[] args) {
		for(int i='E'; i>='A';i--) // 5 rows
		{
			for(int j= 'A';j<=i; j++) // 5,4 cols
			{
				System.out.print((char)j+" "); // A A A A A 
			}
			System.out.println();
		}
	}
}
