/*Output pattern:
*****
*****
*****
*****
*****
*/
package Patterns;
import java.util.*;
public class Pattern1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Pattern contain "+n+" rows & "+n+" columns");
		for(int i =1; i<=n;i++) // rows
		{
			for(int j=1; j<=n;j++) // cols
			{
				System.out.print("*"); //*****
			}
			System.out.println();
		}
	} 
}
