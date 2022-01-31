package searching;
import java.util.Scanner;

public class BitonicPoint {
	public static int findMax(int[]arr,int low,int high)
	{
		if(low==high)
		{
			return arr[low];
		}
		if(high==low+1)
		{
			if(arr[low]>arr[high])
			{
				return arr[low];
			}
			else
			{
				return arr[high];
			}
		}
		int mid=(low+high)/2;
		if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
		{
			return arr[mid];
		}
		else if(arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1])
		{
			return findMax(arr,mid+1,high);
		}
		else {
			return findMax(arr,low,mid-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element in an array: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int low=0;
		int high=n-1;
		int max=findMax(arr,low,high);
		System.out.println("The max in array is "+max);
		sc.close();

	}

}
