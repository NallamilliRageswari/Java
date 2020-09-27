package pgm3;
import java.util.*;
public class Fibo_Series
{
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number :");
	int n = obj.nextInt(); 
	int t1 = 0 , t2 = 1;
	System.out.println("Fibonacci numbers upto given number:"+n);
	System.out.print(t1);  
	int sum=0;
	for(int i = 2; sum<n; i++) 
	{	
		sum = t1 + t2; 
		t1 = t2;  
		t2 = sum;  
		System.out.print(" "+t1);  
	}
    } 
}