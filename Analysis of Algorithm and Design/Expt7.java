/*
Aim : To Implement Knapsack Problem.
*/

import java.io.* ;

class Knapsack
{
	void knapsackAlgo( double c[] , double w[] , int m , double x[] , int n )
	{
		int i , j ;
		double profit = 0 ;
		double ratio[] = new double[n] ;
		for( i=0 ; i<n ; i++ )
		{
			ratio[i] = c[i]/w[i] ;	
		}
		for( i=0 ; i<n ; i++ )
		{
			for( j=0 ; j<(n-1) ; j++ )
			{
				if(ratio[j]<ratio[j+1])
				{
					double temp1 = c[j] ;
					c[j] = c[j+1] ;
					c[j+1] = temp1 ;
					double temp2 = w[j] ;
					w[j] = w[j+1] ;
					w[j+1] = temp2 ;
					double temp3 = ratio[j] ;
					ratio[j] = ratio[j+1] ;
					ratio[j+1] = temp3 ;
				}
			}
		}
		double RC = m ;
		for( i=0 ; i<n ; i++ )
		{
			if( w[i] > RC )
			{
				break ;
			}
			x[i] = 1 ;
			RC = RC - w[i] ;
		}
		if( i<n )
		{
			x[i] = RC/w[i] ;
		}
	
		for( i=0 ; i<n ; i++ )
		{
			profit = profit + c[i]*x[i] ;
			System.out.println("Fraction of Item of cost " + c[i]  + " and weight " + w[i] + " taken is " + x[i]*100 + " % ") ;
		}
		System.out.println("Maximum Profit : " + profit ) ;
	}
}
			
class Expt7
{
	public static void main(String arg[]) throws IOException
	{
		int m , n ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("Enter the Total Capacity of Knapsack :") ;
		m = Integer.parseInt(br.readLine()) ;
		System.out.println("Enter the Total number of Items : ") ;
		n = Integer.parseInt(br.readLine()) ;
		double c[] = new double[n] ;
		double w[] = new double[n] ;
		double x[] = new double[n] ;
		for(int i=0 ; i<n ; i++ )
		{
			System.out.print("Enter Cost of Item " + (i+1) + " ") ;
			c[i] = Double.parseDouble(br.readLine()) ;
			System.out.print("Enter Weight of Item " + (i+1) + " ") ;
			w[i] = Double.parseDouble(br.readLine()) ;
		}
		Knapsack knsk = new Knapsack() ;
		knsk.knapsackAlgo( c , w , m , x , n ) ;
	}
}

/*
Output : 
C:\Users>javac Expt7.java

C:\Users>java Expt7
Enter the Total Capacity of Knapsack :
25
Enter the Total number of Items :
3
Enter Cost of Item 1 25
Enter Weight of Item 1 16
Enter Cost of Item 2 24
Enter Weight of Item 2 14
Enter Cost of Item 3 17
Enter Weight of Item 3 9
Fraction of Item of cost 17.0 and weight 9.0 taken is 100.0 %
Fraction of Item of cost 24.0 and weight 14.0 taken is 100.0 %
Fraction of Item of cost 25.0 and weight 16.0 taken is 12.5 %
Maximum Profit : 44.125

C:\Users>
*/