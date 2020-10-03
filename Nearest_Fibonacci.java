package pgm3;
import java.util.*;
public class Nearest_Fibonacci
{
	boolean isFibo(int n)  
	 {
		 int a=0, b = 1, c=0;
		 while(c<n)
		 {
			 c = a+b; 
			 a=b;  
			 b=c;	 
		 }
		 if (c==n) 
			 return true;
		 else 
			 return false;
	 }
		int beforeFib(int n)  
		{
			int c = 0;
			while(true)
			{
				if(isFibo(n))
					return c;  
					else
					{
						n= n-1; 
						c++;  
					}	
				}
			}
		int afterFib(int n) 
		{
			int c=0;
			while(true)
			{
				if(isFibo(n))  
					return c; 
				else
				{
					n = n+1; 
					c++;  
				}
			}
		}
		
		void nearestFibs()
		{
			Scanner obj = new Scanner(System.in);
			System.out.println("enter number:");
			int n = obj.nextInt(); 
			int m1 = beforeFib(n); 
			int m2 = afterFib(n); 
		
		if(m1>m2)
		{
			System.out.println("Nearest Fibonacci Number : ");
			System.out.println(n+m2);	
		}
		else if(m2>m1)  
		{
		  	System.out.println("Nearest Fibonacci Number : ");
		  	System.out.println(n-m1); 
		}
		else if ( (n-m1)==(n+m2) ) 
			System.out.println(n+ " is a Fibonacci Number");
		else if (m1 == m2)
		{
			System.out.println("Nearest Fibonacci Numbers are: ");
			System.out.println((n-m1)+" "+(n+m2));  
		}
	  }
		
	public static void main(String[] args) 
	{
		Nearest_Fibonacci obj = new Nearest_Fibonacci();
		obj.nearestFibs();
	}
}
