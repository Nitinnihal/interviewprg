import java.util.*;
public class sumofelemofarr
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		
		System.out.println("enter elements in the array:");
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = scn.nextInt();
			sum = sum + arr[i];
		}
	System.out.println("the elements of array are:" + Arrays.toString(arr));
	System.out.println("sum of elements is:" + sum);
	}
} 