package searching;
import java.util.Scanner;

public class EvenATEvenPlaceOddAtOddPlace {
	public static void evenOdd(int[]arr,int n)
	{
		int evenIndex=0;
		int oddIndex=1;
		while(true)
		{
			while(evenIndex<n&&arr[evenIndex]%2==0)
			{
				evenIndex+=2;
			}
			while(oddIndex<n&&arr[oddIndex]%2==1)
			{
				oddIndex+=2;
			}
			if(evenIndex<n&&oddIndex<n)
			{
				int temp=arr[evenIndex];
				arr[evenIndex]=arr[oddIndex];
				arr[oddIndex]=temp;
			}
			else
			{
				break;
			}
			
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
		evenOdd(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
