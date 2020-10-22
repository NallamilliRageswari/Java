package pgm5;
import java.util.*;
public class Number_Series
{
	    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt(); 
		int i = 1;
		while(n != 0) 
		{
			if(i<n) 
			{
				System.out.print(i+" "); 
				i++;  
			}
			else
				System.out.print(n--   +" "); 
		}

		}
}
