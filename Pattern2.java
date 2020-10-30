/*Output pattern
11111
22222
33333
44444
55555*/

package Patterns;
import java.util.*;
public class Pattern2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		for(int i =1; i<=n;i++) // rows
		{
			for(int j=1; j<=n;j++) // cols
			{
				System.out.print(i); 
			}
			System.out.println();
		}
	} 
}
