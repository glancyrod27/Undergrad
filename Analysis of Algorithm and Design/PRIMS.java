import java.util.*;
class Graph
{
	int g[][],d[], p[], visited[],v,e;
	
	void createGraph()
	{
	int a, b,w,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of vertices");
	v=sc.nextInt();
	System.out.println("enter the no of edges");
	e=sc.nextInt();
	g=new int[v+1] [v+1];
	for(i=1;i<=v;i++)
	{
	for(j=1;j<=v;j++)
	g[i][j]=0;
	}

	for(i=1;i<=e;i++)
	{
	System.out.println("enter the start node,end node & weight for the edge");
	a=sc.nextInt();
	b=sc.nextInt();
	w=sc.nextInt();
	g[a][b]=g[b][a]=w;
	}
}

	void initialize()
	{
	int i;
	visited= new int[v+1];
	d=new int[v+1];
	p=new int[v+1];
	for(i=1;i<=v;i++)
	{
	p[i]=0;
	visited[i]=0;
	d[i]=327;
	}
	prim();
}

void prim()
{
	int i,c=1,currnt=1,mincost=0;
	visited[currnt]=1;
	d[currnt]=0;
	while(c!=v)
	{
	for(i=1;i<=v;i++)
	{
	if(g[currnt][i]!=0 && visited[i]!=1)
	if(g[currnt][i]<d[i])
	{
	d[i]=g[currnt][i];
	p[i]=currnt;
	}
	}
	int min=327;
	for(i=1;i<=v;i++)
	if(visited[i]!=1 && d[i]<min)
	{
	min=d[i];
	currnt=i;
	}
	visited[currnt]=1;
	c=c+1;
	}
	for(i=1;i<=v;i++)
	mincost=mincost+d[i];
	System.out.println("MIN COST=" +mincost);
}
}
class Execute 
{
public static void main(String args[])
{
Graph g=new Graph();
g.createGraph();
g.initialize();
}
}

/*OUTPUT

E:\sea aoad>java Execute
enter the no. of vertices
6
enter the no of edges
9
enter the start node for the edge
1
enter the end node for the edge
3
enter the weight for the node
2
enter the start node for the edge
1
enter the end node for the edge
4
enter the weight for the node
5
enter the start node for the edge
1
enter the end node for the edge
2
enter the weight for the node
3
enter the start node for the edge
2
enter the end node for the edge
4
enter the weight for the node
1
enter the start node for the edge
3
enter the end node for the edge
4
enter the weight for the node
2
enter the start node for the edge
3
enter the end node for the edge
6
enter the weight for the node
1
enter the start node for the edge
4
enter the end node for the edge
5
enter the weight for the node
3
enter the start node for the edge
2
enter the end node for the edge
5
enter the weight for the node
4
enter the start node for the edge
5
enter the end node for the edge
6
enter the weight for the node
2
MIN COST=8
*/