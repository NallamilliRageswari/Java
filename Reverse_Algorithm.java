/*
program for reversal algorithm of array rotation based on given p (position)?

Input: 1 2 3 4 5 6 7 8
Output: 3 4 5 6 7 8 1 2 

Algorithm:
---------------
p - 2, n- 8
arr[8] - 1 2 3 4 5 6 7 8 

A = [1,2]
B = [3,4,5,6,7,8]

Reverse A, we get ArB = [2,1,3,4,5,6,7,8]
Reverse B, we get ArBr = [2,1,8,7,6,5,4,3]
Reverse all, we get (ArBr)r = [3,4,5,6,7,8,1,2]
*/
package DS_Arrays;
import java.util.*;
public class Reverse_Algorithm
{
		static void shiftleft(int arr[], int p)
		{
			int n = 8;
			revarr(arr,0,p-1); 
			revarr(arr,p,n-1); 
			revarr(arr,0,n-1);	
		}
		
		static void revarr(int arr[] , int p, int n) // p = 2, n= 7 (2nd turn)
		{
			int temp;
			while(p<n) // 2< 7 -> t, 3 < 6 -> t, 4<5 -> t, 5<4 -> f
			{
				temp = arr[p];  // temp = 5
				arr[p] = arr[n]; // arr[5] = 5
				arr[n] = temp; // arr[4] = 6
				p = p+1; // p= 5
				n= n-1; // n = 4
			}
		}
		
		static void show(int arr[])
		{
			for(int i =0; i<8; i++)
				System.out.print(arr[i]+ " ");
		}
		
		public static void main(String[] args) {
		int arr[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 8 values: ");
		for(int i=0; i<8;i++)
		{
			 arr[i] = sc.nextInt(); 
		}
		
		int n = 8;
		int p = 2;
		
		shiftleft(arr,p); 
		
	    show(arr); 
		}
}
