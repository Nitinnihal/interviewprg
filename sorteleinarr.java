import java.util.*;
public class sorteleinarr
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = scn.nextInt();

		int arr[] = new int[size];
		System.out.println("enter elements in array");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = scn.nextInt();
		}

		System.out.println("array before sorting:" + Arrays.toString(arr));

		for(int i = 0 ; i < size -1 ; i++)
		{
			for(int j = 0 ; j < size - 1 ; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
			}
		}
		System.out.println("array after sorting:" + Arrays.toString(arr));
	}
}