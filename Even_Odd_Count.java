package Basic_pgms;
import java.util.*;
public class Even_Odd_Count 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter size :");
	  int s = sc.nextInt();  
	  int[] nums = new int[s];
	  int even=0, odd=0;
	  System.out.println("enter " + s + " values:");
	  for(int i=0; i<s ; i++)
	  {
		  nums[i] = sc.nextInt(); 
	  }
	  
	  for(int i = 0; i<s; i++)
	  {
		  if(nums[i]%2==0)
			  even++; 
		  else
			  odd++;  
	  }
	  System.out.println("even number count = "+even );
	  System.out.println("odd number count = "+odd );
}
}
