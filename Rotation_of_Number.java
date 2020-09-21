package pgm2;
import java.util.*;
public class Rotation_of_Number
{
	static int no_of_digits(int n)  
	{
		int c=0;
		while(n>0) 
		{
			c++; 
			n=n/10; 
		}
		return c; 
	}
	
	static void print(int num)  
	{
		int digits = no_of_digits(num); 
		int n = (int)Math.pow(10,digits - 1); 
		
		for(int i = 0 ; i < digits -1 ; i++)
		{
			int firstDigit = num/n ; 
			int lastpos = ( (num*10) + firstDigit) - (firstDigit*n *10);
					System.out.println(lastpos+ " ");
					num = lastpos;  
		}
	}
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int num = obj.nextInt();
		print(num);

	}
}
