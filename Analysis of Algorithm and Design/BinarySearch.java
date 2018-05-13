import java.io.*;
class Search
{
    int mid;
        int binsearch1(int a[], int no, int l, int h)
          {
               mid=(l+h)/2;
                if(l>h)
                {
                          return( -1);
                }
                else
               {
          	          if(a[mid]==no)
	          {
	   	    return mid;
	          }
       	          else
	          {
	   	     if(no<a[mid])
	       	      {
	          	              return binsearch1(a,no,l,mid-1);
	         	      }
	                     else
	       	      {
	            	               return binsearch1(a,no,mid+1,h);
	                      }	
	          }
              }
        }
	 int binsearch2(int a[],int r,int no)
       	 {
		int l=0,h=r-1;
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
class BinarySearch
{
    public static void main(String args[ ])throws IOException
       {
             BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
                 int c[],m,p,x,choice;
	String g;
 	System.out.println("Enter the size of array:-");
	m=Integer.parseInt(b.readLine());
	c=new int [m];
	System.out.println("Enter a sorted array:-");
	for(int i=0;i< m;i++)
	  {
	   c[i]=Integer.parseInt(b.readLine());
	  }
	System.out.println("Enter the element to be searched:-");
	p=Integer.parseInt(b.readLine());
	Search t=new Search();
	  do
	   {
	       System.out.println("1.Binary search using Recurrsion."+" \n"+"2.Binary search using Itteration.");
	         System.out.println("Enter a choice");
	         choice=Integer.parseInt(b.readLine());
	          switch(choice)
	            {
	               case 1:
	                       {
			x=t.binsearch1(c,p,0,m-1);
			if(x>0)
			{
			        System.out.println("Element is present at position:->"+"   "+(x+1));
			}
			else
			{
			         System.out.println("Element not present");
			}   
			 break;      
 		        }	
		case 2:
		       {	
			x=t.binsearch2(c,m,p);
	                                if(x>0)
			{
		                        System.out.println("Element is present at position:->"+"   "+(x+1));
			}
			else
			{
			        System.out.println("Element not present");
			}  
		                break;
		       }
		 default:
		        {
		           	 System.out.println("wrong entry");
		           	 break;
		         }
	          }
	        System.out.println("Do you  wish to continue??"+"\n");
	        System.out.println("If yes, enter Y"+"\n"+"If no, enter N"+"\n");
	        g=b.readLine();
	  }
                   while(g.equalsIgnoreCase("Y"));
        }
}
   
/*OUTPUT
D:\ Flevia 30>javac BinarySearch.java
D:\ Flevia 30>java BinarySearch
Enter the size of array:-
8
Enter a sorted array:-
10
19
28
37
46
50
63
72
Enter the element to be searched:-
46
1.Binary search using Recurrsion.
2.Binary search using Itteration.
Enter a choice
1
Element is present at position:->   5
Do you  wish to continue??

If yes, enter Y
If no, enter N

y
1.Binary search using Recurrsion.
2.Binary search using Itteration.
Enter a choice
2
Element is present at position:->   5
Do you  wish to continue??

If yes, enter Y
If no, enter N

n
*/