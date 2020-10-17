package pgm5;
import java.util.*;
public class Abundant_Number
{
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter a number: ");
	    	int n = sc.nextInt(); 
	    	if(display(n) > n) 
	    		System.out.println("Abundant Number");
	    	else
	    		System.out.println("Not Abundant Number");
		}
		static int display(int n) 
		{
			int sum =0;
			for(int i=1; i<= (Math.sqrt(n));i++)
			{
				if(n%i==0)
				{
					sum = sum + i + (n/i); 
				}
			}
			sum = sum-12; 
			return sum;
		} 
}
