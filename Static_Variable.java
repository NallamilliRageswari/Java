//Using Static Variable
package Pack1;
public class Static_Variable 
{
		static int x =10;
		public static void main(String[] args) 
		{
				Static_Variable t1 = new Static_Variable();
				t1.x=50;
				System.out.println(t1.x);  
		   
				Static_Variable t2 = new Static_Variable();
				System.out.println(t2.x);   
		}
}
