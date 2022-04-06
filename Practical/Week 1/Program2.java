import java.util.*;
public class Program2 {

	
	public static void binarySearch(int arr[], int first, int last, int key){  
		int c=0;  
		int mid = (first + (last-first))/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;  
	              c++;
		      }else if ( arr[mid] == key ){ 
		    	  c++;
		        System.out.println("Present " + c);  
		        break;  
		      }else{  
		    	  c++;
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Not Present "+c);  
		   }  
		 }  
		 public static void main(String args[]){ 
			 Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the number of elements: ");
		        int n=sc.nextInt();
		        int[]arr=new int[n];
		        System.out.println("Enter the elements in the array: ");
		        for(int i=0;i<n;i++)
		        {
		        	arr[i]=sc.nextInt();
		        }
		        int key;
		        System.out.println("Enter the element to be searched: ");
		        key=sc.nextInt();
		        int last=arr.length-1;  
		        binarySearch(arr,0,last,key);     
		 }  
} 
