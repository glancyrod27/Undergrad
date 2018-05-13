/*Flevia Fargose SE CMPN A- 30*/
import java.io.*;
class Kruskal
{
	int u,v,wt;
	Kruskal(int x,int y,int z)
	{
		u=x;
		v=y;
		wt=z;
	}
	static void sort(Kruskal e[],int n)
	{
	int i,j;
	Kruskal temp;
	for( i=0;i<n-1;i++)
		for ( j=i+1;j<n;j++)
			{
			if (e[i].wt>e[j].wt)
				{
					temp=e[i];
					e[i]=e[j];
					e[j]=temp;
				}
			}
	}
	static boolean cycleCheck(int i,int j,int p[])
	{
		 int u,v;
		u=i;
		v=j;
		while(p[i]>-1)
		i=p[i];
		while(p[j]>-1)
		j=p[j];
		     if(i!=j)
			{
			    System.out.println(u+ "  " +v);
			    p[j]=i;
			    return true;
		               }
			return false;
	
	}
}
class Kruskal1
{
	public static void main(String args[])throws IOException
	{
		int n,m,j,i,cost=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number of nodes and edges");
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		Kruskal e[]=new Kruskal[m];
		int parent[]=new int[n];
		for(i=0;i<n;i++)
			parent[i]=-1;
		for(i=0;i<m;i++)
		{
			System.out.println("enter an edge and its weight");
			int u,v,wt;
			u=Integer.parseInt(br.readLine());
			v=Integer.parseInt(br.readLine());
			wt=Integer.parseInt(br.readLine());
			e[i]=new Kruskal(u,v,wt);
		}
		Kruskal.sort(e,m);
		System.out.println("edges of minimum cost spanning tree");
		i=0;
		j=0;
		while(i<n-1)
		{
			if(Kruskal.cycleCheck(e[j].u,e[j].v,parent))
			{
			     i++;
			     cost+=e[j].wt;
			}
			j++;
		}
		System.out.println("cost=" +cost);
	}
}
/*output
D:\Flevia 30>javac Kruskal1.java
D:\Flevia 30>java Kruskal1
enter number of nodes and edges
5
7
enter an edge and its weight
0
1
2
enter an edge and its weight
1
2
4
enter an edge and its weight
2
3
4
enter an edge and its weight
3
4
6
enter an edge and its weight
4
0
1
enter an edge and its weight
4
1
2
enter an edge and its weight
2
4
8
edges of minimum cost spanning tree
4  0
0  1
1  2
2  3
cost=11
D:\Flevia 30>
*/
