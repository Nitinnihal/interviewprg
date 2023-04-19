import java.util.*;
public class linearScearchofarr
{
	public static void main(String args [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = scn.nextInt();
		int arr[] = new int[size];
		for(int i = 0 ; i < size ; i++)
		{
			arr[i] = scn.nextInt();
		}

		System.out.println("enter the value that is to be searched:");
		int sele = scn.nextInt();

		boolean flag = false;
		for(int i = 0 ; i < size ; i++)
		{
			if(sele == arr[i])
			{
				System.out.println("element found at index:" + i);
				flag = true;
				break;
			}
		}
		
		if(flag == false)
		{
			System.out.println("element not found");
		}
	}
}