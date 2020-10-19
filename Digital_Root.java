package pgm5;
import java.util.*;
public class Digital_Root
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		int root=0,d;
		while(num>0 || root > 9)
		{
			if(num==0)
			{
				num=root;
				root=0;
			}
			int rem=num%10;
			root=root+rem;
			num=num/10;
		}
		System.out.println(root);
	}
}
