import java.util.*;
public class Program3 {

	 public void heapSort(int arr[])
	    {
	        int temp;
	 
	        for (int i = arr.length / 2 - 1; i >= 0; i--)               
	        {
	            heapify(arr, arr.length, i);
	        }
	 
	        for (int i = arr.length - 1; i > 0; i--)                            
	        {
	            temp = arr[0];                                                  
	            arr[0] = arr[i];
	            arr[i] = temp;
	            heapify(arr, i, 0);                                
	        }
	    }
	 
	    void heapify(int arr[], int n, int i)
	    {
	        int MAX = i;
	        int left = 2 * i + 1; 
	        int right = 2 * i + 2; 
	        int temp;

	        if (left < n && arr[left] > arr[MAX])            
	        {
	            MAX = left;
	        }
	 
	        if (right < n && arr[right] > arr[MAX])           
	        {
	            MAX = right;
	        }
	 
	        if (MAX != i) 
	        {                                               
	            temp = arr[i];
	            arr[i] = arr[MAX];
	            arr[MAX] = temp;
	            heapify(arr, n, MAX);
	        }
	    }
	 
	   void check(int arr[])
	   {
		   int flag=0;
	   
		   for(int i = 0; i < arr.length; i++) 
		   {  
	            for(int j = i + 1; j < arr.length; j++) 
	            {  
	                if(arr[i] == arr[j]) 
	                {
	                	flag=1;
	                }
	            }
	            
	       }
		   if(flag==0)
		   {
			   System.out.println("NO");
		   }
		   else
		   {
			   System.out.println("YES");
		   }
	    }
	 
	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of elements: ");
	    	int n=sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter the elements: ");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        Program3 ob = new Program3();
	        ob.heapSort(arr);
	        ob.check(arr);
	    }
	}

