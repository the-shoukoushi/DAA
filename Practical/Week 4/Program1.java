import java.util.*;
public class Program1 {

	int inver=0;
	int comp=0;
	 void merge(int arr[], int left, int middle, int right)
	    {
	        int low = middle - left + 1;                    
	        int high = right - middle;                      
	 
	        int L[] = new int[low];                             
	        int R[] = new int[high];

	        int i = 0, j = 0;
	 
	        for (i = 0; i < low; i++)                               
	        {
	        	
	            L[i] = arr[left + i];
	        }
	        for (j = 0; j < high; j++)                              
	        {
	        
	            R[j] = arr[middle + 1 + j];
	        }
	        
	 
	        int k = left;                                           
	        i = 0;                                             
	        j = 0;

	        while (i < low && j < high)                     
	        {
	        	comp++;
	            if (L[i] <= R[j]) 
	            {
	                arr[k] = L[i];
	                i++;
	            }
	            else 
	            {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        while (i < low)                            
	        {
	        	inver++;
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        while (j < high)                           
	        {
	        	inver++;
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 

	    void mergeSort(int arr[], int left, int right)      
	    {
	        int middle;
	        if (left < right) {                             
	            middle = (left + right) / 2;
	 
	            mergeSort(arr, left, middle);                    
	            mergeSort(arr, middle + 1, right);               
	 
	            merge(arr, left, middle, right);                
	        }
	    }
	 
	    void display(int arr[])                 
	    {  
	        for (int i=0; i<arr.length; ++i) 
	        {
	            System.out.print(arr[i]+" ");
	        } 
	        System.out.println("\nComparisons: "+comp);
	        System.out.println("Inversions: "+inver);
	    } 

	    public static void main(String args[])
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of elements: ");
	    	int n=sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter teh elements: ");
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=sc.nextInt();
	        }
	        Program1 ob = new Program1();
	        ob.mergeSort(arr, 0, arr.length - 1);
	        ob.display(arr);
	    }
}
