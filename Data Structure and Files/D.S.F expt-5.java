import java.io.*;
class Sorting
{
int mid;
     int display(int a[], int s, int l, int h)
        {
               mid=(l+h)/2;
         if(l>h)
             {
                  return( -1);
             }
         else
               {
          	   if(a[mid]==s)
		{
	   	    return mid;
	                     }
       	    else
		{
	   	     if(s<a[mid])
	       	     {
	          	        return display(a,s,l,mid-1);
	         	     }
	                     else
	       	    {
	            	      return display(a,s,mid+1,h);
	                        }	
	                    }
              }
        }
}
class Binary
{
    public static void main(String args[ ])throws IOException
       {
             BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                 int c[],m,n,x;
 	System.out.println("Enter the size of array:->");
	m=Integer.parseInt(b.readLine());
	c=new int [m];
	System.out.println("Enter a sorted array:->");
	for(int i=0;i< m;i++)
	  {
	   c[i]=Integer.parseInt(b.readLine());
	  }
	System.out.println("Enter the element to be searched:->");
	n=Integer.parseInt(b.readLine());
	Sorting t=new Sorting();
	x=t.display(c,n,0,m-1);
	if(x>0)
	{
	System.out.println("Element found at position:->"+"   "+(x+1));
	}
	else
	{
	System.out.println("Element not found");
	}         
 }	
}
/*output
D:\flevia>javac Binary.java

D:\flevia>java Binary
Enter the size of array:->
4
Enter a sorted array:->
1
3
4
5
Enter the element to be searched:->
5
Element found at position:->   4

D:\flevia>javac Binary.java

D:\flevia>java Binary
Enter the size of array:->
4
Enter a sorted array:->
7
8
9
12
Enter the element to be searched:->
45
Element not found

D:\flevia>
*/