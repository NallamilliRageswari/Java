/*
 Output pattern:
   A
  CBA
EDCBA
GFEDCBA
IHGFEDCBA
 */
package Patterns2;
public class Pattern41
{
	public static void main(String[] args){
			int n=4;
			int stars = n*2-1; //  stars = 7
			int space= n-1; // space = 3
			
			for(int i = n; i >= 1; i--)  // i=4,3,2,1 rows
			{
				for(int j = space; j >= i; j--)// 3 >= 3
				System.out.print(" ");
				
				for(int k= 1; k<= stars; k++) // k = 7,5,3,1,
					System.out.print(i); // 7,5,3,1
				
				System.out.println();
				stars = stars-2; // 7-2 = 5,3,1 		
			}
		} 
}