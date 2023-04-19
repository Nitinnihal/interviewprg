import java.util.*;
public class gcdlcm
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two numbers:");

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n11 = n1, n22 = n2;

		while(n1 % n2 != 0)
		{
			int r = n1 % n2 ; 
			n1 = n2;
			n2 = r;
		}
		int gcd = n2;
		System.out.println("the gcd of given numbers is:" + gcd);
		int lcm = (n1 * n2)/gcd;
		System.out.println("the lcm of given numbers is:" + lcm);
	}
}