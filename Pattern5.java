/*ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/
package Patterns;
import java.util.*;
public class Pattern5
{
			public static void main(String[] args)
			{
			char i;char j;
			System.out.println("Alphabetical Pattern:");
			for( i ='A'; i<='E';i++) // rows
			{
				for( j='A'; j<='E';j++) // cols
				{
					System.out.print(j); 
				}
				System.out.println();
			}
			} 
}
