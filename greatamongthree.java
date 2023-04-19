import java.util.*;
public class greatamongthree
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a = scn.nextInt();
		System.out.println("enter the value of b:");
		int b = scn.nextInt();
		System.out.println("enter the value of c:");
		int c = scn.nextInt();
		
		if(a > b && a > c)
		{
			System.out.println(a + "a is greatest");
		}
		else if(b > c)
		{
			System.out.println(b + "b is greatest");
		}
		else
		{
			System.out.println(c + "c is greatest");
		}
	}
} 