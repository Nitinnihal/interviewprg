import java.util.*;
public class count_word_str
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("write a string below :");
		String str = scn.nextLine();
		int count = 1;
		for(int i = 0; i <= str.length() - 1; i++)
		{
			if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
			{
				count++;
			}	
		}
		System.out.println("number of word in given string is :" + count);
	}
}