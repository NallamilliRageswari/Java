package pgm2;
import java.util.*;
public class Strong_Number
{
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter number :");
		int n = obj.nextInt(); // 145
		int fact, rem, sum = 0, temp;
		temp = n;  
		// this loop is to identify each digit
		while(n != 0)  
		{
			fact = 1;
			int i = 1;
			rem = n%10;  
		   // below loop is for each digit factorial	
			while(i <= rem)  
			{
				fact = fact * i;
				i++;
			}
			sum = sum + fact ; 
			n = n/10;  
		}
         if ( sum == temp) 
        	 System.out.println(temp + " is a Strong Number" );
         else
        	System.out.println(temp + " is not a Strong Number"); 
}
}
