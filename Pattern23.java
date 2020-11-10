/*
Output Pattern:
				E D C B A 
				E D C B 
				E D C 
				E D 
				E 
*/
package Patterns1;
import java.util.*;
public class Pattern23
{
	public static void main(String[] args) {
		for(int i='A'; i <= 'E';i++) // 5 rows
		{
			for(int j= 'E'; j >= i; j--) // 5,4 cols
			{
				System.out.print((char)j+" "); 
			}
			System.out.println(); //nextline
		}
}
}
