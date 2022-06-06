package daa;
import java.util.*;
public class Program2 {
	 
	    boolean isBipartite(int G[][],int src, int V)
	    {
	        int colorArr[] = new int[V];
	        for (int i=0; i<V; ++i)
	            colorArr[i] = -1;
	 
	        colorArr[src] = 1;
	 
	        LinkedList<Integer>q = new LinkedList<Integer>();
	        q.add(src);
	 
	        while (q.size() != 0)
	        {
	            int u = q.poll();
	 
	            if (G[u][u] == 1)
	                return false;
	 
	            for (int v=0; v<V; ++v)
	            {
	                if (G[u][v]==1 && colorArr[v]==-1)
	                {
	                    colorArr[v] = 1-colorArr[u];
	                    q.add(v);
	                }
	 
	                else if (G[u][v]==1 && colorArr[v]==colorArr[u])
	                    return false;
	            }
	        }
	        return true;
	    }
	 
	    public static void main (String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int v=sc.nextInt();
	    	int [][]G=new int [v][v];
	    	for(int i=0;i<v;i++)
	    	{
	    		for(int j=0;j<v;j++)
	    		{
	    		   G[i][j]=sc.nextInt();
	    		}
	    	}
	       
	        Program2 b = new Program2();
	        if (b.isBipartite(G, 0,v))
	        System.out.println("Yes Bipartite");
	        else
	        System.out.println("Not Bipartite");
	    }
}
