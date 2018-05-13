import java.io.*;

class Kruskal
{
int flag;
int graph[][];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Kruskal(int n)
{
graph=new int[n][n];
flag=1;
}

void input(int n)throws IOException
{
System.out.println("Enter the values for edges with its weight");
while(flag==1)
{
System.out.println("Enter the start node");
int s=Integer.parseInt(br.readLine());
System.out.println("Enter the end node");
int e=Integer.parseInt(br.readLine());
System.out.println("Enter the weight of the edge");
int w=Integer.parseInt(br.readLine());
graph[s][e]=w;
graph[e][s]=w;
System.out.println("Enter 1 to continue else press any key");
}


System.out.println("The edges are:");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println(graph[i][j]==1);
{
if (graph[i][j]!=0)
System.out.println("Node"+i+" to node "+j+"  Weight of the edge is"+graph[i][j]);
}
}
}
}
}



class Krus
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no of  nodes");
int n=Integer.parseInt(br.readLine());
Kruskal k=new Kruskal(n);
k.input(n+1);
}
}



