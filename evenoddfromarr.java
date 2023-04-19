import java.util.*;
public class evenoddfromarr
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter the elements of array:");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = scn.nextInt();
		}
			System.out.println("even numbers of array are:");
			for(int i = 0 ;  i < arr.length ; i++)
			{
				if(arr[i] % 2 == 0)
				{
					System.out.println(arr[i]);
				}
			}
			System.out.println("odd numbers of array are:");
			for(int i = 0 ; i < arr.length ; i++)
			{
				if(arr[i] % 2 != 0)
				{
					System.out.println(arr[i]);
				}
			}
		
	}
}