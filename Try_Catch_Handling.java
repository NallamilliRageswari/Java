/*
 Exception handling is the process of responding to the occurrence, during computation, of exceptions � anomalous or exceptional conditions requiring special processing � often changing the normal flow of program execution. (Wikipedia)

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers x and y as input, you have to compute x/y. If x and y are not 32 bit signed 
integers or if y is zero, exception will occur and you have to report it. Read sample Input/Output to know what
 to report in case of exceptions.

Sample Input 0:

10
3
Sample Output 0:

3
Sample Input 1:

10
Hello
Sample Output 1:

java.util.InputMismatchException
Sample Input 2:

10
0
Sample Output 2:

java.lang.ArithmeticException: / by zero
Sample Input 3:

23.323
0
Sample Output 3:

java.util.InputMismatchException
 */
package Hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Try_Catch_Handling
{
		public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        try
	        {
	            int a=sc.nextInt();
	            int b=sc.nextInt();
	            System.out.println(a/b);
	        }
	        catch(InputMismatchException e)
	        {
	            System.out.println(e.getClass().getName());
	        }
	        catch(ArithmeticException e1)
	        {
	            System.out.println(e1.getClass().getName()+": / by zero");
	        }
	    }
}