import java.util.*;
class queue
{
   int front,rear,maxsize;
   int arr[]=new int[40];
   queue()
    {
       front=-1;
       rear=-1;
     }
   void insert(int x)
    {
        if(rear==39)
          System.out.println(" Queue full");
        else 
          {
             if(front==-1)
               {
                 front++;
                 rear++;
                arr[rear]=x;
               //System.out.println(x+" is inserted successfully");
               }
           else
             {
                rear++;
                arr[rear]=x;
               //System.out.println(x+" is inserted successfully");
             }
         }
}
int delete()
{
   int y;
   if((front==-1)&&(front> rear))
         {
             System.out.print(" Empty queue");
             return 0;
          }
      else
         {
            if(front==rear)
             {
              y=arr[front];
              front=rear=-1;
              return y;
             }
            else
             {
                y=arr[front];
               front++;
                //System.out.println(arr[front]+" deleted successfully");
               return y;
            }
         }
}
boolean empty()
{
     if((front==-1)||(front> rear))
         {
              return true;
          }
     else
           return false;
}  
void bfs(int a[][], int start, int n)
{
  int i,j,h;
  int visited[]=new int[40];
 queue q=new queue();
  for(i=1;i<=n;i++)
    visited[i]=0;
 h=start;
visited[h]=1;
System.out.println(" BFS Sequence ");
while(true)
{ 
  System.out.print("  "+h);
  for(j=1;j<=n;j++)
    {
         if((a[h][j]==1)&&(visited[j]==0))
           {
                insert(j);
                visited[j]=1;
            }
  }
if(empty())
  return ;
else
 h=delete();
}
}
}
class bfs
{
   public static void main(String args[])
     {
         
          int a[][]=new int[40][40];
          int n,start,i,j;
        Scanner sc=new Scanner(System.in);
         System.out.print(" Enter total number of vertices ");
          n=sc.nextInt();
         System.out.println(" Enter adjacency matrix ");
         for(i=1;i<=n;i++)
         {
          for(j=1;j<=n;j++)
          {
            a[i][j]=sc.nextInt();
            System.out.print("    ");
          }
           System.out.println("\n");
         }
         System.out.println(" Enter start vertex ");
         start=sc.nextInt();
        queue Q=new queue();
        Q.bfs(a,start,n);
  }
}
        
        
