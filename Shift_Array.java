/*
  program to shift an Array by p elements ?
		Input arr[] = [1,2,3,4,5,6,7,8]
		p = 2, n = 8
		Output: [3,4,5,6,7,8,1,2]
 */
package DS_Arrays;
import java.util.*;
public class Shift_Array
{
			void shiftLeft(int arr[], int p, int n)
			     {
			    	 for(int i=0; i<p;i++)  // i < 2  -> i = 0, 1 -> true
			    		 shiftByOne(arr,n);
			     }
			     
			     void shiftByOne(int arr[], int n)
			     {
			    	 int i, temp;
			    	 temp = arr[0];  // temp = 2
			    	 for(i=0; i<n-1 ;i++)
			    	 {
			    		 arr[i] = arr[i+1]; // arr[0] = 3
			    	 }
			    	 arr[i] = temp; // arr =  3 4 5 6 7 8 1 2    	 
			     }
			     
			     void show(int arr[],int n)
			     {
			    	 for(int i=0; i <n ; i++)
			    		 System.out.print(arr[i]+" ");
			     }	
				
				public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int arr[] = new int[8];
				System.out.println("enter 8 values:");
				for(int i = 0; i<8; i++)
				{
			     	arr[i] = sc.nextInt();
				}  // arr = 1 2 3 4 5 6 7 8
				
				DS_Array1 shift = new DS_Array1();
				shift.shiftLeft(arr,2,8);
				shift.show(arr, 8);
				}
	}