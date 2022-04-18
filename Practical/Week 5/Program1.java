import java.util.*;
public class Program1 {

	void sort(char arr[])
    {
        int n = arr.length;     
        char output[] = new char[n];
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
        int[]p=new int[n];
        for(int j=0;j<n;j++)
        {
        	 int c=0;
        	 char t=arr[j];
             for(int i=0;i<n;i++)
             {
        	    if(t==arr[i])
        	      {
        		       c++;
        	      }	   
              }
             p[j]=c;
        }
        int f=p[0];
        int max=0;
        for(int i=1;i<n;i++)
        {
        	if(f<p[i])
        	{
        		f=p[i];
        		max=i;
        	}
        }
        if(p[max]!=p[max+1])
        {
        	System.out.println("No duplicates Present");
        }
        else
        {
        	System.out.println(arr[max]+" - "+f);
        }
        
        
    }
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		char[]ch=new char[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
	    Program1 ob=new Program1();
	    ob.sort(ch);
	}
}
