/* graph coloring */
import java.io.*;
class clrg
{
static int cnt;
static
{
cnt=999;
}
 static int mclr(int adj[][],int x[],int k,int n)
 {
  for(int i=0;i<n;i++)
  {
   x[k]=i+1;
   if(cclr(adj,x,k))
   {
   if(k==n-1)
   {
   if(cnt>=max(x,n))
   {
    System.out.println("Solution");   
    for(int j=0;j<n;j++)
	 System.out.print(x[j]+" ");
    cnt=max(x,n);
   }
   }
   else
    mclr(adj,x,k+1,n);
   }
  }
  return cnt;
 }
 static int max(int x[],int n)
 {
  int max=0;
  for(int i=0;i<n;i++)
   if(x[i]>max)
   max=x[i];
  return max;
 }  
 static boolean cclr(int adj[][],int x[],int k)
 {
  for(int j=0;j<k;j++)
  {
   if((x[j]==x[k])&&(adj[j][k]==1))
    return false;
  }
  return true;
 }
 public static void main(String args[])throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int adj[][],x[],n;
  System.out.println("Enter no. of nodes:");
  n=Integer.parseInt(br.readLine());
  x=new int[n+1];
  adj=new int[n+1][n+1];
  System.out.println("Enter the edges:");
  for(int i=0;i<n;i++)
  x[i]=0;
  for(int i=0;i<((n-1)*n/2);i++)
  {
  int a=Integer.parseInt(br.readLine());
  int b=Integer.parseInt(br.readLine());
  if((a==0)&&(b==0))
   break;
  adj[a-1][b-1]=1;
  adj[b-1][a-1]=1;
  }
 System.out.println("\nNo. of colors:"+mclr(adj,x,0,n));
  }
}


/*output


C:\Program Files\Java\jdk1.5.0\bin>javac clrg.java

C:\Program Files\Java\jdk1.5.0\bin>java clrg
Enter no. of nodes:
4
Enter the edges:
1
2
2
3
3
4
4
1
0
0
Solution
1 2 1 2 Solution
2 1 2 1
No. of colors:2

*/ 