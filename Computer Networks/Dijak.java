import java.util.*;

public class Dijak
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Dijakstra d= new Dijakstra();
        System .out.println("Enter the no. of nodes");
        int n=sc.nextInt();
        System .out.println("Enter the no. of edges");
        int e=sc.nextInt();
        d.createGraph(e,n);
        System .out.println("Enter the source node");
        int x =sc.next().toUpperCase().charAt(0)-65;
        d.CalcPath(x);
    }
}
class Dijakstra
{
   final  int IN=10000;
    int a[][],dist[],prev[];
    boolean select[];

   void createGraph(int e,int n)
   {
        Scanner sc=new Scanner(System.in);
        a= new int[n][n];
        dist= new int[n];
        prev= new int[n];
        select= new boolean[n];
        for(int i =0;i<n;i++)
        {
           dist[i]=IN;
            for(int j=0;j<n;j++)
             {
                a[i][j]= IN;
             }
        }
        for(int i =0;i<e;i++)
        {
            System .out.println("Enter the edge name");
            String s=sc.next();
            s=s.toUpperCase();
            int u=s.charAt(0)-65;
            int v=s.charAt(1)-65;
            System .out.println("Enter the weight");
            int w= sc.nextInt();
            a[u][v]= w;
        }
   }
    void CalcPath(int x)
    {
        int currdist;
     int src = x;
        int min=10000,m=0;
        dist[x]=0;
        select[x]=true;

        for(int k=1;k<a.length;k++)
        {
            for(int i=0;i<a.length;i++)
            {
               currdist=a[x][i]+dist[x];

               if(currdist < dist[i] &&!select[i])
               {
                   dist[i]=currdist;
                   prev[i]=x;
               }
            }
            for(int i=0;i<a.length;i++)
            {
                if(min > dist[i] &&!select[i])
               {
                  min=dist[i];
                  m=i;
               }
            }
            select[x]=true;
            x=m;
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
             System.out.println("Minimum distance from  "+(char)(src+65)+ "  to "
+(char)(i+65)+ "  =  "+ dist[i]);
        }
    }
}
