package DS_Arrays;
import java.util.*;
public class Cyclically_Rotate
{
		static void shift(int arr[])
		{
			int n = arr[arr.length - 1]; 
			for(int i = arr.length-1; i > 0 ; i--)
			{
				arr[i] = arr[i-1];
			}
			arr[0] = n; 	
		}
		
		public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter 5 values : ");
		for(int i = 0; i<5; i++)
			arr[i] = sc.nextInt(); 
		
		shift(arr); 
		System.out.println(Arrays.toString(arr));

		}

}