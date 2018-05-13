import java.util.*;
import java.math.*;
class Kmeans
{
	public static void main(String args[])
	{
  		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no of elements");
		int maxsiz =sc.nextInt();
		int a[] =new int[maxsiz];
		System.out.println("enter the elements");
  		for(int i=0;i<maxsiz;i++)
			a[i]=sc.nextInt();
  		
  		System.out.println("enter the no of clusters");
  		int k=sc.nextInt();
  		int count =0;
  		int d1[][]=new int[k][20];
		int z1=3;
		if(maxsiz<=10 && k==2)
		z1=5;
		if(maxsiz<=10 && k==3)
		z1=4;
		if(maxsiz>10 && k==2)
		z1=7;
		if(maxsiz>10 && k==3)
		z1=5;
		
   			
   		for(int j=0;j<k;j++ )
   		{		
			int pre = count;
			for(int i =0;i<20;i++ )
 			{	
				if (count==(pre+z1))
				{
					 break;	
				}	
				else
				{
					if(count < maxsiz )
					{
						d1[j][i] = a[count];
						count ++;
					}
				else 
					break;	
				}  	
			}
		  }
		for(int p=0;p<k;p++)
		{
			for(int f=0;f<20;f++)
			{
				  if(d1[p][f]!=0)
				  {
					  System.out.print(d1[p][f]+" ");
				  }
			}
			System.out.println();
		}
		int col[]=new int[k];
		float av1=0;
		int l=0;
		int p=0;
		int h=0;
		float avg[] = new float [k];
		float m1[]=new float[k];
		float ol[]=new float[k];
		for(int m= 0;m<k;m++)
		{
			av1 = 0;
  			for(int n=0;n<20;n++)
			{
  				if(d1[m][n]!=0)
  				{
  				  col[m]=col[m]+1;
  				}
  				av1 += d1[m][n]; 
   			}
			avg[m] = av1/col[m]; 	  	
		}
		for(int s=0;s<k;s++)
		{
 			 System.out.println("The Average of cluster"+ s+"  " + avg[s]+" ");
  			ol[s]=avg[s];
		}
		
		int so;
		do
		{
			so=0;

			for(int v=0;v<k;v++)
			{
				for(int g=0;g<20;g++)
				{
 					 d1[v][g]=0;
				}
			}
			int pos=0;
			int prev=0;
			int t=0;
			int d=0;
			for(int c=0;c<maxsiz;c++)
			{
				for(int q=0;q<k;q++)
				{
 					m1[q]=ol[q]-a[c];
 					if(m1[q]<0)
					{
  						m1[q]=-m1[q];
					}
				}
				float min=m1[0];
				for(int i=0;i<k;i++)
				{
   					if(min>=m1[i])
					{
     						min=m1[i];
      						pos=i;
       					}
					/*System.out.println("pos is"+pos);*/
				}
				d1[pos][d]=a[c];
				d++;
			}
			for(int y=0;y<k;y++)
			{
				for(int z=0;z<20;z++)
				{
					if(d1[y][z]!=0)
					{
					  System.out.print(d1[y][z]+" ");
					}
				}
				System.out.println();
			}
			float av2=0;	
			int l2=0;
			int p2=0;
			int h2=0;
			float avg2[] = new float [k];
			float col1[]=new float[k];
			for(int m3= 0;m3<k;m3++)
			{
  				av2 = 0;
				for(int n2=0;n2<20;n2++)
				{
  					if(d1[m3][n2]!=0)
					{
						  col1[m3]=col1[m3]+1;
					}
 					av2 += d1[m3][n2];  	
				}
					avg2[m3] = av2/col1[m3]; 	  	
			}
			for(int s2=0;s2<k;s2++)
			{
  				System.out.println("The Average of cluster"+ s2+"  " + avg2[s2]+" ");
				if(ol[s2]==avg2[s2])
				{
					so++;
				}
			}
			for(int s=0;s<k;s++)
			{
  				ol[s]=avg2[s];
			}
		}while(so!=k);
	}
}

/*Output:


D:\New folder (5)\Study\SEM 6\DWM\Pracs>javac Kmeans.java

D:\New folder (5)\Study\SEM 6\DWM\Pracs>java Kmeans
enter the no of elements
9
enter the elements
2
4
10
12
3
20
30
25
11
enter the no of clusters
2
2 4 10 12 3
20 30 25 11
The Average of cluster0  6.2
The Average of cluster1  21.5
2 4 10 12 3 11
20 30 25
The Average of cluster0  7.0
The Average of cluster1  25.0
2 4 10 12 3 11
20 30 25
The Average of cluster0  7.0
The Average of cluster1  25.0
*/

