import java.io.*;
class Multiply
{
int i;
	int a[]=new int[4];
	int q[]=new int[5];
	int m[]=new int[4];
	int n[]=new int[4];
int k,l;
void read()
{

	System.out.println("enter the 4 bit multiplicand in binary");
	for(i=0;i<4;i++)
	 {
	  m[i]=Integer.parseInt(d.readLine());
	 }
	System.out.println("enter the 5 bit mutiplier in binary with last bit 0");
	for(i=0;i<5;i++)
	 {
	  q[i]=Integer.parseInt(d.readLine());
	 }
	for(i=0;i<4;i++)
	 {
	  a[i]=0;
	 }
	for(i=0;i<4;i++)
	 {
		if(i==3)
		{
			n[i]=1;
		}
		else
		{	
			n[i]=0;
		}
	}
}

  void shift()
      {
	for(k=4;k>0;k--)
	{
		r[k]=r[k-1];
	}
	r[0]=b[3];
	for(k=3;k>0;k--)
	{
		 b[k]=b[k-1];
	}
	b[0]=p;
	p=0;
      }
    void add() 
    {
      for(l=0;l<4;l++)
       {

	if(a[l]+m[l]+c==0)
	{
		a[l]=0;
	}
	else
	{
		if(a[l]+m[l]+c==1)
		{
		   a[l]=1;

	             }
	             if(a[l]+m[l]+c==2)
		{
		  a[l]=0;
		   c=1;
		}
		 if(a[l]+m[l]+c==3)
		{
		   a[l]=1;
		   c=1;
		}

                          a[l]=c;
	}
        }
    }
        void comp()
                {
                                for(k=0;k<4;k++)
                               m[k]=0;
                                m[4]=1;
                                for( k=0;k<5;k++)
                                {
                                                if(q[k]==0)
                                                q[k]=1;
                                                else
                                                q[k]=0;
                                }
                                for(int i=4;i>=0;i--)
                                {
                                                a[i]=a4[i]+a3[i]+carry1;
                                                if(q[i]==0)
                                                {
                                                               q[i]=0;
                                                                carry1=0;
                                                }
                                                if(q[i]==1)
                                                {
                                                                q[i]=1;
                                                                carry1=0;
                                                }
                                                if(q[i]==2)
                                                {
                                                               q[i]=0;
                                                                carry1=1;
                                                }
                                                if(a3[i]==3)
                                                {
                                                                a3[i]=1;
                                                                carry1=1;
                                                }
                                }             
                }
                void sub()
                {
                                carry=0;
                                for(int i=4;i>=0;i--)
                                {
                                                a[i]=m[i]+a[i]+carry;
                                                if(sum[i]==0)
                                                {
                                                                sum[i]=0;
                                                                carry=0;
                                                }
                                                if(sum[i]==1)
                                                {
                                                                sum[i]=1;
                                                                carry=0;
                                                }
                                                if(sum[i]==2)
                                                {
                                                                sum[i]=0;
                                                                carry=1;
                                                }
                                                if(sum[i]==3)
                                                {
                                                                sum[i]=1;
                                                                carry=1;
                                                }
                                }
                }        

 }

class Signed
{ 
   public static void main(String args[])throws IOException
    {
	BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

	int c=0;
	Multiply t=new Multiply();
	for(int j=0;j<4;j++)
	 {
                 if(a[0]==1)
	          {
		     c=1;
	   	    if((q[3]==0&&q[4]==0)||(q[3]==1&&q[4]==1))
	 	      {
	   	 	 t.shift();
	 	      }
	  	    else
 	   	      {
			if(q[3]==0&&q[4]==1)
			{
              	 		t.add();
	      	                t.shift();
			}
			if(q[3]==1&&q[4]==0)
			{
				t.comp();
		 	 	t.sub();
		 	 	t.add();
		 	 	t.shift();
			}
		     }
	         }
	   else
	   {
		c=0;
		if((q[3]==0&&q[4]==0)||(q[3]==1&&q[4]==1))
	 	  {
	   	 	 t.shift();
	 	  }
	  	 else
 	   	{
			if(q[3]==0&&q[4]==1)
			{
              	 		t.add();
	      	                t.shift();
			}
			if(q[3]==1&&q[4]==0)
			{
				t.comp();
		 	 	t.sub();
		 	 	t.add();
		 	 	t.shift();
			}
		}
	    }
		for(i=0;i<4;i++)
		 {
		   System.out.print(a[i]+"\t  ");
		  }
		for(i=0;i<4;i++)
		 {
		   System.out.print(q[i]+"\t\t\t ");
		  }     
	 }
    		System.out.println("multiplication==");
		for(i=0;i<4;i++)
		 {
		   System.out.print(a[i]);
		  }
		for(i=0;i<4;i++)
		 {
		   System.out.print(q[i]);
		 }     
	 }
}










