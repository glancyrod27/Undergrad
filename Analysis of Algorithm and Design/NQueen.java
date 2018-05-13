/* N-Queen problem using backtracking.*/

import java.io.*;
class NQueen
{  
    public static void main(String args[])throws IOException
    {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n,i;
	int Q[]=new int[20];
	System.out.print("Enter the number of Queens :  ");
	
	n=Integer.parseInt(br.readLine());
	System.out.println();
	NQueen(Q,0,n);
    }
     static void NQueen(int Q[],int k,int n) 
    {
	int i,j;
	for(i=0;i<n;i++)
	{
	      Q[k]=i;
	      if(AddQueen(Q,k)==1)
	      {
	             if(k==n-1)
	             {
		   for(j=0;j<n;j++)
		        System.out.println(Q[j]);
	               	   System.out.println(""); 
	             }	
	             else
		   NQueen(Q,k+1,n);	
	      }
	}
    }
    static int AddQueen(int Q[],int k)
    {
	int i;
	for(i=0;i<k;i++)
	{   
	      int t=Q[i]-Q[k];
 	      if(t>=0)
		t=t;
	      else
		t=-t;
	      int e=i-k;
	      if(e>=0)
		e=e;
	      else
	 	e=-e;	
	      if((Q[i]==Q[k]) || (t==e))
		return 0;
	}
	return 1;
    }  
}


/*  OUTPUT :
 C:\Program Files\Java\jdk1.5.0\bin>javac NQueen.java

C:\Program Files\Java\jdk1.5.0\bin>java NQueen
Enter the number of Queens :  5

Q[0] = 0
Q[1] = 2
Q[2] = 4
Q[3] = 1
Q[4] = 3

Q[0] = 0
Q[1] = 3
Q[2] = 1
Q[3] = 4
Q[4] = 2

Q[0] = 1
Q[1] = 3
Q[2] = 0
Q[3] = 2
Q[4] = 4

Q[0] = 1
Q[1] = 4
Q[2] = 2
Q[3] = 0
Q[4] = 3

Q[0] = 2
Q[1] = 0
Q[2] = 3
Q[3] = 1
Q[4] = 4

Q[0] = 2
Q[1] = 4
Q[2] = 1
Q[3] = 3
Q[4] = 0

Q[0] = 3
Q[1] = 0
Q[2] = 2
Q[3] = 4
Q[4] = 1

Q[0] = 3
Q[1] = 1
Q[2] = 4
Q[3] = 2
Q[4] = 0

Q[0] = 4
Q[1] = 1
Q[2] = 3
Q[3] = 0
Q[4] = 2

Q[0] = 4
Q[1] = 2
Q[2] = 0
Q[3] = 3
Q[4] = 1

*/
