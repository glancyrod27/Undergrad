import java.io.*;
public class dijk
 {
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int mat[][],i,j,node,root,pl[],tl[],count,t;
char a,b,m;
System.out.print("Enter number of nodes:");
node=Integer.parseInt(br.readLine());
mat=new int[node][node];
System.out.println("Enter the path cost:");
for(i=0,a='A';i<node;i++,a++)
for(j=0,b='A';j<node;j++,b++)  
{
    System.out.print("For node "+a+" - "+b+" :");
    mat[i][j]=Integer.parseInt(br.readLine());
}   
System.out.print("The values are:");
for(t=0,m='A';t<node;t++)
{
  System.out.print("\t"+ m);  
  m++;
}
 System.out.println("\n"); 

for(i=0,a='A';i<node;i++,a++)
{
   System.out.print(a);  
   for(j=0;j<node;j++) 
   {
      System.out.print("\t "+mat[i][j]);   
   }
   System.out.println("\n"); 
}
System.out.println("Select the source node(type 0 for A, 1 for B and so on....)");
root=Integer.parseInt(br.readLine());
tl=new int[node];
pl=new int[node];
int temp=root,wt=0,least=0,x=0;
for(i=0;i<node;i++)
tl[i]=mat[root][i];
for(count=0;count<node;count++)
{
    for(i=0;i<node;i++)
    {
        if(wt+mat[temp][i]<tl[i] && tl[i]!='*')
            tl[i]=(wt+mat[temp][i]);
        if(tl[i]<tl[least])
         least=i;
    }
    wt=tl[least];
    pl[least]=wt;
    temp=least;
    tl[least]='*';
}
 System.out.println("\n"+" The shortest path costs from source node "+root+" are:");
 for(i=0,a='A';i<node;i++,a++)
     System.out.println("\n "+a+" ("+pl[i]+")");
}
}

/* OUTPUT:
D:\glancy>javac dijk.java

D:\glancy>java dijk
Enter number of nodes:4
Enter the path cost:
For node A - A :0
For node A - B :3
For node A - C :6
For node A - D :11
For node B - A :3
For node B - B :0
For node B - C :3
For node B - D :5
For node C - A :6
For node C - B :3
For node C - C :0
For node C - D :1
For node D - A :11
For node D - B :5
For node D - C :1
For node D - D :0
The values are: A       B       C       D

A        0       3       6       11

B        3       0       3       5

C        6       3       0       1

D        11      5       1       0

Select the source node(type 0 for A, 1 for B and so on....)
0

 The shortest path costs from source node 0 are:

 A (0)

 B (3)

 C (6)

 D (7)

D:\glancy>
*/