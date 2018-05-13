import java.util.*;
class Graph
{
	boolean directed, visited[], a[][];
	Graph(int n, boolean b)
	{
		a=new boolean[n][n];
		directed=b;
		visited=new boolean[n];
	}
	void createGraph()
	{
		Scanner sc=new Scanner(System.in);
		String s;
		do{
			System.out.println("Enter edge name: ");
			s=sc.next().toUpperCase();
			int x=s.charAt(0)-65;
			int y=s.charAt(1)-65;
			a[x][y]=true;
			if(!directed)
			a[y][x]=true;
			System.out.println("Do you wish to continue? y/n");
			s=sc.next();
		}while(s.equalsIgnoreCase("y"));
	}
	void bfs(int r)
	{
		int q[]=new int[a.length];
		boolean visited[]=new boolean[a.length];
		int rear=-1, front=-1;
		visited[r]=true;
		q[++rear]=r;
		System.out.print((char)(r+65)+" ");
		do{
			r=q[++front];
			for(int i=0;i<a.length;i++)
			{
				if(a[r][i]&&(!visited[i]))
				{
					q[++rear]=i;
					visited[i]=true;
					System.out.print((char)(i+65)+" ");
				}
			}
		}while(rear!=front);
	}
}

class Expt13
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of vertices: ");
		int n=sc.nextInt();
		System.out.println("Directed? true/false");
		boolean b=sc.nextBoolean();
		Graph g=new Graph(n, b);
		g.createGraph();
		System.out.println("\nBreadth First Search of the Graph: ");
		g.bfs(0);
	}
}



/*OUTPUT:

D:\>java Expt13
Enter no. of vertices:
5
Directed? true/false
TRUE
Enter edge name:
AB
Do you wish to continue? y/n
Y
Enter edge name:
BC
Do you wish to continue? y/n
Y
Enter edge name:
CD
Do you wish to continue? y/n
Y
Enter edge name:
DE
Do you wish to continue? y/n
N

Breadth First Search of the Graph:
A B C D E
*\


