/*55555
44444
33333
22222
11111
*/
package Patterns;
import java.util.*;
public class Pattern6
{
	public static void main(String[] args) {
		for(int i=5; i>=1;i--) // 5 rows
		{
			for(int j=1; j<=5;j++) // 5 cols
			{
				System.out.print(i); 
			}
			System.out.println();
		}
	}
}
