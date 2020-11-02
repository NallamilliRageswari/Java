/*
Pattern output:
54321
54321
54321
54321
54321
 */
package Patterns;
import java.util.*;
public class Pattern7
{
	public static void main(String[] args) {
		for(int i=5; i>=1;i--) // 5 rows
		{
			for(int j=5; j>=1;j--) // 5 cols
			{
				System.out.print(j); // 54321
			}
			System.out.println();
		}
	}
}
