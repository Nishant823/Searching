package searching;
import java.util.*;

public class LeadersInArray {
	public static ArrayList<Integer> LeaderInArray(int []arr,int n)
	{
		ArrayList<Integer> brr=new ArrayList<Integer>();
		int max=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--)
		{
			if(i==n-1||arr[i]>max)
			{
				brr.add(arr[i]);
				max=Math.max(max, arr[i]);
			}
			else if(arr[i]==max)
			{
				brr.add(arr[i]);
			}
		}
		Collections.reverse(brr);
		return brr;
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
		ArrayList<Integer> brr=LeaderInArray(arr,n);
		System.out.println(brr);
		sc.close();

	}

}
