/*Output pattern:
 				 ABCDEFG
 				  ABCDE
  			       ABC
   					A
 */
package Patterns2;
public class Pattern42
{
	public static void main(String[] args) {
		
		int n=4;
		int chars = n*2-1; //  chars = 7
		int space= n-1; // space = 3
				
		for(int i = n; i >= 1; i--)  // i=4,3,2,1 rows
		{
			for(int j = space; j >= i; j--)// 3 >= 4
				System.out.print(" ");  //0,1,2,3 space
					
			for(int k= 1; k<= chars; k++) // k = 7,5,3,1,
				System.out.print((char)(k+64)); // ABCDEFG
						
			System.out.println();
		chars = chars-2; // 7-2 = 5,3,1 		
		}
	}
}