
import java.util.Scanner;
public class BestFit{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pro,k=0;
        System.out.println("Enter the length of page table");
        n=sc.nextInt();
        boolean empty[]=new boolean[n];
        boolean added[]=new boolean[n];
        for(int i=0;i<n;i++)
            empty[i]=true;
        for(int i=0;i<n;i++)
            added[i]=false;
        int page[]=new int[n];
        System.out.println("Enter the size of each page");
        for(int i=0;i<n;i++)
            page[i]=sc.nextInt();
        System.out.println("Enter number of processes");
        pro=sc.nextInt();
        int pros[]=new int[pro];
        System.out.println("Enter size of each process");
        for(int i=0;i<pro;i++)
            pros[i]=sc.nextInt();
        for(int i=0;i<pro;i++)
        {
           
            int j=bestPage(page,pros[i],empty);
            page[j]=page[j]-pros[i];
            empty[j]=false;
        }
        System.out.println("Page table remaining free space");
        for(int i=0;i<n;i++)
           System.out.println(page[i]);
    }
static int bestPage(int page[],int pros,boolean empty[])
{

    int min=0;
    int page1[]=new int[page.length];
    System.arraycopy(page,0,page1,0,page.length);
    
    for(int i=0;i<page1.length;i++)
        page1[i]=page1[i]-pros;
    for(int i=0;i<page1.length;i++)
    {
        if(page1[i]<Math.abs(page1[min])  && empty[i])
        {
            
            min=i;
        }
    }
    
    
        return min;
   
}
}
/*
output
Enter the length of page table
3
Enter the size of each page
100
200
300
Enter number of processes
3
Enter size of each process
299
199
99
Page table remaining free space
1
1
1
*/


