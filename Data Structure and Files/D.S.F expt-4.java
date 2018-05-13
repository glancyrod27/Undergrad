import java.io.*;
class Sorting
{
int i,j,temp,max,p;
   void insert(int a[],int n)
     {
       for(i=1;i<n;i++)
          {
       	temp=a[i];
      	for(j=i-1;j>=0;j--)
        	  {
	   if(temp<a[j])
	   {
         	    a[j+1]=a[j];
          	    a[j]=temp;
	   }
                    }
           }
     }

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
class Insertion
{
public static void main(String args[ ])throws IOException
   {
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int c[],m,k,choice;
String g;
 	System.out.println("Enter the size of array:->");
	m=Integer.parseInt(b.readLine());
	c=new int [m];
	System.out.println("Enter the elements of array:->");
	for(int i=0;i< m;i++)
	  {
	   c[i]=Integer.parseInt(b.readLine());
	  }
	Sorting s=new Sorting();
        do
	{
	         System.out.println("1.Insertion."+" \n\n"+"2.Selection");
	         System.out.println("Enter a choice");
	         choice=Integer.parseInt(b.readLine());
	          switch(choice)
	            {
	              case 1:
		       {
		       	s.insert(c,m);
		     	System.out.println("Sorted array after Insertion:-> ");
		   	for(k=0;k<m;k++)
		 	  {
 		 	   System.out.println(c[k]);
		 	  }
			break;
		        }
	             case 2:
		      {
		 	 s.select(c,m);
			System.out.println("Sorted array after Selection:-> ");
			for(k=0;k<m;k++)
			 {
 		  	  System.out.println(c[k]);
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


