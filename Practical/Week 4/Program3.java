import java.util.*;
public class Program3 {

	 public void findK(int[] arr, int k)
	    {
	        int max = Arrays.stream(arr).max().getAsInt();
	        int min = Arrays.stream(arr).min().getAsInt();
	        int range = max - min + 1;
	        int count[] = new int[range];
	        int output[] = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            count[arr[i] - min]++;
	        }
	  
	        for (int i = 1; i < count.length; i++) {
	            count[i] += count[i - 1];
	        }
	  
	        for (int i = arr.length - 1; i >= 0; i--) {
	            output[count[arr[i] - min] - 1] = arr[i];
	            count[arr[i] - min]--;
	        }
	  
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = output[i];
	        }
	        if(k<=arr.length)
	        {
	        	System.out.println(arr[k-1]);
	        }
	        else
	        {
	        	System.out.println("Not Present");
	        }
	    }
	  
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Program3 ob=new Program3();
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index to be searched: ");
		int k=sc.nextInt();
		ob.findK(arr,k);
		
	}
}
