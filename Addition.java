//Addition of two numbers.
package Pack1;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int a=sc.nextInt();
		System.out.println("Enter second value");
		int b =sc.nextInt();
		int c = a+b;
		System.out.println("sum of two numbers is " + c);
	}
}
