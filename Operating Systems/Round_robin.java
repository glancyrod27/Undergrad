
import java.util.*;
public class Round_robin
{
    static Scanner src=new Scanner(System.in);
    static double p[][];
    /*
    0=>burst time
    1=>start of execution
    2=>completion time
    3=>waiting time
    4=>Amount completed
    */
    static int n, ub, Q;
    static double awt,atat,tt;
    
    public static void main(String []args)
    {
	ip();
	rr();
	calc();
	Display();
    }
    
    static void rr()
    {
    	ub=0;
        int y=0;
        int z=0;
        System.out.println("Executing Process\tTime");
        while(notdone())
        {
        	if(tt==0)
        		for(int j=0;j<n;j++)
        			if(p[y][3]==p[y][0])
        				y++;                   // Selection of process
        	z++;
        	p[y][3]++;                                                               //Amount completed
        	tt++;
        	if(z==Q||p[y][3]==p[y][0])
        		System.out.println("\tP" +(y+1) +"\t\t" +(tt));
        	if(p[y][3]==p[y][0])
        		p[y][1]=tt;            // Process completed
        	for(int j=0;j<n;j++)
        		if(j!=y)
        			if(p[j][3]<p[j][0])
        				p[j][2]++;            // Waiting Time
        	for(int j=0;j<n;j++)
        		if(z==Q||p[y][3]==p[y][0])
            	{
            		if(y+1==n)
            			y=0;
            		else
            			y++;                                       // Next process
            		if(p[y][3]==p[y][0])
            			continue;
            		z=0;
            	}
		}
		for(int j=0;j<n;j++)
			p[j][1]+=1;
		System.out.print("\n\nProcess\tBurst\tCTime\tWTime");
    	for(int i=0;i<n;i++)
    	{
    		System.out.print("\nP" +(i+1) +"\t");
    		for(int j=0;j<3;j++)
    			System.out.print(p[i][j] +"\t");
    	}
    	System.out.println();
    }
    
    static void ip() {
        System.out.print("Enter the number of process : ");
        n=src.nextInt();
        p=new double[n][4];
        for(int i=0;i<n;i++)
        {
            System.out.print("\nFor the Process " +(i+1));
            System.out.print("\n\tBurst time: ");
            p[i][0]=src.nextInt();
            p[i][1]=p[i][2]=p[i][3]=0;
        }
        System.out.print("\nEnter the Quatum time : ");
        Q=src.nextInt();
        System.out.println(); 
    }
    
    static void calc() {
    	for(int i=0;i<n;i++)
    	{
            awt+=p[i][2];                                           //Avg. Waiting Time
            atat+=p[i][1];                                         //Avg. Turnaround time
    	}
        awt/=n;
        atat/=n;
    }
    
    static void Display() {                                     //Display
    	System.out.println("\n\nAverage waiting time: " +awt);
        System.out.println("Average turnaround time: " +atat);
        System.out.println("\nTotal time: " +tt);
    }
    
    static boolean notdone() {
    	for(int j=0;j<n;j++)
        	if(p[j][3]<p[j][0])
        		return true;
    	return false;
    }
}


/*OUTPUT
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Glancy>cd/

C:\Documents and Settings\Glancy>d:

D:\>cd sem4

D:\sem4>javac Round_robin.java

D:\sem4>java Round_robin
Enter the number of process : 5

For the Process 1
        Burst time: 5

For the Process 2
        Burst time: 7

For the Process 3
        Burst time: 3

For the Process 4
        Burst time: 4

For the Process 5
        Burst time: 6

Enter the Quatum time : 2

Executing Process       Time
        P1              2.0
        P2              4.0
        P3              6.0
        P4              8.0
        P5              10.0
        P1              12.0
        P2              14.0
        P3              15.0
        P4              17.0
        P5              19.0
        P1              20.0
        P2              22.0
        P5              24.0
        P2              25.0


Process Burst   CTime   WTime
P1      5.0     21.0    15.0
P2      7.0     26.0    18.0
P3      3.0     16.0    12.0
P4      4.0     18.0    13.0
P5      6.0     25.0    18.0


Average waiting time: 15.2
Average turnaround time: 21.2

Total time: 25.0

D:\sem4>*/