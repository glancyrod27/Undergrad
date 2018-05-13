import java.io.*;
import java.util.*;
class Experiment_2B
{
        public static void main(String args[])
       {
	Scanner sc =new Scanner(System.in);
	int a[],n;
	System.out.println("Enter the length of ur string");
	n=sc.nextInt();
	a=new int[n];
	System.out.println("Enter ur string");
	System.out.println();
	for(int i=0;i<n;i++)
	 {
		a[i]=sc.nextInt();
	  }
	if(a[n-2]==0 && a[n-1]==1)
	System.out.println("Entered string is a regular expression");
	else
	System.out.println("Entered string is not a regular expression");
        }
}