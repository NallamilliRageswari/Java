//Using static Method
package Pack1;
class Stat
	{
		static int x =10;
		static void show()
		{
			System.out.println(" static value = "+ x);
		}
	}
	public class Static_Method 
	{
		public static void main(String[] args) 
		{
		  Stat.show();
		}
}
