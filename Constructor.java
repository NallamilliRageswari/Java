//Using Constructor
package Pack1;
class Student
{
		String name;
		int roll_no;
		Student(String name, int roll_no)
		{
			this.name = name;
			this.roll_no = roll_no;
		}
		public void printStudent()
		{
			System.out.println("Name"+" = "+ name);
			System.out.println("Roll.no"+" = "+ roll_no);
		}	
}
public class Constructor
{
		public static void main(String[] args) 
		{
	      Student sc = new Student("Ragini",29);
	      sc.printStudent();
		}
}
