/*
Experiment No. : 09
Aim : To Implement NQueens problem.
*/
 
import java.io.* ;

class NQueen
{
	int r = 0 ;
	void NQueensAlgorithm( int k , int n , int x[] )
	{
		for( int i=0 ; i<n ; i++ )
		{
			if( place( k , i , x ) )
			{
				x[k] = i ;
				if( k==(n-1) )
				{
					r++ ;
					System.out.println( (r) + "  : ") ;
					for( int p=0 ; p<n ; p++ )
					{
						System.out.print( (x[p]+1) + "\t" ) ;
					}
					System.out.println() ;	
				}
				else
				{
					NQueensAlgorithm( (k+1) , n , x ) ;
				}
			}
		}	
	}
	
	boolean place( int k , int i , int x[] )
	{
		for( int j=0 ; j<k ; j++ )
		{
			if( x[j]==i || Math.abs(x[j]-i)==Math.abs(j-k) )
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
		int n , k = 0 ;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) ) ;
		System.out.println("Enter the size of the ChessBoard. : ") ;
		n = Integer.parseInt(br.readLine()) ;
		int x[] = new int[n] ;
		for( int i=0 ; i<n ; i++ )
		{
			x[i] = 1000 ;
		}
		System.out.println("Solution is : ") ;
		NQueen nq = new NQueen() ;
		nq.NQueensAlgorithm( k , n , x ) ;
	}
}




/*

Output :

C:\Users>javac Expt9.java

C:\Users>java Expt9
Enter the size of the ChessBoard. :
2
Solution is :

C:\Users>java Expt9
Enter the size of the ChessBoard. :
3
Solution is :

C:\Users>java Expt9
Enter the size of the ChessBoard. :
4
Solution is :
1  :
2       4       1       3
2  :
3       1       4       2

C:\Users>java Expt9
Enter the size of the ChessBoard. :
8
Solution is :
1  :
1       5       8       6       3       7       2       4
2  :
1       6       8       3       7       4       2       5
3  :
1       7       4       6       8       2       5       3
4  :
1       7       5       8       2       4       6       3
5  :
2       4       6       8       3       1       7       5
6  :
2       5       7       1       3       8       6       4
7  :
2       5       7       4       1       8       6       3
8  :
2       6       1       7       4       8       3       5
9  :
2       6       8       3       1       4       7       5
10  :
2       7       3       6       8       5       1       4
11  :
2       7       5       8       1       4       6       3
12  :
2       8       6       1       3       5       7       4
13  :
3       1       7       5       8       2       4       6
14  :
3       5       2       8       1       7       4       6
15  :
3       5       2       8       6       4       7       1
16  :
3       5       7       1       4       2       8       6
17  :
3       5       8       4       1       7       2       6
18  :
3       6       2       5       8       1       7       4
19  :
3       6       2       7       1       4       8       5
20  :
3       6       2       7       5       1       8       4
21  :
3       6       4       1       8       5       7       2
22  :
3       6       4       2       8       5       7       1
23  :
3       6       8       1       4       7       5       2
24  :
3       6       8       1       5       7       2       4
25  :
3       6       8       2       4       1       7       5
26  :
3       7       2       8       5       1       4       6
27  :
3       7       2       8       6       4       1       5
28  :
3       8       4       7       1       6       2       5
29  :
4       1       5       8       2       7       3       6
30  :
4       1       5       8       6       3       7       2
31  :
4       2       5       8       6       1       3       7
32  :
4       2       7       3       6       8       1       5
33  :
4       2       7       3       6       8       5       1
34  :
4       2       7       5       1       8       6       3
35  :
4       2       8       5       7       1       3       6
36  :
4       2       8       6       1       3       5       7
37  :
4       6       1       5       2       8       3       7
38  :
4       6       8       2       7       1       3       5
39  :
4       6       8       3       1       7       5       2
40  :
4       7       1       8       5       2       6       3
41  :
4       7       3       8       2       5       1       6
42  :
4       7       5       2       6       1       3       8
43  :
4       7       5       3       1       6       8       2
44  :
4       8       1       3       6       2       7       5
45  :
4       8       1       5       7       2       6       3
46  :
4       8       5       3       1       7       2       6
47  :
5       1       4       6       8       2       7       3
48  :
5       1       8       4       2       7       3       6
49  :
5       1       8       6       3       7       2       4
50  :
5       2       4       6       8       3       1       7
51  :
5       2       4       7       3       8       6       1
52  :
5       2       6       1       7       4       8       3
53  :
5       2       8       1       4       7       3       6
54  :
5       3       1       6       8       2       4       7
55  :
5       3       1       7       2       8       6       4
56  :
5       3       8       4       7       1       6       2
57  :
5       7       1       3       8       6       4       2
58  :
5       7       1       4       2       8       6       3
59  :
5       7       2       4       8       1       3       6
60  :
5       7       2       6       3       1       4       8
61  :
5       7       2       6       3       1       8       4
62  :
5       7       4       1       3       8       6       2
63  :
5       8       4       1       3       6       2       7
64  :
5       8       4       1       7       2       6       3
65  :
6       1       5       2       8       3       7       4
66  :
6       2       7       1       3       5       8       4
67  :
6       2       7       1       4       8       5       3
68  :
6       3       1       7       5       8       2       4
69  :
6       3       1       8       4       2       7       5
70  :
6       3       1       8       5       2       4       7
71  :
6       3       5       7       1       4       2       8
72  :
6       3       5       8       1       4       2       7
73  :
6       3       7       2       4       8       1       5
74  :
6       3       7       2       8       5       1       4
75  :
6       3       7       4       1       8       2       5
76  :
6       4       1       5       8       2       7       3
77  :
6       4       2       8       5       7       1       3
78  :
6       4       7       1       3       5       2       8
79  :
6       4       7       1       8       2       5       3
80  :
6       8       2       4       1       7       5       3
81  :
7       1       3       8       6       4       2       5
82  :
7       2       4       1       8       5       3       6
83  :
7       2       6       3       1       4       8       5
84  :
7       3       1       6       8       5       2       4
85  :
7       3       8       2       5       1       6       4
86  :
7       4       2       5       8       1       3       6
87  :
7       4       2       8       6       1       3       5
88  :
7       5       3       1       6       8       2       4
89  :
8       2       4       1       7       5       3       6
90  :
8       2       5       3       1       7       4       6
91  :
8       3       1       6       2       5       7       4
92  :
8       4       1       3       6       2       7       5

C:\Users>

*/