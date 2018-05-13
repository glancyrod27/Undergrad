import java.util.*;
import java.io.*;
class Func
{
	void display(int a[],int j)
	{
		for(;j>=0;j--)
		{
			System.out.print(a[j]);
		}

		System.out.println();
	}

	void add(int ans1[], int ans2[], int len)
	{
		int carry=0;
		int sum[]=new int[len+1];
		for(int m=0;m<=len;m++)
		{
			if(ans1[m]+ans2[m]+carry==1)
			{
				sum[m]=1;
			}
			if(ans1[m]+ans2[m]+carry==0)
			{
				sum[m]=0;
			}
			if(ans1[m]+ans2[m]+carry==3)
			{
				sum[m]=1;
				carry=1;
			}
			if(ans1[m]+ans2[m]+carry==2)
			{
				sum[m]=0;
				carry=1;
			}
		}
		
		System.out.print("Addition: ");
		display(sum,len);
	}

	void sub(int ans1[], int ans2[], int len)
	{
		int borrow=0;
		int sub[]=new int[len+1];
		for(int m=0;m<=len;m++)
		{
			if(ans1[m]-ans2[m]-borrow==1)
			{
				sub[m]=1;
				borrow=0;
			}
			if(ans1[m]-ans2[m]-borrow==0)
			{
				sub[m]=0;
				borrow=0;
			}
			if(ans1[m]-ans2[m]-borrow==-1)
			{
				sub[m]=1;
				borrow=1;
			}
		}

		System.out.print("Subtraction: ");
		display(sub,len);
	}

	void andop(int ans1[], int ans2[], int len)
	{
		int and[]=new int[len+1];
		for(int m=0;m<=len;m++)
		{
			and[m]=ans1[m]&ans2[m];
		}

		System.out.print("AND OPERATOR: ");
		display(and,len);
	}

	void orop(int ans1[], int ans2[], int len)
	{
		int or[]=new int[len+1];
		for(int m=0;m<=len;m++)
		{
			or[m]=ans1[m]|ans2[m];
		}

		System.out.print("OR OPERATOR: ");
		display(or,len);
	}
	
	void not(int ans1[], int len)
	{
		int not[]=new int[len+1];
		for(int m=0;m<=len;m++)
		{	
			if(ans1[m]==1)
			not[m]=0;
			else
			not[m]=1;
		}

		System.out.print("NOT OPERATOR: ");
		display(not,len);
	}

	void exorop(int ans1[], int ans2[], int len)
	{
		int exor[]=new int[len+1];
		for(int m=0;m<=len;m++)
		{
			if(ans1[m]+ans2[m]==1)
			exor[m]=1;
			else
			exor[m]=0;
		}

		System.out.print("EX-OR OPERATOR: ");
		display(exor,len);
	}
	
}
class Add
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ans1[]=new int[20];
		int ans2[]=new int[20];
		System.out.println("Enter 2 numbers");
		int no1=Integer.parseInt(br.readLine());
		int no2=Integer.parseInt(br.readLine());

		int i=0;
		while(no1>0)
		{
			ans1[i]=no1%2;
			no1=no1/2;
			i++;
		}
		
		int j=0;
		while(no2>0)
		{
			ans2[j]=no2%2;
			no2=no2/2;
			j++;
		}

		Func ob=new Func();
		System.out.println("The 2 numbers in binary form: ");
		ob.display(ans1,i);
		ob.display(ans2,j);
		
		int len;
		if(i>j)
		len=i;
		else
		len=j;

		ob.add(ans1, ans2, len);		// Addition Function Call	

		ob.sub(ans1, ans2, len); 		// Subtraction Function Call

		ob.andop(ans1, ans2, len);		// OR Operator Function Call

		ob.orop(ans1, ans2, len);		// AND Operator Function Call
	
		ob.not(ans1, len);			// NOT Operator Function Call

		ob.exorop(ans1, ans2, len);		// EX-OR Operator Function Call
	}
}
OUTPUT:

Enter 2 numbers
15
11
The 2 numbers in binary f
01111
01011
Addition: 11010
Subtraction: 00100
AND OPERATOR: 01011
OR OPERATOR: 01111
NOT OPERATOR: 10000
EX-OR OPERATOR: 00100		