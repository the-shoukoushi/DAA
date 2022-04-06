import java.util.*;
public class Program2 {

	 public static void selectionSort(int[] arr){  
		 int swap=0,comp=0;
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            
	            for (int j = i + 1; j < arr.length; j++)
	            {  
	            	comp++;
	                if (arr[j] < arr[index])
	                {  
	                    index = j;
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	            swap++;
	        }  
	        for(int i:arr){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println("\nComparisons: "+comp);
	        System.out.println(("Swaps: "+swap));
	    }  
	       
	    public static void main(String a[]){  
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number of elements: ");
	    	int n=sc.nextInt();
	        int[] arr1 = new int[n];  
	        System.out.println("Enter the elements: ");  
	        for(int i=0;i<n;i++)
	        {
	        	arr1[i]=sc.nextInt();
	        }
	        selectionSort(arr1);    
	    }  
	}  


