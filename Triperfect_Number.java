package pgm4;
import java.util.*;
public class Triperfect_Number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter Number :");
		int n = sc.nextInt();  
		
		int sum = 1+n; 
		
		int i = 2;
		//finding all divisors
		while( i*i <= n) 
		{
			if(n%i == 0 )
			{
				if(n/i==i) 
					sum = sum +i;  
				else
					sum = sum + i + n/i;
			}
		i = i+1; 		
		} 
			
	if(sum == 3*n)
	System.out.println(n + " is Triperfect Number");
	else
		System.out.println(n+" is Not Triperfect Number");
		}
}
