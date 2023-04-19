import java.util.*;
public class factorial
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = scn.nextInt();
		int factorial = 1;

		for(int i = 1 ; i <= num ; i++)
		{
			factorial = factorial * i;
		}
	System.out.println(factorial);
	}
}