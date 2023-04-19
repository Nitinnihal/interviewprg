import java.util.*;
public class swap3
{
	public static void main(String args[])
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("value of n is :");
	int n = scn.nextInt();
	System.out.println("value of m is :");
	int m = scn.nextInt();
	n = n^m;
	m = n^m;
	n = n^m;

	System.out.println(" n\t" + n);
	System.out.println(" m\t" + m);
	}
}