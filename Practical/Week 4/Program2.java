import java.util.*;
public class Program2 {

	int comp=0;
	int swap=0;
	int partition (int a[], int start, int end)  
	{  
	    int pivot = a[end];   
	    int i = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	         comp++;
	        if (a[j] < pivot)  
	        {  
	            i++; 
	            swap++;
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    swap++;
	    int t = a[i+1];  
	    a[i+1] = a[end];  
	    a[end] = t;  
	    return (i + 1);  
	}  
	  
	void quick(int a[], int start, int end)  
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end);    
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  
	   
	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");
	    System.out.println("\nComparisons: "+comp);
	    System.out.println("Swaps: "+swap);
	}  
	    public static void main(String[] args)
	    {  
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of elements: ");
	    	int n=sc.nextInt();
	        int a[] =new int[n];
	        System.out.println("Enter the elements: ");
	        for(int i=0;i<n;i++)
	        {
	        	a[i]=sc.nextInt();
	        }
	        Program2 q1 = new Program2();   
	        q1.quick(a, 0, n - 1); 
	        q1.printArr(a, n);  
	        System.out.println();  
	    }  
	 
}
