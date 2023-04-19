import java.util.*;
public class maxminofarr
{
	public static void main(String args [])
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

	/*	int max = arr[0];
		for(int i = 1 ; i < size ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("maximum value of element in array is:" + max);
*/

		int min = arr[0];
		for(int i  = 1; i < size ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("minimum value of element in array is:" + min);
	}
}