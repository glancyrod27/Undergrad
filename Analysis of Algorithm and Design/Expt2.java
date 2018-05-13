import java.io.*;

class Merge_Sort
{
	
	void MergeSort(int a[],int low,int high,int n)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			MergeSort(a,low,mid,n);
			MergeSort(a,mid+1,high,n);			
			Merge(a,low,mid,high,n);
		}
		
	}
		
	void Merge(int a[], int low,int mid ,int high,int n)
	{
		int h,i,j;
		int b[]=new int [n];
		h=low;
		i=low;
		j=mid+1;
		
		while(h<=mid && j<=high)
		{
			if(a[h]<=a[j])
			{
				b[i]=a[h];
				h=h+1;
			}
			else
			{
				b[i]=a[j];
				j=j+1;
			}
			i=i+1;
		}
		
		if(h>mid)
		{
			for(int k=j;k<=high;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
		else
		{
			for(int k=h;k<=mid;k++)
			{
				b[i]=a[k];
				i++;
			}
		}
	
		for(int k=low;k<=high;k++)
		{
			a[k]=b[k];
		}	
	}

	void display(int a[],int n)
	{
		System.out.println("The sorted list is:");
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}
	}
}

class Quick_Sort
{
	void Quick(int a[],int lb,int ub)
	{
		if(lb<ub)
		{
			int k = partition(a,lb,ub);
			Quick(a,lb,k-1);
			Quick(a,k+1,ub);
		}
	}
	

	int partition(int a[], int lb, int ub)
	{
		int pivot = a[lb] ;
		int up = ub;
		int down = lb ;
		while(down<up)
		{
			while(a[down]<=pivot && down<ub)
			{
				down = down+1;
			}
			while(a[up]>pivot)
			{
				up = up -1 ;
			}
			if(down<up)
			{
				a[down] = a[down]+a[up] ;
				a[up] = a[down]-a[up] ;
				a[down] = a[down]-a[up] ;
			}
		}
		a[lb]=a[up];
		a[up]=pivot;
		return(up);
	}

	void display(int a[],int n)
	{
		System.out.println("The sorted list is:");
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}
	}

}
class Expt2
{
	public static void main(String arg[]) throws IOException
	{
		int n  , x ;
		String d ;
		String c = new String("y") ;
		Merge_Sort ms= new Merge_Sort() ;
		Quick_Sort qs = new Quick_Sort() ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.print("Enter the Total Number of Elements : ") ;
		n = Integer.parseInt(br.readLine()) ;
		int a[] = new int[n] ;
		int o[] = new int[n] ;
		System.out.println("Enter the Numbers  : ") ;
		for(int i=0 ; i<n ; i++)
		{
			o[i]=a[i] = Integer.parseInt(br.readLine()) ;
		}
		do
		{
			
			System.out.println("Menu : \n 1.Merge sort\n 2.Quick sort") ;
			System.out.print("Enter Your Choise : ") ;
			x = Integer.parseInt(br.readLine()) ;
			switch(x)
			{
				case 1 :
				{
					ms.MergeSort(a,0,n-1,n);
					ms.display(a,n);
					break ;
				}
				case 2 : 
				{
					qs.Quick(o,0,n-1);
					qs.display(o,n);
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


/*
OUTPUT:

C:\Documents and Settings\student.PC3.000\My Documents\SECMPN>javac Expt2.java

C:\Documents and Settings\student.PC3.000\My Documents\SECMPN>java Expt2
Enter the Total Number of Elements : 6
Enter the Numbers  :
6
21
2
34
5
24
Menu :
 1.Merge sort
 2.Quick sort
Enter Your Choise : 1
The sorted list is:
2
5
6
21
24
34
Do you want to Continue ? (Y/N) : y
Menu :
 1.Merge sort
 2.Quick sort
Enter Your Choise : 2
The sorted list is:
2
5
6
21
24
34
Do you want to Continue ? (Y/N) : n

C:\Documents and Settings\student.PC3.000\My Documents\SECMPN>

*/