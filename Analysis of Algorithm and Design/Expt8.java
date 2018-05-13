
/*Aim : To Implement Floyd-Warshalls Algorithm.*/

import java.io.* ;

class AdjacencyMatrix
{
	int a[][] ;
	AdjacencyMatrix( int n )
	{
		a = new int [n][n] ;
	}
	int min( int x , int y )
	{
		if( x < y )
			return x ;
		else 
			return y ;
	}
}

		
class Expt8
{
	public static void main( String arg[] ) throws IOException
	{
		int n , x , r , wt ;
		String q = new String() ;
		String s = new String("Y") ;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;

		System.out.println("Enter the Total no. of Nodes : ") ;
		n = Integer.parseInt(br.readLine()) ;

		int P[][] = new int[n+1][n+1] ;
		
		AdjacencyMatrix am[] = new AdjacencyMatrix[n+1] ;
		for( int i=0 ; i<=n ; i++ )
		{
			am[i] = new AdjacencyMatrix( n+1 ) ;
		}

		for( int i=1 ; i<=n ; i++ )
		{
			System.out.println("Is there a path from " + (i) + " to any Node..?(Y/N) ") ;
			q = br.readLine() ;
			if( !q.equalsIgnoreCase(s) ) 
			{
				break ;
			}
			else
			{
				do
				{
					System.out.println("Enter the Node that is Connected to " + i) ;
					x = Integer.parseInt(br.readLine()) ;
					System.out.println("Enter the Weigth of the Path from " + i + " to " + x) ;
					wt = Integer.parseInt(br.readLine())  ;
					am[0].a[i][x] = wt ;
					P[i][x] = i ; 
					System.out.println("Is Node " + i + " connected to any other Node..? ") ;
					q = br.readLine() ;
				}
				while( q.equalsIgnoreCase(s) ) ;
			}
		}

		for( int i=1 ; i<=n ; i++ )
		{
			for( int j=1 ; j<=n ; j++ )
			{	
				if( ( am[0].a[i][j]==0 ) && ( i != j ) )
				{
					am[0].a[i][j] = 999 ;
				}
			}	
		}

		for( int k=1 ; k<=n ; k++ )
		{
			for( int i=1 ; i<=n ; i++ )
			{
				for( int j=1 ; j<=n ; j++ )
				{
					am[k].a[i][j] = am[k].min( am[k-1].a[i][j] , am[k-1].a[i][k] + am[k-1].a[k][j] ) ;
					if( am[k].a[i][j] == am[k-1].a[i][k] + am[k-1].a[k][j] && am[k].a[i][j]!=0 && k!=j)
					{
						P[i][j] = k ;                                        
					}
				}
			}
		}
		System.out.println("The Parent Matrix is: ") ;
		
		for( int i=1 ; i<=n ; i++ )
		{
			for( int j=1 ; j<=n ; j++ )
			{	
				System.out.print( P[i][j] + "\t" ) ;
			}
			System.out.println() ;	
		}


		System.out.println("The solution is : ") ;
		
		for( int i=1 ; i<=n ; i++ )
		{                             
			for( int j=1 ; j<=n ; j++ )
			{	
				System.out.print( am[5].a[i][j] + "\t" ) ;
			}
			System.out.println() ;	
		}
	}
}

/*
Output:



C:\Users>javac Expt8.java

C:\Users>java Expt8
Enter the Total no. of Nodes :
5
Is there a path from 1 to any Node..?(Y/N)
y
Enter the Node that is Connected to 1
2
Enter the Weigth of the Path from 1 to 2
3
Is Node 1 connected to any other Node..?
y
Enter the Node that is Connected to 1
3
Enter the Weigth of the Path from 1 to 3
8
Is Node 1 connected to any other Node..?
y
Enter the Node that is Connected to 1
5
Enter the Weigth of the Path from 1 to 5
-4
Is Node 1 connected to any other Node..?
n
Is there a path from 2 to any Node..?(Y/N)
y
Enter the Node that is Connected to 2
4
Enter the Weigth of the Path from 2 to 4
1
Is Node 2 connected to any other Node..?
y
Enter the Node that is Connected to 2
5
Enter the Weigth of the Path from 2 to 5
7
Is Node 2 connected to any other Node..?
n
Is there a path from 3 to any Node..?(Y/N)
y
Enter the Node that is Connected to 3
2
Enter the Weigth of the Path from 3 to 2
4
Is Node 3 connected to any other Node..?
n
Is there a path from 4 to any Node..?(Y/N)
y
Enter the Node that is Connected to 4
1
Enter the Weigth of the Path from 4 to 1
2
Is Node 4 connected to any other Node..?
y
Enter the Node that is Connected to 4
3
Enter the Weigth of the Path from 4 to 3
-5
Is Node 4 connected to any other Node..?
n
Is there a path from 5 to any Node..?(Y/N)
y
Enter the Node that is Connected to 5
4
Enter the Weigth of the Path from 5 to 4
6
Is Node 5 connected to any other Node..?
n
The Parent Matrix is:
0       3       8       999     -4
999     0       999     1       7
999     4       0       999     999
2       999     -5      0       999
999     999     999     6       0
The solution is:
0       1       -3      2       -4
3       0       -4      1       -1
7       4       0       5       3
2       -1      -5      0       -2
8       5       1       6       0

C:\Users>
*/


