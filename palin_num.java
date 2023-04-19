import java.util.*;
public class palin_num
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number :");
		int num = scn.nextInt();
		int temp, rem, ans = 0;
		temp = num;
		while(num > 0)
		{
			 rem = num % 10;
			 num  = num / 10;
			 ans = (ans * 10) + rem;
		}
		if(temp==ans)
		{
		System.out.println("palindrome");
		}
		else
		{
		System.out.println("not palindrome");
		}
		
	}
}