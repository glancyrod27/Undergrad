import java.io.* ;

class BruteForce
{
	void BFAlgorithm( String T , String P ) 
	{
		int n , m , j ;
		n = T.length() ;
		m = P.length() ;
		for( int i=0 ; i <= (n-m) ; i++ )
		{
			j = 0 ;
			while( (j<m) && ( T.charAt(i+j) == P.charAt(j) ) )
			{
				j = j + 1 ;
			}
			if( j==m )
			{	
				System.out.println(" Pattern matched starting from position : " + ( i + 1 ) ) ;
				return ;
			}
		}
		System.out.println(" Sorry....!!!! Pattern requested was NOT Found....!!!!");
	}
}

class Expt11
{	
	public static void main( String args[] ) throws IOException
	{
		String T = new String() ;
		String P = new String() ;	
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) ) ;
		System.out.println(" Enter the Text : ") ;
		T = br.readLine() ;
		System.out.println(" Enter the Pattern : ") ;
		P = br.readLine() ;
	
		BruteForce bf = new BruteForce() ;
		bf.BFAlgorithm( T , P ) ;
	}
}

/*
Output : 
C:\Users\Aldrin\Documents\SECMPN_AOAD>javac Expt11.java

C:\Users\Aldrin\Documents\SECMPN_AOAD>java Expt11
 Enter the Text :
Brute Force Pattern Matching Algorithm
 Enter the Pattern :
ern M
 Pattern matched starting from position : 17

C:\Users\Aldrin\Documents\SECMPN_AOAD>java Expt11
 Enter the Text :
werty
 Enter the Pattern :
uyt
 Sorry....!!!! Pattern requested was NOT Found....!!!!

C:\Users\Aldrin\Documents\SECMPN_AOAD>

*/