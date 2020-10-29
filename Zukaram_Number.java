package pgm5;
import java.util.*;
public class Zukaram_Number
{
	// function return product of digits of a given number
		static int display(int n) 
		{
			int p = 1;
			while( n != 0)
			{
				int rem = n%10; 
				p = p* rem; 
				n = n/10; 
			} 
			return p; 
		}
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); 
		
		if(n % display(n) == 0) 
			System.out.println("Zukarman Number");
		else
			System.out.println("Not Zukarman Number");
		}
}
