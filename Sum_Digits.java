package pgm2;
import java.util.*;
public class Sum_Digits
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int sum = 0;
		while(n!=0)
		{
			int rem=n%10;
			sum = sum+rem;
			n=n/10;
		}
		System.out.println("Sum of digits = "+sum);
	}
}
