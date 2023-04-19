import java.util.*;
public class count_num
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter an integer value : ");
		int n = scn.nextInt();
		int count = 0;
		while(n > 0)
		{
			n = n / 10;
			count++;
		}
		System.out.println("number of digits in n :" + count);
	}
}