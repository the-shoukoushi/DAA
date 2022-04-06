import java.util.*;
public class Program3 {

	
		public static int jumpSearch(int[] arr, int x)
		{
			int n = arr.length;

			
			int step = (int)Math.floor(Math.sqrt(n));

			
			int prev = 0;
			while (arr[Math.min(step, n)-1] < x)
			{
				prev = step;
				step += (int)Math.floor(Math.sqrt(n));
				if (prev >= n)
					return -1;
			}

			
			while (arr[prev] < x)
			{
				prev++;

				
				if (prev == Math.min(step, n))
					return -1;
			}

			
			if (arr[prev] == x)
				return prev;

			return -1;
		}

		
		public static void main(String [ ] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of element: ");
			int n=sc.nextInt();
			
			int arr[] = new int[n];
			System.out.println("Enter the elements: ");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the number to be searched: ");
			int x = sc.nextInt();

			
			int index = jumpSearch(arr, x);

			if(index!=-1)
			System.out.println("Present");
			else
				System.out.println("Not Present");
		}
	}


