/*
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string A , print Yes if it is a palindrome, print No otherwise.

Constraints

* A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes
 */


package Hackerrank;
import java.io.*;
import java.util.*;
public class String_Reverse
{
	
	public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        
	        int i=0,j=A.length()-1;
	        while(A.charAt(i) == A.charAt(j) && i++ < j-- );
	        System.out.println(i>j ? "Yes" : "No");
	    }
	}
