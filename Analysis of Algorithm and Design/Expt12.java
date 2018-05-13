

import java.util.*;

class Expt12
{
	static List<Character> c = new ArrayList<Character>();
	static List<Integer> L = new ArrayList<Integer>();
	
	static void lastOccurence(String P)
	{
		int i;
		int m=P.length();
				
		for(i=m-1;i>=0;i--)
		{
			if( !c.contains( P.charAt(i) ) )
			{
				c.add( P.charAt(i) );
				L.add(i);		
			}
		}	
	}
	
	static int last(char ch)
	{
		if( c.contains(ch) )
			return L.get( c.indexOf(ch) );
		else
			return -1;
	}
	
	static int BoyerMooreMatch(String T,String P)
	{
		int n,m,i,j,l;
					
		n=T.length();
		m=P.length();
		
		lastOccurence(P);
		
		i=m-1;
		j=m-1;
		
		do
		{
			if(T.charAt(i)==P.charAt(j))
			{
				if(j==0)
					return i;	// match at i
				else
				{
					i=i-1;
					j=j-1;
				}
			}
			else				//character-jump
			{
				l=last(T.charAt(i));
				i=i + m - Math.min(j,l+1);
				j=m-1;
			}
		}while(i<n-1);
		
		return -1;				// no match
	}	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String T,P;
		
		System.out.println("Enter a String:");
		T=sc.nextLine();
		System.out.println("\nEnter a Pattern:");
		P=sc.nextLine();
		
		if(BoyerMooreMatch(T,P) == -1)
			System.out.println("\nThere is no substring of \""+T+"\" matching \""+P+"\"");
		else
			System.out.println("\nStarting index of a substring of \""+T+"\" equal to \""+P+"\" is : "+BoyerMooreMatch(T,P));
	}
}

/*
OUTPUT 1:

Enter a String:
The quick brown fox jumps over the lazy dog

Enter a Pattern:
brown fox

Starting index of a substring of "The quick brown fox jumps over the lazy dog" equal to "brown fox" is : 10

------------------------------------------------------------

OUTPUT 2:

Enter a String:
The quick brown fox jumps over the lazy dog

Enter a Pattern:
black dog

There is no substring of "The quick brown fox jumps over the lazy dog" matching "black dog"
*/

