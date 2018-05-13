import java.io.*;
class Search
{
int mid;
     int found(int a[],int m,int no)
        {
	int l=0,h=m-1;
	
             while(l<=h)
             {
	mid=(l+h)/2;
	  if(a[mid]==no)
	    {
		return (mid);
             	    }
     	   else
                     {
          	            if(a[mid]<no)
		   {
	   	           l=mid+1;
			
	                     }
       	               else
		     {
		            h=mid-1;
		            
	         	     }
	     }
              }
              return (-1);
       }

}

class Binary1
{
    public static void main(String args[ ])throws IOException
       {
             BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                 int c[],n;
 	int x,p;
 	System.out.println("Enter the size of array:-");
	n=Integer.parseInt(b.readLine());
	c=new int[n];
	System.out.println("Enter a sorted array:-");
	for(int i=0;i< n;i++)
	  {
	   c[i]=Integer.parseInt(b.readLine());
	  }
	System.out.println("Enter the element to be searched:-");
	p=Integer.parseInt(b.readLine());
	Search t=new Search();
	x=t.found(c,n,p);
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