import java.util.*;
public class duplicateeleminarr
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		System.out.println("enter elements of array:");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = scn.nextInt();
		}


		boolean flag = false;
		for(int i = 0 ; i < size ; i++)
		{
			for(int j = i + 1; j < size ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("found duplicate element of array:" + arr[i]);
					flag = true;
				}
			}
		}
		
		if(flag == false)
		{
			System.out.println("duplicate element not found");
		}
	}
}