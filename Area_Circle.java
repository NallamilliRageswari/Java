//Area of Circle.
package Pack1;
import java.util.*;
public class Area_Circle {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter radius value :");
			float r = sc.nextFloat();
			float a = 3.14f * r*r;
			System.out.println("area of cicle = "+ a);
			System.out.printf("%1.2f",a);
		}
}
