import java.util.*;
public class count_word_str
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("write a string below :");
		String str = scn.nextLine();
		int len = str.length();
		char res;
		int count = 0;
		for(int i = len - 1; i >= 0; i--)
		{
			res = str.charAt(i);
			count++;
			if(res == ' ')
			{
				count--;
			}
		}
		System.out.println("number of char in gien string is :" + count);
	}
}