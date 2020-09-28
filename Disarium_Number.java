package pgm3;
import java.util.*;
public class Disarium_Number
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n=sc.nextInt();
	int num=n;
	int len=count(n);
	int sum=0;
	while(n>0)
	{
		int rem=n%10;
		sum=sum+(int)Math.pow(rem,len);
		n=n/10;
		len--;
	}
	if(sum==num)
		System.out.println(num+" is disarium number");
	else
		System.out.println(num+" is not  disarium number");
	}
	static int count(int n1)
	{
		int length=0;
		while(n1!=0)
		{
			length=length+1;
			n1=n1/10;
		}
		return length;
	}
}
