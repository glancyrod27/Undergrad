import java.io.* ;

class Prims
{
	int Q[] = new int [100] ;
	int front = -1 , rear = -1 ;
	void primsAlgorithm( int A[][] , int r , int n )
	{
		int k = r ;
		int h = 0 ;
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
					if( q[i] != 1000 && d[i] > A[u][i] )
					{
						d[i] = A[u][i] ;
						g[i] = d[i] ;
						P[i] = u+1 ;
					}
				}
			}	
		}
		
		for( int i=0 ; i<n ; i++ )
		{
			q[i] = 0 ;
		}
		
		System.out.println("The solution is:");
		
		do
		{
			for( int i=0 ; i<n ; i++ )
			{	
				if( P[i] == k )
				{
					push( i+1 ) ;
				}
			}		
			sort() ;
			for( int i=front ; i<=rear ; i++ )
			{
				if( P[Q[i]-1] == k )
				{
					System.out.println( k + "-->" + Q[i] ) ;
					q[k-1] = 1000 ;
					q[Q[i]-1] = 1000 ;
				}
			}
			if( !QEmpty() )
			{
				k = remove() ;
			}
		}
		while( !isEmpty( q , n ) ) ;
	}
	void push( int x )
	{
		if( front<0 )
		{
			front = 0 ;
		}
		rear = rear + 1 ;
		Q[rear] = x ;
	}

	int remove()
	{
		int t = front ;
		front = front + 1 ;
		return( Q[t] ) ;
	}

	boolean QEmpty()
	{
		if( front>rear )
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}

	void sort()
	{
		for( int i=front ; i<rear ; i++ )
		{
			for( int j=front ; j<rear ; j++ )
			{
				if( Q[j]>Q[j+1] )
				{
					Q[j] = Q[j] + Q[j+1] ;
					Q[j+1] = Q[j] - Q[j+1] ;
					Q[j] = Q[j] - Q[j+1] ;
				}
			}
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
		if( m==n )
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

		
class Expt5
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
					A[x-1][i] = wt ;
					System.out.println("Is Node " + (i+1) + " connected to any other Node..? ") ;
					q = br.readLine() ;
				}
				while( q.equalsIgnoreCase(s) ) ;
			}
		}
		System.out.println("Enter the Starting Node : ") ;
		r = Integer.parseInt(br.readLine()) ;
		Prims pms = new Prims() ;
		pms.primsAlgorithm( A , r , n ) ;
	}
}

/*

OUTPUT :

C:\Users>javac Expt5.java

C:\Users>java Expt5
Enter the Total no. of Nodes :
9
Is there a path from 1 to any Node..?(Y/N)
y
Enter the Node that is Connected to 1
2
Enter the Weigth of the Path from 1 to 2
4
Is Node 1 connected to any other Node..?
y
Enter the Node that is Connected to 1
8
Enter the Weigth of the Path from 1 to 8
8
Is Node 1 connected to any other Node..?
n
Is there a path from 2 to any Node..?(Y/N)
y
Enter the Node that is Connected to 2
3
Enter the Weigth of the Path from 2 to 3
8
Is Node 2 connected to any other Node..?
y
Enter the Node that is Connected to 2
2
Enter the Weigth of the Path from 2 to 2
0
Is Node 2 connected to any other Node..?
y
Enter the Node that is Connected to 2
8
Enter the Weigth of the Path from 2 to 8
11
Is Node 2 connected to any other Node..?
n
Is there a path from 3 to any Node..?(Y/N)
y
Enter the Node that is Connected to 3
4
Enter the Weigth of the Path from 3 to 4
7
Is Node 3 connected to any other Node..?
y
Enter the Node that is Connected to 3
6
Enter the Weigth of the Path from 3 to 6
4
Is Node 3 connected to any other Node..?
y
Enter the Node that is Connected to 3
9
Enter the Weigth of the Path from 3 to 9
2
Is Node 3 connected to any other Node..?
n
Is there a path from 4 to any Node..?(Y/N)
y
Enter the Node that is Connected to 4
5
Enter the Weigth of the Path from 4 to 5
9
Is Node 4 connected to any other Node..?
y
Enter the Node that is Connected to 4
6
Enter the Weigth of the Path from 4 to 6
14
Is Node 4 connected to any other Node..?
n
Is there a path from 5 to any Node..?(Y/N)
y
Enter the Node that is Connected to 5
6
Enter the Weigth of the Path from 5 to 6
10
Is Node 5 connected to any other Node..?
n
Is there a path from 6 to any Node..?(Y/N)
y
Enter the Node that is Connected to 6
7
Enter the Weigth of the Path from 6 to 7
2
Is Node 6 connected to any other Node..?
n
Is there a path from 7 to any Node..?(Y/N)
y
Enter the Node that is Connected to 7
8
Enter the Weigth of the Path from 7 to 8
1
Is Node 7 connected to any other Node..?
y
Enter the Node that is Connected to 7
9
Enter the Weigth of the Path from 7 to 9
6
Is Node 7 connected to any other Node..?
n
Is there a path from 8 to any Node..?(Y/N)
y
Enter the Node that is Connected to 8
9
Enter the Weigth of the Path from 8 to 9
7
Is Node 8 connected to any other Node..?
n
Is there a path from 9 to any Node..?(Y/N)
n
Enter the Starting Node :
1
The solution is:

1-->2

2-->3

3-->4

3-->6

3-->9

4-->5

6-->7

7-->8

C:\Users>

*/



