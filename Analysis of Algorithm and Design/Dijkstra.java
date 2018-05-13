Name:Leena Fernandes       Class:S.E.CMPN/A     Roll:33
import java.util.*;
class Graph
{
int g[][],p[],d[],visited[],v;
	
	void createGraph()
	{
	System.out.println("Enter the graph");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no. of vertices");
	v=sc.nextInt();
	System.out.println("Enter the no. of edges");
	int e=sc.nextInt();
	
	g=new int[v+1][v+1];
	for(int i=1;i<=v;i++)
	for(int j=1;j<=v;j++)
	g[i][j]=0;
	
	for(int i=1;i<=e;i++)
	{
	System.out.println("Enter the start node for the edge");
	int a=sc.nextInt();
	System.out.println("Enter the end node for the edge");
	int b=sc.nextInt();
	System.out.println("Enter the weight of the edge");
	int w=sc.nextInt();
	g[a][b]=g[b][a]=w;
	}
	}

void initialize()
{
	visited=new int[v+1];
	d=new int[v+1];
	p=new int[v+1];
	
	for(int i=1;i<=v;i++)
	p[i]=visited[i]=0;
	for(int i=1;i<=v;i++)
	d[i]=32337;
	
	dijkstra();
}

void dijkstra()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string node for shortest distance");
	int source=sc.nextInt();
	System.out.println("Enter the destination node for the shortest distance");
	int dest=sc.nextInt();
	int current=source;
	visited[current]=1;
	d[current]=0;
	
	while(current!=dest)
	{
	int dc=d[current];
	
	for(int i=1;i<=v;i++)
	{
	if(g[current][i]!=0 && visited[i]!=1)
	if(g[current][i]+dc<d[i])
	{
	d[i]=g[current][i]+dc;
	p[i]=current;
	}
	}

	int min=32676;
	for(int i=1;i<=v;i++)
	if(visited[i]!=1 && d[i]<min)
	{
	min=d[i];
	current=i;
	}
	visited[current]=1;
	}
	System.out.println("Shortest distance="+d[dest]);
}
}
class Dijkstra
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	Graph g=new Graph();
	g.createGraph();
	g.initialize();
	g.dijkstra();
	}
}

/*Output

D:\lee>java Dijkstra
Enter the graph
Enter the no. of vertices
6
Enter the no. of edges
9
Enter the start node for the edge
1
Enter the end node for the edge
2
Enter the weights of the edge
3
Enter the start node for the edge
1
Enter the end node for the edge
3
Enter the weights of the edge
2
Enter the start node for the edge
1
Enter the end node for the edge
4
Enter the weights of the edge
5
Enter the start node for the edge
2
Enter the end node for the edge
4
Enter the weights of the edge
1
Enter the start node for the edge
3
Enter the end node for the edge
4
Enter the weights of the edge
2
Enter the start node for the edge
2
Enter the end node for the edge
5
Enter the weights of the edge
4
Enter the start node for the edge
4
Enter the end node for the edge
5
Enter the weights of the edge
3
Enter the start node for the edge
3
Enter the end node for the edge
6
Enter the weights of the edge
1
Enter the start node for the edge
5
Enter the end node for the edge
6
Enter the weights of the edge
2
Enter string node for shortest distance
1
Enter the destination node for the shortest distance
6
Shortest distance=3

*/