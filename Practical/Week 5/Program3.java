import java.util.*;
public class Program3 {

	
	public void Intersection(int[]arr1, int m, int[]arr2, int n)
    {
		int i = 0, j = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	    while (i < m && j < n) 
	       {
	          if (arr1[i] < arr2[j])
	              i++;
	          else if (arr2[j] < arr1[i])
                  j++;
	          else
	           {
	                System.out.print(arr2[j++] + " ");
	                i++;
	            }
	        }
	    }
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the size of 1st array: ");
		int m=sc.nextInt();
		int[]A=new int[m];
		System.out.println("Enter the elements: ");
		for(int i=0;i<m;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Enter the the size of 2nd array: ");
		int n=sc.nextInt();
		int[]B=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
		B[i]=sc.nextInt();
		}
		Program3 ob=new Program3();
		ob.Intersection(A, m, B, n);
	}
}
