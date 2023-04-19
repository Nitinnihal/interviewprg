import java.util.*;
public class sod_num
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter an integer number :");
		int n = scn.nextInt();
		int ans = 0;

		while(n > 0)
		{
			int rem = n % 10;
			n = n / 10;
			ans = ans + rem;
		}
		System.out.println("sum of digits of given number is :" + ans);
	}
}