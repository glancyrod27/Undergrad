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
		  }
		while(s.equalsIgnoreCase("y"));
	}
	void dfs(int r)
	{
		visited[r]=true;
		System.out.print((char)(r+65)+" ");
		for (int i=0;i<a.length;i++)
		{
			if(a[r][i]&&(!visited[i]))
			dfs(i);
		}
	}
}

class Expt12
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
		System.out.println("\nDepth First Search of the Graph: ");
		g.dfs(0);
	}
}



/*OUTPUT:
D:\>java Expt12
Enter no. of vertices:
5
Directed? true/false
true
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

Depth First Search of the Graph:
A B C D E*/