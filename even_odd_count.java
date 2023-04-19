import java.util.*;
public class even_odd_count
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int oddc = 0,evenc = 0;
		while(num > 0)
		{
			int rem = num % 10;
			num = num / 10;
			if(rem % 2 == 0)
			{
			evenc++;
			}
			else
			{
			oddc++;
			}
		}
	System.out.println("no. of even digit in num :"+ evenc);
	System.out.println("no. of odd digit in num :"+ oddc);
	} 

}