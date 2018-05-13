/*
Aldrin Louis Rodrigues
SE CMPN  Roll No. : 04  Batch : 01
Experiment No. : 06
Aim : To Implement Djikstra's Algorithm .
*/

import java.io.* ;

class Djikstras
{
	void djikstrasAlgorithm( int A[][] , int r , int n )
	{
		int u , v ;
		int d[] = new int[n] ;
		int P[] = new int[n] ;
		int g[] = new int[n] ;
		int q[] = new int[n] ;
		for( int i=0 ; i<n ; i++ )
		{
			g[i] = 1000 ;
			d[i] = 1000 ;
			P[i] = 1000 ;
		}
		g[r-1] = 0 ;
		d[r-1] = 0 ;
		P[r-1] = 0 ;
		for( int i=0 ; i<n ; i++ )
		{
			q[i] = i ;
		}
		while(!isEmpty( q , n ))
		{
			u = extractmin( q , g , n ) ;
			for( int i=0 ; i<n ; i++ )
			{
				if( A[u][i] != 0 )
				{
					relax( u , i ,d , A , P , g ) ;
				}
			}	
		}
		System.out.println("Single Source Shortest path is : ") ;
		System.out.println("Distances : ") ;
		for( int i=0 ; i<n ; i++ )
		{
			System.out.print(d[i] + "\t") ;
		}
		System.out.println() ;
		System.out.println() ;
		System.out.println("Parents : ") ; 
		for( int i=0 ; i<n ; i++ )
		{
			System.out.print(P[i] + "\t") ;
		}
	}
	void relax( int u , int v , int d[] , int A[][] , int P[] , int g[] )
	{
		if( d[v] > (d[u] + A[u][v]) )
		{
			d[v] = d[u] + A[u][v] ;
			g[v] = d[v] ;
			P[v] = u+1 ;
		}
	}
	boolean isEmpty( int q[] , int n )
	{
		int m = 0 ;
		for( int i=0 ; i<n ; i++ )
		{
			if( q[i] == 1000 )
			{
				m = m + 1 ;
			}
		}
		if( m==(n-1) )
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}
	int extractmin( int q[] , int g[] , int n )
	{
		if( !isEmpty( q , n ) )
		{
			int min = g[0] ;
			int index = 0 ;
			for( int i=0 ; i<n ; i++ )
			{
				if( min>g[i] && g[i] != 1000 )
				{
					min = g[i] ;
					index = i ;
				}
			}
			g[index] = 1000 ;
			q[index] = 1000 ; 
			return index ;
		}
		else
		{
			return 0 ;
		}
	}
}

		
class Expt6
{
	public static void main( String arg[] ) throws IOException
	{
		int n , x , r , wt ;
		String q = new String() ;
		String s = new String("Y") ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter the Total no. of Nodes : ") ;
		n = Integer.parseInt(br.readLine()) ;
		int A[][] = new int[n][n] ;
		for( int i=0 ; i<n ; i++ )
		{
			System.out.println("Is there a path from " + (i+1) + " to any Node..?(Y/N) ") ;
			q = br.readLine() ;
			if( !q.equalsIgnoreCase(s) ) 
			{
				break ;
			}
			else
			{
				do
				{
					System.out.println("Enter the Node that is Connected to " + (i+1)) ;
					x = Integer.parseInt(br.readLine()) ;
					System.out.println("Enter the Weigth of the Path from " + (i+1) + " to " + x) ;
					wt = Integer.parseInt(br.readLine())  ;
					A[i][x-1] = wt ;
					System.out.println("Is Node " + (i+1) + " connected to any other Node..? ") ;
					q = br.readLine() ;
				}
				while( q.equalsIgnoreCase(s) ) ;
			}
		}
		System.out.println("Enter the Starting Node : ") ;
		r = Integer.parseInt(br.readLine()) ;
		Djikstras djks = new Djikstras() ;
		djks.djikstrasAlgorithm( A , r , n ) ;
	}
}

/*
Output : 

C:\Users\Aldrin\Documents\SECMPN_AOAD>javac Expt6.java

C:\Users\Aldrin\Documents\SECMPN_AOAD>java Expt6
Enter the Total no. of Nodes :
5
Is there a path from 1 to any Node..?(Y/N)
y
Enter the Node that is Connected to 1
2
Enter the Weigth of the Path from 1 to 2
2
Is Node 1 connected to any other Node..?
y
Enter the Node that is Connected to 1
3
Enter the Weigth of the Path from 1 to 3
3
Is Node 1 connected to any other Node..?
n
Is there a path from 2 to any Node..?(Y/N)
y
Enter the Node that is Connected to 2
1
Enter the Weigth of the Path from 2 to 1
5
Is Node 2 connected to any other Node..?
y
Enter the Node that is Connected to 2
4
Enter the Weigth of the Path from 2 to 4
7
Is Node 2 connected to any other Node..?
y
Enter the Node that is Connected to 2
5
Enter the Weigth of the Path from 2 to 5
4
Is Node 2 connected to any other Node..?
n
Is there a path from 3 to any Node..?(Y/N)
y
Enter the Node that is Connected to 3
1
Enter the Weigth of the Path from 3 to 1
7
Is Node 3 connected to any other Node..?
y
Enter the Node that is Connected to 3
2
Enter the Weigth of the Path from 3 to 2
3
Is Node 3 connected to any other Node..?
y
Enter the Node that is Connected to 3
4
Enter the Weigth of the Path from 3 to 4
6
Is Node 3 connected to any other Node..?
n
Is there a path from 4 to any Node..?(Y/N)
y
Enter the Node that is Connected to 4
3
Enter the Weigth of the Path from 4 to 3
1
Is Node 4 connected to any other Node..?
y
Enter the Node that is Connected to 4
5
Enter the Weigth of the Path from 4 to 5
5
Is Node 4 connected to any other Node..?
n
Is there a path from 5 to any Node..?(Y/N)
y
Enter the Node that is Connected to 5
4
Enter the Weigth of the Path from 5 to 4
4
Is Node 5 connected to any other Node..?
n
Enter the Starting Node :
3
Single Source Shortest path is :
Distances :
7       3       0       6       7

Parents :
3       3       0       3       2
C:\Users\Aldrin\Documents\SECMPN_AOAD>
*/