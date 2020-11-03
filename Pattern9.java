package Patterns;
import java.util.*;
public class Pattern9
{
	public static void main(String[] args) {
		char i;
		char j;
		for( i ='E'; i>='A';i--) // rows
		{
			for( j='E'; j>='A';j--) // cols
			{
				System.out.print(j); //EDCBA
			}
			System.out.println();
		}
	}
}
