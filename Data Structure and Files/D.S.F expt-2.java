import java.io.*;
class Bubble
{

BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
int temp,n;
int a[];
  void getdata()throws IOException
	{
	System.out.println("Enter the size of array:->");
	n=Integer.parseInt(b.readLine());
	a=new int [n];
	System.out.println("Enter the elements of array:->");
	for(int i=0;i<n;i++)
	  {
	   a[i]=Integer.parseInt(b.readLine());
	  }
        System.out.println("Array elements are:-> ");
	for(int i=0;i<n;i++)
	  {
	   System.out.println(a[i]);
	  }
	}
  void calc()
	{
	  for(int i=0;i<n-1;i++)
	   {
	    System.out.println("pass:"+(i+1)); 
	     for(int j=0;j<n-1;j++)
	      {
		
		if(a[j]>a[j+1])
		  {
		    temp=a[j+1];
		    a[j+1]=a[j];
		    a[j]=temp;
		  }
	      }
	for(int k=0;k<n;k++)
	{
	  System.out.println(a[k]);
	}
	   }
	}  
  void putdata()
     {
	System.out.println("Sorted elements are:-> ");
	for(int i=0;i<n;i++)
	  {
	    System.out.println(a[i]);
          }
     }
}
class Sort
{
 public static void main(String args[ ])throws IOException
   {


      Bubble x=new  Bubble();
      x.getdata();
      x.calc();
      x.putdata();
   }
}   

/*output

Microsoft Windows [Version 6.1.7600]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

D:\>cd flevia

D:\flevia>javac Sort.java

D:\flevia>java Sort
Enter the size of array:->
5
Enter the elements of array:->
25
57
48
37
12
Array elements are:->
25
57
48
37
12
pass:1
25
48
37
12
57
pass:2
25
37
12
48
57
pass:3
25
12
37
48
57
pass:4
12
25
37
48
57
Sorted elements are:->
12
25
37
48
57
D:\flevia>  
*/                                                                                                                                                                 