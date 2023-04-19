import java.util.*;
public class palin_str
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string :");
		String str = scn.nextLine();
		int len = str.length();
		String temp,ans = "";
		temp = str;
		for(int i = len - 1; i >= 0; i--)
		{
			ans = ans + str.charAt(i);
		}
		System.out.println(ans);
		if(temp.equals(ans))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String in not palindrome");
		}
	}
}