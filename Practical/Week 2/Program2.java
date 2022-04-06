import java.util.*;
public class Program2 {

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
		int flag=0;
		for (int i = 0; i < (arr.length- 1); i++)
		  {
	          for (int j = (i + 1); j < arr.length; j++)
	          {
	        	  for(int k=j+1;k<arr.length;k++)
	        	  { 
	              if (arr[i] + arr[j] == arr[k])
	              {
	                  flag=1;
	                  System.out.println((i+1)+", "+(j+1)+", "+(k+1));
	              }
	          }
	        }
		  }
		if(flag==0)
		{
			System.out.println("No sequence found");
		}
	 }
}

