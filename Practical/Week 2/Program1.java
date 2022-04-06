import java.util.*;
public class Program2{

		
		static int count(int arr[], int x, int n)
		{
		int i;
		int j;
		i = first(arr, 0, n-1, x, n);
		if(i == -1)
			return i;
		
		j = last(arr, i, n-1, x, n);	
		return j-i+1;
		}
		
		static int first(int arr[], int low, int high, int x, int n)
		{
		if(high >= low)
		{
			
			int mid = (low + high)/2;
			if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
			return mid;
			else if(x > arr[mid])
			return first(arr, (mid + 1), high, x, n);
			else
			return first(arr, low, (mid -1), x, n);
		}
		return -1;
		}
		
		
		static int last(int arr[], int low, int high, int x, int n)
		{
		if(high >= low)
		{
			int mid = (low + high)/2;
			if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
			return mid;
			else if(x < arr[mid])
			return last(arr, low, (mid -1), x, n);
			else
			return last(arr, (mid + 1), high, x, n);	
		}
		return -1;
		}
		
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements: ");
			int n=sc.nextInt();
			int[]arr=new int[n];
			System.out.println("Enter the elements: ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the number to be searched: ");
			int x = sc.nextInt();
			int c = count(arr, x, n);
			System.out.println(x+" - "+c);
		}
	}

