package pgm3;
import java.util.*;
public class Automorphic_Number
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();
		int x = 0;
		
		int sq = n*n; 
		
		while(n>0)  
		{
			if(n%10 != sq%10)
			{
				x = 1;
				break;
			}
			n= n/10; 
			sq = sq/10;
		}
		if(x==0) 
			System.out.println("Automorphic Number");
		else
			System.out.println("Not Automorphic Number");
	}
}
