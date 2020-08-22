//Program for Simple_Interest.
package Pack1;
import java.util.*;
public class Simple_Interest {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter principle");		
			double p = sc.nextDouble();
			System.out.println("enter rate");		
			double r = sc.nextDouble();
			System.out.println("enter time");		
			double n = sc.nextDouble();
			double si = (p*n*r)/100;
			System.out.println("simple interest = "+si);
		}
}
