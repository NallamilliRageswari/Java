package pgm4;
import java.util.*;
public class Armstrong_Number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); 
		int c=0,temp = n; 	
		int d = 0;
		// count no of digits
		while(n>0)
		{
			int rem= n%10;
			d++; 
			n= n/10; 
		}
		n=temp; 
		while(n>0)
		{
			int rem = n%10; 
			c = c+ (int)Math.pow(rem,d); 
			n=n/10; 
		}
		if(temp == c) 
		System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		}
}
