import java.io.* ;

class NQueen
{
	void NQueensAlgorithm( int k , int n )
	{
		int x[] = new int[n] ;
		for( int i=0 ; i<n ; i++ )
		{
			if( place( k , i , x ) )
			{
				x[k] = i ;
				if( k==(n-1) )
				{
					System.out.println("The Solution is : ") ;
					for( int p=0 ; p<n ; p++ )
					{
						System.out.println( x[p] + "\t" ) ;
					}
						
				}
				else
				{
					NQueensAlgorithm( (k+1) , n ) ;
				}
			}
		}	
	}
	
	boolean place( int k , int i , int x[] )
	{
		for( int j=0 ; j<(k-1) ; j++ )
		{
			if( x[j]==1 || Math.abs(x[j]-i)==Math.abs(j-k) )
			{
				return false ;
			}
		}
		return true ;
	}
}
class Expt9
{
	public static void main( String arg[] ) throws IOException
	{
		int n , k = 1 ;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		System.out.println("Enter the size of the ChessBoard. : ") ;
		n = Integer.parseInt(br.readLine()) ;
		NQueen nq = new NQueen() ;
		nq.NQueensAlgorithm( k , n ) ;
	}
}