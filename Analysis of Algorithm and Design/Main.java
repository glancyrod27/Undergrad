import java.util.*;
class Merge
{
 void divde(int a[],int low,int high)
{  
  
   if(low<high)
  
{
    
   int mid=(low+high)/2;
  divde(a,low,mid);

    divde(a,mid+1,high);
 Sort(a,low,high,mid);
  
}

}
void Sort(int a[],int low,int high,int mid)
{
  int i=low;
   int j=mid+1;
   int k=low;
   int b[]=new int[10];
  while(i<=mid && j<=high)
  {
    if(a[i]<a[j])
   {
      b[k]=a[i];
      i=i+1;
     k=k+1;
   }
 else
  {
    b[k]=a[j];
    j=j+1;
   k=k+1;
 }
while(i<=mid)
 {
  b[k]=a[i];
  i=i+1;
 k=k+1;
}
while(j<=high)
{
  b[k]=a[j];
  j=j+1;
 k=k+1;
} }  
for(int t=0;t<10;i++)
  {
    a[t]=b[t];
 }

}
}

class Main
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Merge m=new Merge();
 int a[]=new int[10];
  System.out.println("enter array elements");
  
    for(int i=0;i<10;i++)
   {
    a[i]=sc.nextInt();
  }
for(int i=0;i<10;i++)
   {
    System.out.print(a[i]+"  ");
  }
 m.divde(a,0,9);
System.out.println("elements aftr sorting");
for(int p=0;p<10;p++)
{
 System.out.print(a[p]+ "    ");
 }
 
}
}