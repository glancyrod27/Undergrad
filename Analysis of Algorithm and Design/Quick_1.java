import java.io.*;
class Sorting
{
int temp, k,n,l,h,lb,ub,p;
int partition(int a[],int l,int h,int n)
{
         		p=a[l];
		 lb=l;
	 	ub=h;
    	  while(lb<ub)
		{
		   while(a[lb]<=p && lb < h)
		         lb=lb+1;
		  while(a[ub]>p)
		         ub=ub-1;
		}
        	 if(lb<ub)
	  {
	         temp=a[lb];
	         a[lb]=a[ub];
	         a[ub]=temp;
	  }
	a[l]=a[ub];
  	a[ub]=p;
  	return ub;
  }
void quicksort( int a[],int l,int h,int n)
  {
	if( l<h)
	{
	  k=partition(a,l,h,n);
	  quicksort( a,l,k-1,n);
	  quicksort( a,k+1,h,n);
	}
  }
void display(int a[] ,int m)
{
 System.out.println("Sorted elements are:-> ");
         for(int i=0;i<m;i++)
	{
	   System.out.println(a[i]+"  ");
	}
}
}
class Quick
{
   public static void main(String args[ ] )throws IOException
   {
         BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
           int m,r[];
	System.out.println("Enter the size of array:->");
	m=Integer.parseInt(b.readLine());
	r=new int [m];
	System.out.println("Enter the elements of array:->");
	for(int i=0;i<m;i++)
	  {
	          r[i]=Integer.parseInt(b.readLine());
	  }
      Sorting z=new Sorting ( );
     z.quicksort(r,0,m-1,m);
     z.display(r,m);
   }
}
/*output
D:\Flevia 30>javac Quick.java
D:\Flevia 30>java Quick
Enter the size of array:->
6
Enter the elements of array:->
20
10
46
30
60
55
Sorted elements are:->
10
20
30
46
55
60
 */