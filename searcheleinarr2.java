//		BINARY SEARCH


import java.util.*;
public class searcheleinarr2
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = scn.nextInt();
		int arr[] = new int[size];

		System.out.println("enter elements in arrays:");
		for(int i = 0 ; i < size ; i++)
		{
			 arr[i] = scn.nextInt();
		}
			System.out.println("enter element to be searched:");
			int s_ele = scn.nextInt();

		int lowidx = 0;
		int highidx = size-1;

		while(lowidx <= highidx)
		{
			int mid = (lowidx + highidx)/2;
			
			if( s_ele > arr[mid])
			{
				lowidx = mid + 1;
			}
			else if(s_ele < arr[mid])
			{
				highidx = mid - 1;
			}
			else
			{
				System.out.println("element found at index:" + mid);
				return;
			}
		}
		System.out.println(-1);
	}
}