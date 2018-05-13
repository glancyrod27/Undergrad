
import java.util.*;
class Page
{
	char a[];
	char frame[][];
	int hit=0;
	Scanner sc=new Scanner(System.in);
	void insert(int n)
	{
		 a=new char[n];
  	   	frame=new char[3][n];
     		System.out.println("Enter the page sequence");
     		String s=sc.next();
     		for(int i=0;i<n;i++)
        		a[i]=s.charAt(i);
	}
	void fifo(int n)
	{
		  int f1=0,f2=0,f3=0;
		   frame[0][0]=a[0];
                           f1++;
 		   frame[1][0]='-';
   	 	   frame[2][0]='-';
    		for(int i=1;i<n;i++)
		{
			  if((frame[1][i-1])== '-')
			{

 				 frame[0][i]=frame[0][i-1];
					f1++;
   				 frame[1][i]=a[i];
					f2++;
 				frame[2][i]=frame[2][i-1];
			}
                          else if((a[i]==frame[0][i-1])||(a[i]==frame[1][i-1])||(a[i]==frame[2][i-1]))
			{
				frame[0][i]=frame[0][i-1];
					f1++;
				    frame[1][i]=frame[1][i-1];
					f2++;
				 frame[2][i]=frame[2][i-1];
					f3++;
					hit++;
                     	}
			else if((frame[2][i-1]) == '-')
			{
				frame[0][i]=frame[0][i-1];
					f1++;
 				   frame[1][i]=frame[1][i-1];
					f2++;
				 frame[2][i]=a[i];
                                        f3++;
			}

			else if((a[i]==frame[0][i-1])||(a[i]==frame[1][i-1])||(a[i]==frame[2][i-1]))
			{
				frame[0][i]=frame[0][i-1];
					f1++;
				    frame[1][i]=frame[1][i-1];
					f2++;
				 frame[2][i]=frame[2][i-1];
					f3++;
					hit++;               
			}
			else
			{
				if((f1>f2)&&(f1>f3))
				{
					frame[0][i]=a[i];
					f1=0;
					frame[1][i]=frame[1][i-1];
					f2++;
 					frame[2][i]=frame[2][i-1];
					f3++;
				}
				else if((f2>f1)&&(f2>f3))
				{
					frame[0][i]=frame[0][i-1];
						f1++;
					frame[1][i]=a[i];
						f2=0;
 					frame[2][i]=frame[2][i-1];
						f3++;
				}
				else if((f3>f1)&&(f3>f2))
				{
					frame[0][i]=frame[0][i-1];
						f1++;
					frame[1][i]=frame[1][i-1];
						f2++;
 					frame[2][i]=a[i];
						f3=0;
				}
			}
		}
	}
	void display(int n)
	{
		System.out.println();
		for(int i=0;i<n;i++)
		System.out.print(a[i]+"\t");
		System.out.println();
		for(int i=0;i<n;i++)
		System.out.print("---------");
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(frame[i][j]+"\t");

			}
			System.out.println();
		}
		System.out.println("No. of hits="+hit);
		System.out.println("No. of miss="+(n-hit));
		System.out.println("No.page faults=" +(n-hit));
	}
}
public class Fifo
{

     public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		Page p=new Page();
		System.out.println("enter no of pages");
		int n=sc.nextInt();
			p.insert(n);
			p.fifo(n);
			p.display(n);
	}

}

/*
output:
enter no of pages
12
Enter the page sequence
232152453252

2        3        2        1        5        2        4        5        3        2        5        2        
----------------------------------------------------------------------------------------------
2        2        2        2        5        5        5        5        3        3        3        3        
-        3        3        3        3        2         2        2        2        2        5        5        
-        -         -        1        1         1        4        4        4        4        4        2 
     
No. of hits=3
No. of miss=9
No.page faults=9
*/