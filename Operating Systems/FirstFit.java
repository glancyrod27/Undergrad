
import java.util.Scanner;

//first fit
public class FirstFit
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,pro;
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
            for(int j=0;j<n;j++)
            {
                if(pros[i]<=page[j] && empty[j])
                {
                page[j]=page[j]-pros[i];
                empty[j]=false;
                added[i]=true;
                j=n;
                }
            }
            if(!added[i])
                System.out.println("process not added "+pros[i]);
        }
        
        System.out.println("Page table remaining free space");
        for(int i=0;i<n;i++)
           System.out.println(page[i]);


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
400
100
200
process not added 400
Page table remaining free space
0
0
300
*/
