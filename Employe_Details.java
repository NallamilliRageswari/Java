//Employee Details.
package Pack1;
import java.util.Scanner;
public class Employe_Details {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter sno");
			int sno = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter age");
			byte age= sc.nextByte();
			System.out.println("enter fee");
			float fee= sc.nextFloat();
		System.out.println(" Sno = "+sno+"\n Name = "+name+"\n Age = "+age+"\n Fee = "+fee);
		}
}
