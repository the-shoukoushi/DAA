import java.util.*;
public class Program3 {

	public static void main(String[]args)
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
		System.out.println("Enter the difference: ");
		int d=sc.nextInt();
		int flag=0;
		for (int i = 0; i < (arr.length- 1); i++)
		  {
	          for (int j = (i + 1); j < arr.length; j++)
	          {
	        	  
	              if ((int)Math.abs(arr[i] - arr[j]) == d)
	              {
	                 flag++;
	              }
	          
	        }
		  }
		if(flag==0)
		{
			System.out.println("No pair found");
		}
		else
		{
			System.out.println(flag);
		}
	 }
}
