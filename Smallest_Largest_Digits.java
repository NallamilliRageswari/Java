package pgm2;
import java.util.*;
public class Smallest_Largest_Digits
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt(); 
		int snum,lnum,rem;
		snum = lnum = num%10;  
		
		while(num>0) 
		{
		  	rem = num%10 ;   
		  	num = num/10 ;  
		  	if(rem > lnum)  
		  	{
		  		lnum = rem;
		  	}
		  	else if(rem <= snum) 
		  	{
		  		snum = rem;
		  	}
		}
		
		System.out.println("smallest digit = "+ snum);
		System.out.println("largest digit = "+ lnum);	
	} 
}
