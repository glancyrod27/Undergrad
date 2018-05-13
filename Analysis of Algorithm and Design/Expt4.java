import java.util.*;

class List
{
	int i,j,w;
	List(int i,int j,int w)
	{
		this.i=i;
		this.j=j;
		this.w=w;
	}
}

class Expt4
{
	static int MAXSIZE=51;
	static int adj[][]=new int[MAXSIZE][MAXSIZE];
	static int mst[][]=new int[MAXSIZE][MAXSIZE];
	static List edge[]=new List[MAXSIZE*MAXSIZE];
	static int n;

	static void createGraph()
	{
		Scanner sc=new Scanner(System.in);
		int i,j,parent,adj_parent,initial_node,wt;
		int  ans=0,ans1=0;

		System.out.print("Enter total number elements: ");
		n=sc.nextInt();

		do
		{
			System.out.print("\nEnter parent node: ");
			parent=sc.nextInt();

			do
			{
				System.out.print("Enter adjacent node for node "+parent+ " : ");
				adj_parent=sc.nextInt();
				System.out.print("Enter the weight between node "+parent+" and "+adj_parent+": ");
				wt=sc.nextInt();
				adj[parent][adj_parent]=wt;
				adj[adj_parent][parent]=wt;
				System.out.println("Continue to add adjacent node for "+parent+"(1/0)?");
				ans1=sc.nextInt();
			} while (ans1==1);

			System.out.println("Continue to add graph node?");
			ans=sc.nextInt();
		}while (ans ==1);

		System.out.println("\nAdjacency matrix for your graph is:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(" "+adj[i][j]);
			System.out.print("\n");
		}

		System.out.println("\nYour Undirected Graph is:");
		for (i=1;i<=n;i++)
		{
			System.out.print("Vertex "+i+" is connected to: ");
			for(j=1;j<=n;j++)
			{
				if(adj[i][j]!=0)
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void Kruskal()
	{
		int i,j;
		int e=1,cost=0;
		List t;
		
		for(i=1;i<=n;i++) //Create List of Edges
		{
			for(j=1;j<=n;j++)
			{
				if(i<j)
				{
					if(adj[i][j]!=0)
		      		{
		   				edge[e]=new List(i,j,adj[i][j]);
		   				e++;
		      		}
				}
			}
		}
							
		for(i=e-2;i>=1;i--) //Sort Edges in Ascending Order
		{
			for(j=1;j<=i;j++)
			{
				if(edge[j].w > edge[j+1].w)
				{
					t=edge[j];
					edge[j]=edge[j+1];
					edge[j+1]=t;
				}
			}
		}
		
		//Add Edges to a Empty Graph such that they DO NOT FORM A CYCLE
		int parent[]=new int[n+1];
        		for(i=1;i<=n;i++)
        			parent[i]=-1;
  
  		i=1;j=1;
		while(i<n)
        		{
        			if(cycleCheck(j,parent))
			{			
				System.out.println("Edge ("+edge[j].i +","+edge[j].j+") = "+edge[j].w+" added");
				mst[edge[j].i][edge[j].j]=edge[j].w;
				mst[edge[j].j][edge[j].i]=edge[j].w;
				i++;
				cost+=edge[j].w;
			}
			j++;
 		}

		System.out.println("\nMinimum Spanning Tree matrix for your graph is:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(" "+mst[i][j]);
			System.out.print("\n");
		}

		System.out.println("\nMinimum Spanning Tree is:");
		for (i=1;i<=n;i++)
		{
			System.out.print("Vertex "+i+" is connected to: ");
			for(j=1;j<=n;j++)
			{
				if(mst[i][j]!=0)
				System.out.print(" "+j);
			}
			System.out.println();
		}
				
		System.out.println("\nCost = "+cost);
	}

	static boolean cycleCheck(int i,int p[])
	{
		int u,v;
		u=edge[i].i;
		v=edge[i].j;
		while(p[u]>-1)
			u=p[u];
		while(p[v]>-1)
			v=p[v];
		if(u!=v)
		{
			p[v]=u;
			return true;
		}
		return false;
 	}
		
	public static void main(String args[])
	{
		createGraph();
		Kruskal();
	}
}

/*
OUTPUT:

Enter total number elements: 9

Enter parent node: 1
Enter adjacent node for node 1 : 2
Enter the weight between node 1 and 2: 4
Continue to add adjacent node for 1(1/0)?
1
Enter adjacent node for node 1 : 8
Enter the weight between node 1 and 8: 8
Continue to add adjacent node for 1(1/0)?
0
Continue to add graph node?
1

Enter parent node: 2
Enter adjacent node for node 2 : 3
Enter the weight between node 2 and 3: 8
Continue to add adjacent node for 2(1/0)?
1
Enter adjacent node for node 2 : 8
Enter the weight between node 2 and 8: 11
Continue to add adjacent node for 2(1/0)?
0
Continue to add graph node?
1

Enter parent node: 3
Enter adjacent node for node 3 : 4
Enter the weight between node 3 and 4: 7
Continue to add adjacent node for 3(1/0)?
1
Enter adjacent node for node 3 : 6
Enter the weight between node 3 and 6: 4
Continue to add adjacent node for 3(1/0)?
1
Enter adjacent node for node 3 : 9
Enter the weight between node 3 and 9: 2
Continue to add adjacent node for 3(1/0)?
0
Continue to add graph node?
1

Enter parent node: 4
Enter adjacent node for node 4 : 5
Enter the weight between node 4 and 5: 9
Continue to add adjacent node for 4(1/0)?
1
Enter adjacent node for node 4 : 6
Enter the weight between node 4 and 6: 14
Continue to add adjacent node for 4(1/0)?
0
Continue to add graph node?
1

Enter parent node: 6
Enter adjacent node for node 6 : 7
Enter the weight between node 6 and 7: 2
Continue to add adjacent node for 6(1/0)?
0
Continue to add graph node?
1

Enter parent node: 7
Enter adjacent node for node 7 : 8
Enter the weight between node 7 and 8: 1
Continue to add adjacent node for 7(1/0)?
1
Enter adjacent node for node 7 : 9
Enter the weight between node 7 and 9: 6
Continue to add adjacent node for 7(1/0)?
0
Continue to add graph node?
1

Enter parent node: 8
Enter adjacent node for node 8 : 9
Enter the weight between node 8 and 9: 7
Continue to add adjacent node for 8(1/0)?
0
Continue to add graph node?
0

Adjacency matrix for your graph is:
 0 4 0 0 0 0 0 8 0
 4 0 8 0 0 0 0 11 0
 0 8 0 7 0 4 0 0 2
 0 0 7 0 9 14 0 0 0
 0 0 0 9 0 0 0 0 0
 0 0 4 14 0 0 2 0 0
 0 0 0 0 0 2 0 1 6
 8 11 0 0 0 0 1 0 7
 0 0 2 0 0 0 6 7 0

Your Undirected Graph is:
Vertex 1 is connected to:  2 8
Vertex 2 is connected to:  1 3 8
Vertex 3 is connected to:  2 4 6 9
Vertex 4 is connected to:  3 5 6
Vertex 5 is connected to:  4
Vertex 6 is connected to:  3 4 7
Vertex 7 is connected to:  6 8 9
Vertex 8 is connected to:  1 2 7 9
Vertex 9 is connected to:  3 7 8

Edge (7,8) = 1 added
Edge (3,9) = 2 added
Edge (6,7) = 2 added
Edge (1,2) = 4 added
Edge (3,6) = 4 added
Edge (3,4) = 7 added
Edge (1,8) = 8 added
Edge (4,5) = 9 added

Minimum Spanning Tree matrix for your graph is:
 0 4 0 0 0 0 0 8 0
 4 0 0 0 0 0 0 0 0
 0 0 0 7 0 4 0 0 2
 0 0 7 0 9 0 0 0 0
 0 0 0 9 0 0 0 0 0
 0 0 4 0 0 0 2 0 0
 0 0 0 0 0 2 0 1 0
 8 0 0 0 0 0 1 0 0
 0 0 2 0 0 0 0 0 0

Minimum Spanning Tree is:
Vertex 1 is connected to:  2 8
Vertex 2 is connected to:  1
Vertex 3 is connected to:  4 6 9
Vertex 4 is connected to:  3 5
Vertex 5 is connected to:  4
Vertex 6 is connected to:  3 7
Vertex 7 is connected to:  6 8
Vertex 8 is connected to:  1 7
Vertex 9 is connected to:  3

Cost = 37
*/

