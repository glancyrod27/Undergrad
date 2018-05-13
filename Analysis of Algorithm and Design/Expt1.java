import java.io.* ;
class BinarySearch
{
	int low , high , mid ;
	int recursive( int arr[] , int target , int low , int high )
	{
		mid = (low+high)/2 ;
		if(low<=high)
		{
			if(arr[mid]==target)
			{
				System.out.println("Element Found at " + (mid+1) ) ;
				return 0;
			}
			else 
			{
				if(arr[mid]>target)
				{
					return recursive(arr,target,low, mid-1);
				}
				if(arr[mid]<target)
				{
					return recursive(arr, target, mid+1, high) ;
				}
			}	
		}
		return -1 ;	
		
	}
	void nonrecursive(int arr[] , int target , int low , int high )
	{
		
		while(low<=high)
		{
			mid = (low+high)/2 ;
			if(arr[mid]==target)
			{
				System.out.println("Element Found at " + (mid+1) ) ;
				break ;
			}
			else
			{
				if(arr[mid]<target)
				{
					low = mid + 1 ;
				}
				else
				{
					if(arr[mid]>target)
					{
						high = mid - 1 ;	
					}
				}
			}
		}
		if(low>high)
		{
			System.out.println("Element not Found ") ;
		}
	}
}	
class Expt1
{
	public static void main(String arg[]) throws IOException
	{
		int n , key , x ;
		String d ;
		String c = new String("y") ;
		BinarySearch bs = new BinarySearch() ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter the Total Number of Elements : ") ;
		n = Integer.parseInt(br.readLine()) ;
		int a[] = new int[n] ;
		System.out.println("Enter the Numbers in Sorted Order : ") ;
		for(int i=0 ; i<n ; i++)
		{
			a[i] = Integer.parseInt(br.readLine()) ;
		}
		do
		{
			System.out.print("Enter the number you want to Search...: ") ;
			System.out.println() ;
			key = Integer.parseInt(br.readLine()) ;
			System.out.println("Menu : \n 1.Recursive Binary Search\n 2.Non-Recursive Binary Search") ;
			System.out.print("Enter Your Choise : ") ;
			x = Integer.parseInt(br.readLine()) ;
			switch(x)
			{
				case 1 :
				{
					int k = bs.recursive(a,key, 0, n-1) ;
					if(k==-1)
					System.out.println("Element not Found");
					break ;
				}
				case 2 : 
				{
					bs.nonrecursive(a,key,0,n-1) ;
					break ;
				}
				default :
				{
					System.out.println("Invalid Choise") ;
				}
			}
			System.out.print("Do you want to Continue ? (Y/N) : ") ;
			d = br.readLine() ;
		}
		while(d.equalsIgnoreCase(c)) ;
	}
}

Output :
C:\Users\Aldrin\Documents\SECMPN_aoad>javac Expt1.java

C:\Users\Aldrin\Documents\SECMPN_aoad>java Expt1
Enter the Total Number of Elements : 5
Enter the Numbers in Sorted Order :
25
32
36
46
55
Enter the number you want to Search...:
46
Menu :
 1.Recursive Binary Search
 2.Non-Recursive Binary Search
Enter Your Choise : 1
Element Found at 4
Do you want to Continue ? (Y/N) : y
Enter the number you want to Search...:
36
Menu :
 1.Recursive Binary Search
 2.Non-Recursive Binary Search
Enter Your Choise : 2
Element Found at 3
Do you want to Continue ? (Y/N) : y
Enter the number you want to Search...:
10
Menu :
 1.Recursive Binary Search
 2.Non-Recursive Binary Search
Enter Your Choise : 1
Element not Found
Do you want to Continue ? (Y/N) : y
Enter the number you want to Search...:
70
Menu :
 1.Recursive Binary Search
 2.Non-Recursive Binary Search
Enter Your Choise : 2
Element not Found
Do you want to Continue ? (Y/N) : y
Enter the number you want to Search...:
25
Menu :
 1.Recursive Binary Search
 2.Non-Recursive Binary Search
Enter Your Choise : 3
Invalid Choise
Do you want to Continue ? (Y/N) : y
Enter the number you want to Search...:
55
Menu :
 1.Recursive Binary Search
 2.Non-Recursive Binary Search
Enter Your Choise : 2
Element Found at 5
Do you want to Continue ? (Y/N) : n

C:\Users\Aldrin\Documents\SECMPN_aoad>