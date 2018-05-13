import java.io.*;
class Z
{
int temp, k,n,l,h,lb,ub,p;
int partition(int l,int h,int a[],int n)
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
	System.out.println("pass: ");
	for(int i=0;i<n;i++)
	{
	System.out.println(a[i]+"  ");
	}
  	return ub;
  }
void quicksort(int l,int h,int a [ ],int n)
  {
	if( l<h)
	{
	  k=partition(l,h,a,n );
	  quicksort( l,k-1,a,n);
	  quicksort( k+1,h,a,n);
	}
  }	
void display(int c,int a[] )
{
 System.out.println("Sorted elements are: "+"  ");
for(int i=0;i<c;i++)
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
      Z z=new Z( );
     z.quicksort(0,m-1,r,m);
     z.display(m,r);
   }
}
/*output
D:\>cd flevia

D:\flevia>javac Quick.java

D:\flevia>java Quick
Enter the size of array:->
4
Enter the elements of array:->
12
78
45
67
pass:
12
78
45
67
pass:
12
67
45
78
pass:
12
45
67
78
Sorted elements are:
12
45
67
78

D:\flevia>
*/