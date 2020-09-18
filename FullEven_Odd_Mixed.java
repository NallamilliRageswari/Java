package pgm2;
import java.util.*;
public class FullEven_Odd_Mixed
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter number :");
	int num = sc.nextInt(); 
     print(num);
	}  

   static void print(int num)
   {
	int f = 1;
	int n,d;
	n = num;  
	
	while(num!=0) 
	{ 
	  d = num%10;  
	  num = num/10;  
	  
	  if(n%2 == 0 &&  d%2 == 1) 
	  {
		  f=2;
		  break;
	  }
	  else if(n%2 == 1 && d%2 == 0) 
	  {
		  f=2; 
		  break; // exits loop
	  }
	}//end of loop
	
	if(f ==1 && n%2 ==0)
		System.out.println("Full Even Number ");
	else if (f==1 && n%2==1)
		System.out.println("Full Odd Number ");
	else
		System.out.println("Mixed Number ");
  } 
} // end of class