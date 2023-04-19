import java.util.*;
public class revstr
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string :");
		String str = scn.nextLine();
		String rev = "";
		int len = str.length();
		for(int i = len - 1; i >=0; i --)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse of String is : " + rev);
	}
}