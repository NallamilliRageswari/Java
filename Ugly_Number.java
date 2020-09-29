package pgm2;
import java.util.*;
public class Ugly_Number
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number :");
	int n = sc.nextInt(); 
	int x=0; // ugly number
	 
	while(n != 1) 
	{
		if(n%5==0)  
         		n = n/5;			
		else if(n%3==0)
		n=n/3 ; 
		else if(n%2==0)
		n = n/2;
		else
		{ 
		x= 1;
		break;
		}
	}
	 if(x==0)
		 System.out.println("Ugly Number");
	 else
		 System.out.println("Not Ugly Number");
	} 	
}
