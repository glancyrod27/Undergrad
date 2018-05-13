import java.io.*;
class Sorting
{
  int i,j,max,p;
   void select(int x[],int l)
  {
     j=l-1;
       while(j!=0)
          {
            max=x[0];
            p=0;
             for(i=0;i<=j;i++)
               {
                 if(x[i]>max)
	{
	   max=x[i];
	   p=i;
	}
               }
		x[p]=x[j];
	 	x[j]=max;
		    j--;
                 }
    }
}
class Selection
{
    public static void main(String args[ ])throws IOException
     {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int c[],m,k;

 	System.out.println("Enter the size of array:->");
	m=Integer.parseInt(b.readLine());
	c=new int [m];
	System.out.println("Enter the elements of array:->");
	for(int i=0;i< m;i++)
	  {
	   c[i]=Integer.parseInt(b.readLine());
	  }
	Sorting s=new Sorting();
  	 s.select(c,m);
	System.out.println("Sorted array after Selection:-> ");
	for(k=0;k<m;k++)
	 {
 	  System.out.println(c[k]);
	 } 
      }
}


/* OUTPUT

D:\>javac Selection.java

D:\>java Selection
Enter the size of array:->
7
Enter the elements of array:->
90
56
38
78
12
4
49
Sorted array after Selection:->
4
12
38
49
56
78
90
D:\>
*/



