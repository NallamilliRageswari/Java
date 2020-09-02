//Equilateral Triangle
package Formulas;
import java.util.*;
public class Equi_Triangle
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter side of a triangle:");
		float s = obj.nextFloat();		
		float a = (1.73f * s *s )/4;		
		System.out.println("Area of Equilateral Triangle = "+a);
	}
}
