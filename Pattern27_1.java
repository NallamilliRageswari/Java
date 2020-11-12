/*
Output Pattern:
				A
   			   BB
  			  CCC
 			 DDDD
		    EEEEE
 */
package Patterns1;
import java.util.*;
public class Pattern27_1
{
	public static void main(String[] args) {
		int n =5;
		
		for(int i=1; i<=5; i++) // 5 rows
		{
			for(int j=n-1; j>=i; j--) // 4 spaces
				System.out.print(" ");
			
			for(int k= 1; k<=i; k++) // repeats
				System.out.print((char)(i+64)); // A
			
			System.out.println();
		}
	}
}
