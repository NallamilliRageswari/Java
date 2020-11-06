/*
Output Pattern:
				1 1 1 1 1 
				2 2 2 2 
				3 3 3 
				4 4 
				5 	
*/
package Patterns1;
import java.util.*;
public class Pattern16
{
	public static void main(String[] args) {
		for(int i =1; i<=5;i++) // 5 rows, 1
		{
			for(int j=5; j>=i;j--) // 5 cols
			{
				System.out.print(i+" "); //1 1 1 1 1
			}
			System.out.println();
		}
	}
}
