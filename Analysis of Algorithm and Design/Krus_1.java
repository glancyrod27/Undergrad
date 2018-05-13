import java.util.*;
class Krus
{
 public static void main(String args[])
 {
    int n,m,wt;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of edges");
  int d=sc.nextInt();
    int a[][]=new int[d][d];
  do
{
   System.out.println("enter the starting node ");
  n=sc.nextInt();
 System.out.println("enter the ending node ");
   m=sc.nextint();
System.out.println("enter the weight");
  wt=sc.nextInt();
  for(int i=0;i<d;i++)
  {
    for(int j=0;j<d;j++)
    {
        a[i][j]=sc.nextInt();
   }
}
System.out.println("if u wanna continu press 1");
}while(ch==1);
 }
}