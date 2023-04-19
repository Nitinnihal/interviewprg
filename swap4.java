import java.util.*;
public class swap4
{
	public static void main(String args[])
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("value of n is :");
	int n = scn.nextInt();
	System.out.println("value of m is :");
	int m = scn.nextInt();
	m = n + m - (n = m);

	System.out.println(" n\t" + n);
	System.out.println(" m\t" + m);
	}
}