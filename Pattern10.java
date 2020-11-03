/*
Output Pattern:
 				*
 				**
 				***
 				****
 				*****
*/

package Patterns;
import java.util.*;
public class Pattern10
{
	public static void main(String[] args) {
		for(int i =1; i<=5;i++) // 5 rows
		{
			for(int j=1; j<=i;j++) // cols
			{
				System.out.print("*"); //*
			}
			System.out.println();
		}
	}
}
