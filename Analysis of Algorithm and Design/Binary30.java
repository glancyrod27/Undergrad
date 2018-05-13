import java.io.*;
class Search
{
int mid;
     int display(int a[],int s,int l,int h)
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
class Binary30
{
    public static void main(String args[ ])throws IOException
       {
             BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                 int c[],m,n;
 	int x;
 	System.out.println("Enter the size of array:-");
	m=Integer.parseInt(b.readLine());
	c=new int[m];
	System.out.println("Enter a sorted array:-");
	for(int i=0;i< m;i++)
	  {
	   c[i]=Integer.parseInt(b.readLine());
	  }
	System.out.println("Enter the element to be searched:-");
	n=Integer.parseInt(b.readLine());
	Search t=new Search();
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
/*OUTPUT
Microsoft Windows [Version 6.1.7600]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

D:\>javac Binary30.java

D:\>java Binary30
Enter the size of array:-
8
Enter a sorted array:-
04
15
29
45
53
61
77
85
Enter the element to be searched:-
61
Element found at position:->   6

D:\>java Binary30
Enter the size of array:-
5
Enter a sorted array:-
10
36
45
68
98
Enter the element to be searched:-
23
Element not found

D:\>
*/




