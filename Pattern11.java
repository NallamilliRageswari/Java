/*
Output pattern:
				1
				12
				123
				1234
				12345
 */
package Patterns;
import java.util.*;
public class Pattern11
{
	public static void main(String[] args) {
		for(int i =1; i<=5;i++) //5 rows
		{
			for(int j=1; j<=i;j++) // cols
			{
				System.out.print(j); 
			}
			System.out.println();
		}
	}
}
