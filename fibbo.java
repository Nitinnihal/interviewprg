import java.util.*;
public class fibbo
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scn.nextInt();
		int a = 0 , b = 1 , sum = 0;
		
		for(int i = 0 ; i < n ; i ++)
		{
			System.out.println(a);
			sum = a + b;
			a = b; 
			b = sum;
		} 
	}
}