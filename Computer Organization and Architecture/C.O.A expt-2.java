import java.io.*;
class Multiply
{
  void shift(int p,int b[],int r[])
      {
	for(int k=3;k>0;k--)
	{
	r[k]=r[k-1];
	}
	r[0]=b[3];
	for(int i=3;i>0;i--)
	{
	 b[i]=b[i-1];
	}
	b[0]=p;
	p=0;
      }
    void add(int p,int b[],int f[]) 
    {
      for(int l=0;l<4;l++)
       {

	if(b[l]+f[l]+p==0)
	{
		b[l]=0;
	}
	else
	{
		if(b[l]+f[l]+p==1)
		{
		   b[l]=1;

	        }
	        if(b[l]+f[l]+p==2)
		{
		   b[l]=0;
		   p=1;
		}
		 if(b[l]+f[l]+p==3)
		{
		   b[l]=1;
		   p=1;
		}

               b[l]=p;
	}
    }
}

}
class Unsigned
{ 
   public static void main(String args[])throws IOException
    {
	BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

	int c=0;
	int a[]=new int[4];
	int q[]=new int[4];
	int m[]=new int[4];
	System.out.println("enter the multiplicand in binary");
	for(int i=0;i<4;i++)
	 {
	  m[i]=Integer.parseInt(d.readLine());
	 }
	System.out.println("enter the mutiplier in binary");
	for(int i=0;i<4;i++)
	 {
	  q[i]=Integer.parseInt(d.readLine());
	 }
	for(int i=0;i<4;i++)
	 {
	  a[i]=0;
	 }
	Multiply t=new Multiply();
	for(int j=0;j<4;j++)
	 {
           if(q[3]==0)
	   {
	     t.shift(c,a,q);
	   }
	   else
 	   {
              t.add(c,a,m);
	      t.shift(c,a,q);
	   }
	 }
    		System.out.println("multiplication==");
		for(int i=0;i<4;i++)
		 {
		   System.out.print(a[i]);
		  }
		for(int i=0;i<4;i++)
		 {
		   System.out.print(q[i]);
		  }     
	 }
}


D:\FLEVIA>javac Unsigned.java

D:\FLEVIA>java Unsigned
enter the multiplicand in binary
0
0
1
1
enter the mutiplier in binary
0
0
1
0
multiplication==
00000110
D:\FLEVIA>









