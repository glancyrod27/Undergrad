import java.util.*;
 class Knapsack
{
  	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float p[];
		float w[];
		int i,j,k;
		float temp1,temp2,profit=0;
		float sum;
		float r[],temp;
		System.out.println("enter the no of jobs");
		int n=sc.nextInt();
		p=new float[n];
		r=new float[n];
		w=new float[n];
		System.out.println("enter the max wt");
		int max=sc.nextInt();
		System.out.println("enter the profit and weight");
		for(i=0;i<n;i++)
		{
			p[i]=sc.nextFloat();
			w[i]=sc.nextFloat();
		}
		System.out.println("ratio");
		for(j=0;j<n;j++)
		{
			r[j]=p[j]/w[j];
			System.out.print(r[j]+"\t"); 
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(r[j]<r[j+1])
				{
					temp=r[j];
					r[j]=r[j+1];
					r[j+1]=temp;
					temp1=p[j];
					p[j]=p[j+1];
					p[j+1]=temp1;
					temp2=w[j];
					w[j]=w[j+1];
					w[j+1]=temp2;
				}
			}
		}
		System.out.println();
		System.out.println("wt");
		for(i=0;i<n;i++)
		{
			System.out.print(w[i]+"\t");
		}
		System.out.println();
		System.out.println("profit");
		for(i=0;i<n;i++)
		{
			System.out.print(p[i]+"\t");
		}
		System.out.println();
		System.out.println("ratio");
		for(i=0;i<n;i++)
		{
			System.out.print(r[i]+"\t"); 
		}
		k=0;
		do
		{
			if(max>w[k])
			{
				profit+=p[k];
				max-=w[k];
				k++;
			}
			else
			{
				sum=(max*p[k])/w[k];
				max=0;
				profit+=sum;
				k++;
			}
		}
		while(max>0);
		System.out.println();
		System.out.println("profit="+profit);
	}
}

/*output:
E:\30_51>javac Knapsack.java
E:\30_51>java Knapsack
enter the no of jobs
7
enter the max wt
15
enter the profit and weight
10
2
5
3
15
5
7
7
6
1
18
4
3
1
ratio
5.0     1.6666666       3.0     1.0     6.0     4.5     3.0
wt
1.0     2.0     4.0     5.0     1.0     3.0     7.0
profit
6.0     10.0    18.0    15.0    3.0     5.0     7.0
ratio
6.0     5.0     4.5     3.0     3.0     1.6666666       1.0
profit=55.333332

E:\30_51>

*/


