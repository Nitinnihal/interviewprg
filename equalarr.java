import java.util.*;
public class equalarr
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		boolean status = true;
		
		System.out.println("enter the size of 1st array:");
		int s1 = scn.nextInt();
		int arr1[] = new int[s1];
		System.out.println("enter elements in the array:");
		for(int i = 0 ; i < s1 ; i++)
		{
			arr1[i] = scn.nextInt();
		}
		
		System.out.println("enter the size of 2nd array:");
		int s2 = scn.nextInt();
		int arr2[] = new int[s2];
		System.out.println("enter elements in the array:");
		for(int i = 0;  i < s2 ; i++)
		{
			arr2[2] = scn.nextInt();
		}


		if(s1 == s2)
		{
			for(int i = 0;  i < s1 ; i++)
			{
				if(arr1[i] != arr2[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
			if(status == true)
			{
				System.out.println("arrays are equal");
			}
			else
			{
				System.out.println("arrays are not equal");
			}
	}
}