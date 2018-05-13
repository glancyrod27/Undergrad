/*
Aldrin Louis Rodrigues
SE CMPN  Roll No. : 04  Batch : 01
Aim : To Implement Radix Sort And Selection Sort
*/

import java.io.*;
class SelectionSort
{
	void Selection_sort( int p[] , int n )
	{	
		for( int i=0 ; i<=(n-2) ; i++ )
		{
			int k = i ;
			for( int j=(i+1) ; j<=(n-1) ; j++ )
			{
				if( p[j]<p[k] )
				{
					k = j ;
				}
			}
			if( k!=i )
			{
				p[i] = p[i] + p[k] ;
				p[k] = p[i] - p[k] ;
				p[i] = p[i] - p[k] ;
			}
		}
	}
	void display( int p[] , int n )
	{ 
		System.out.println("Sorted array of Selection sort is as follows : ") ;
		for( int k=0 ; k<n ; k++ )
		{
			System.out.println(p[k]) ;
		}
	}
}

class RadixSort
{
	int Q[][] = new int [10][100] ;
	int front[] = new int[10] ;
	int rear[] = new int[10] ;
	
	void insert( int x , int e )
	{
		rear[x] = rear[x] + 1 ;
		Q[x][rear[x]] = e ;
	}

	int pop( int x )
	{
		if(front[x]<rear[x])
		{
			front[x] = front[x] + 1 ;	
			return Q[x][front[x]] ;
		}
		else
		{
			return 0 ;
		}
	}	
	
	boolean isEmpty( int x )
	{
		if( front[x]<rear[x] )
		{
			return false ;
		}
		else
		{
			front[x] = 0 ;
			rear[x] = 0 ;
			return true ;
		}
	}
	void radix( int A[] , int n )
	{
		int p[] = new int[n] ;
		for( int h=0 ; h<5 ; h++ )
		{
			for( int i=0 ; i<n ; i++ )
			{
				p[i] = A[i] ;
			}
			for( int i=0 ; i<n ; i++ )
			{
				p[i] = p[i]/(int)(Math.pow(10,h)) ;
				int y = p[i] % 10 ;
				insert( y , A[i] ) ;
			}
			int k = 0 ;
			for( int i=0 ; i<10 ; i++ )
			{
				while( !isEmpty(i) )
				{
					A[k] = pop(i) ;
					k++ ;
				}
			}
		}
	}

	void display( int A[] , int n )
	{
		System.out.println("The Sorted Array is : ") ;
		for( int i=0 ; i<n ; i++ )
		{
			System.out.println( A[i] ) ;
		}
	}		
}
	 			
class Expt3
{
	public static void main( String arg[] ) throws IOException
	{
		int n ;
		String s = new String("y") ;
		String w ;
		SelectionSort ss = new SelectionSort() ;
		RadixSort rs = new RadixSort() ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter Total Number of Elements :") ;
		n = Integer.parseInt(br.readLine()) ;
		int p[]= new int [n] ;
		int A[]= new int [n] ;
		System.out.println("Enter Elements : ") ;
		for( int i=0 ; i<n ; i++ )
		{
			A[i] = p[i] = Integer.parseInt(br.readLine()) ;
		}
		do
		{
			System.out.println("Menu :\n1.Selection Sort \n2.Radix Sort \nEnter your Choice : ") ;
			int c = Integer.parseInt(br.readLine()) ;
			switch( c )
			{
				case 1 : 
				{
					ss.Selection_sort( p , n ) ;
					ss.display( p , n ) ;
					break ;
				}
				case 2 :
				{
					rs.radix( A , n ) ;
					rs.display( A , n ) ;
					break ;
				}
				default :
				{
					System.out.println("Invalid.... ") ;
				}
			}
			System.out.println("Do you want to Continue....???(Y/N) : ") ;
			w = br.readLine() ;
		}
		while( w.equalsIgnoreCase(s) ) ;
	}
}

/*
Output : 

C:\Users\Aldrin\Documents\SECMPN_AOAD>javac Expt3.java

C:\Users\Aldrin\Documents\SECMPN_AOAD>java Expt3
Enter Total Number of Elements :
10
Enter Elements :
5678
334
2880
1
99
35
222
6
117
903
Menu :
1.Selection Sort
2.Radix Sort
Enter your Choice :
1
Sorted array of Selection sort is as follows :
1
6
35
99
117
222
334
903
2880
5678
Do you want to Continue....???(Y/N) :
y
Menu :
1.Selection Sort
2.Radix Sort
Enter your Choice :
2
The Sorted Array is :
1
6
35
99
117
222
334
903
2880
5678
Do you want to Continue....???(Y/N) :
y
Menu :
1.Selection Sort
2.Radix Sort
Enter your Choice :
3
Invalid....
Do you want to Continue....???(Y/N) :
n

C:\Users\Aldrin\Documents\SECMPN_AOAD>
*/