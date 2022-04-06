import java.util.*;
public class Program1 {

	  public static void insertionSort(int array[])
	  {  
		   int comp=0,shift=0;
	        int n = array.length;  
	        for (int j = 1; j < n; j++)
	        {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) )
	            {  
	            	comp++;
	            	shift++;
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	            shift++;
	        }     
	        for(int i:array){    
	            System.out.print(i+" ");
	        }
	        System.out.println("\nComparisons: "+comp);
	        System.out.println("Shifts: "+shift);
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
	        insertionSort(arr1);  
	           
	    }    
	}    

