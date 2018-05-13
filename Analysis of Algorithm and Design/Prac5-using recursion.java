import java.util.*;
class Pdemo
{
int recur (int low,int high,int x[],int key,int mid)
              {
	if(x[mid]==key)
	  {
                 mid=mid+1;
	  return(mid);
	  }
                else 
	{
	if(key>x[mid])
	{
	low=mid+1;
	mid=(low+high)/2;
	}
	else if(key<x[mid])
	{
	high=mid-1;
                 mid=(low+high)/2;         
	}
	return(recur(low,high,x,key,mid));
	}}
             }
class Prac5
        {
	public static void main(String args[])
	{
	int a[]=new int[20];
	Scanner s=new Scanner(System.in);
	Pdemo p=new Pdemo();
	System.out.println("Enter the no.of element");
	int n=s.nextInt();
	System.out.println("Enter the element to be searched");
	int key=s.nextInt();
	System.out.println("Enter the  array");
	for(int i=0;i<n;i++)
	{
	a[i]=s.nextInt();
	}
               for(int j=0;j<n-1;j++)
	{
	for(int k=0;k<n-1;k++)
	  {
	    if(a[k]>a[k+1])
		{
		int temp=a[k];
		a[k]=a[k+1];
		a[k+1]=temp;
		}
	}
	}
	System.out.println(" the sorted  array is");
	for(int i=0;i<n;i++)
	{
	System.out.println(a[i]);
	}
	int mid=(n-1)/2;
	                  int ans= p.recur(0,n-1,a,key,mid);
	System.out.println("the element is at "+ans);
	}
     }


/*OUT PUT

D:\>javac Prac5.java

D:\>java Prac5
Enter the no.of element
6
Enter the element to be searched
3
Enter the  array
2
6
13
3
4
5
 the sorted  array is
2
3
4
5
6
13
the element is at 2

D:\>*/









	