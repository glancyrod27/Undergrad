/*
Experiment : 10
Aim : To implement Graph Coloring.
*/

import java.io.* ;

class GraphColoring
{
	int r = 0 ;
	void GraphColoringAlgorithm( int k , int x[] , int G[][] , int n , int m )
	{
		while( true )
		{
			nextValue( k , x , G , n , m ) ;
			if( x[k]==0 )
			{
				return ;
			}
			if( k==n )
			{
				r++ ;
				System.out.println("\nThe Solution " + r + " is : ") ;
				for( int i=1 ; i<=n ; i++ )
				{
					System.out.print( x[i] + "\t" ) ;
				}
				System.out.println() ;
			}
			else
			{
				GraphColoringAlgorithm( (k + 1) , x , G , n , m ) ;
			}
		}
	}
	void nextValue( int k , int x[] , int G[][] , int n , int m )
	{
		int j ;
		while( true )
		{
			x[k] = (x[k]+1)%(m+1) ;
			if( x[k]==0 )
			{
				return ;
			}
			for( j=1 ; j<=n ; j++ )
			{
				if( (G[k][j] != 0) && (x[k]==x[j]) )
				{
					break ;
				}
			}
			if( j==n+1 )
			{
				return ;
			}
		}
	}
}

class Expt10
{
	public static void main( String arg[] ) throws IOException
	{
		int n , t  ;
		String q = new String() ;
		String s = new String("Y") ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter the Total no. of Nodes : ") ;
		n = Integer.parseInt(br.readLine()) ;
		int G[][] = new int[n+1][n+1] ;
		int x[] = new int[n+1] ;
		for( int i=1 ; i<=n ; i++ )
		{
			System.out.println("Is Node " + i + " connected to any Node..?(Y/N) ") ;
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
					t = Integer.parseInt(br.readLine()) ;
					G[i][t] = 1 ;
					G[t][i] = 1 ;
					System.out.println("Is Node " + i + " connected to any other Node..? ") ;
					q = br.readLine() ;
				}
				while( q.equalsIgnoreCase(s) ) ;
			}
		}
		System.out.println("Enter Total number of Colors : ") ;
		int m = Integer.parseInt( br.readLine() ) ;
		GraphColoring gc = new GraphColoring() ;
		gc.GraphColoringAlgorithm( 1 , x , G , n , m ) ;
	}
}



/*
OUTPUT:


C:\Users\Jerry\Desktop>javac Expt10.java

C:\Users\Jerry\Desktop>java Expt10
Enter the Total no. of Nodes :
5
Is Node 1 connected to any Node..?(Y/N)
y
Enter the Node that is Connected to 1
2
Is Node 1 connected to any other Node..?
y
Enter the Node that is Connected to 1
3
Is Node 1 connected to any other Node..?
y
Enter the Node that is Connected to 1
4
Is Node 1 connected to any other Node..?
n
Is Node 2 connected to any Node..?(Y/N)
y
Enter the Node that is Connected to 2
3
Is Node 2 connected to any other Node..?
y
Enter the Node that is Connected to 2
4
Is Node 2 connected to any other Node..?
n
Is Node 3 connected to any Node..?(Y/N)
y
Enter the Node that is Connected to 3
5
Is Node 3 connected to any other Node..?
n
Is Node 4 connected to any Node..?(Y/N)
y
Enter the Node that is Connected to 4
5
Is Node 4 connected to any other Node..?
n
Is Node 5 connected to any Node..?(Y/N)
n
Enter Total number of Colors :
3

The Solution 1 is :
1       2       3       3       1

The Solution 2 is :
1       2       3       3       2

The Solution 3 is :
1       3       2       2       1

The Solution 4 is :
1       3       2       2       3

The Solution 5 is :
2       1       3       3       1

The Solution 6 is :
2       1       3       3       2

The Solution 7 is :
2       3       1       1       2

The Solution 8 is :
2       3       1       1       3

The Solution 9 is :
3       1       2       2       1

The Solution 10 is :
3       1       2       2       3

The Solution 11 is :
3       2       1       1       2

The Solution 12 is :
3       2       1       1       3

C:\Users\Jerry\Desktop>

*/