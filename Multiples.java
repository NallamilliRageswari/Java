package pgm2;
import java.util.*;
public class Multiples
{
	public static void main(String args[])
	{
		  Scanner s = new Scanner(System.in);
		  System.out.println("enter 2 numbers:");
		  int x = s.nextInt();  
		  int n = s.nextInt();
		  System.out.println("Multiples of 3 and 5 are:");
		  for(int i = x; i<= n ; i++)
		  {
			  if(i%3==0 && i%5 == 0)
				  System.out.print(i +" ");
		  }
	}
}
