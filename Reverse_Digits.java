package pgm2;
import java.util.*;
public class Reverse_Digits
{
	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter number");
	int n = obj.nextInt(); 
	int fdigit, ldigit, digits, rev_num;
	
	ldigit = n%10;  
	
	digits = (int)Math.log10(n) ; 
     
	fdigit = (int)(n/Math.pow(10,digits)); 	
	
	rev_num = ldigit;  
	rev_num = rev_num * (int)(Math.pow(10, digits)); 
	
	rev_num = rev_num + n %(int)(Math.pow(10,digits));
	
	rev_num = rev_num - ldigit; 
	
	rev_num = rev_num + fdigit; 
	
	System.out.println("Reverse digit number = "+  rev_num);
	
	}
}
