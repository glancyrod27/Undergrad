
import java.io.*;
class Graph
{  
 final  int INF=1000;
 boolean   adj[ ][ ];
 int   weight[ ][ ];
 int   n;
 int   m;
 Graph(int n,int m )
 {
  this.n=n;
  this.m=m;
  adj=new boolean [n][n];
  weight=new int[n][n];
 }
 void createGraph( )throws IOException
 {
  int i,j,a,b,wt;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  for(i=0;i<n;++i)
   for(j=0;j<n;++j)
    if(i==j)
     weight[i][j]=0;
    else
     weight[i][j]=INF;
  for(i=1;i<=m;++i)
  {
   System.out.println("Enter an edge  and its weight");
   a=Integer.parseInt(br.readLine());
   b=Integer.parseInt(br.readLine());
   wt=Integer.parseInt(br.readLine());
   adj[a][b]=true;
   weight[a][b]=wt;
  }
 }                    
 void prim(int v)
 {
  int i,j,mindist,root,current=0,cost=0;
  int dist[ ]=new int[n];
  int nearest[ ]=new int[n];
  root=v;
  for(i=0;i<n;++i)
  {
   dist[i]=weight[root][i];
   nearest[i]=root;
  }
  dist[v]=-1;
  for(i=1;i<=n-1;++i)
  {  
   mindist=INF;
   for(j=0;j<n;++j)
    if(dist[j]!=-1 && dist[j]<mindist)
    {
     mindist=dist[j];
     current=j;
    }
   System.out.println(nearest[current]+"  "+current);
   cost+=dist[current];
   dist[current]=-1;
   for(j=0;j<n;++j)
    if(dist[j]!=-1 && weight[current][j]<dist[j])
    {
     dist[j]=weight[current][j];
     nearest[j]=current;
    }
  }
  System.out.println("Cost="+cost);
 }

}
class Prim
{
 public static void main(String args[ ])throws IOException
 { 
  int n,m;
  BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter number of node &edges");
  n=Integer.parseInt(br.readLine());
  m=Integer.parseInt(br.readLine());
  Graph g1=new Graph(n,m);
  g1.createGraph();

  System.out.println("Edges of the requiured Minimal Spanning Tree");
  g1.prim(0);
 }
}


/*  OUTPUT
 *
C:\j2sdk1.4.2_04\bin>javac Prim.java

C:\j2sdk1.4.2_04\bin>java Prim
Enter number of node &edges
5
5
Enter an edge  and its weight
0
1
5
Enter an edge  and its weight
0
2
10
Enter an edge  and its weight
1
2
20
Enter an edge  and its weight
2
3
5
Enter an edge  and its weight
3
4
6
Adjacency Matrix
 F   T   T   F   F
 F   F   T   F   F
 F   F   F   T   F
 F   F   F   F   T
 F   F   F   F   F
Weight Matrix
0  5  10  ?  ?
?  0  20  ?  ?
?  ?  0  5  ?
?  ?  ?  0  6
?  ?  ?  ?  



Edges of the requiured Minimal Spanning Tree
0  1
0  2
2  3
3  4
Cost=26

C:\j2sdk1.4.2_04\bin>
*/
