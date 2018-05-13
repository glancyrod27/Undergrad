import java.io.*;
import java.util.*;
class Process
{
	int number;
	int arrival;
	int burst;
	int waiting;
	int turnaround;
}
class FCFS
{
	public static void main(String args[])throws IOException
	{
		Schedule s=new Schedule();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("No of Processes:");
		int n=Integer.parseInt(br.readLine());
		Process p[]=new Process[n];							// Array of Objects
		for(int i=0; i<n; i++)
		{
			p[i]=new Process();
			p[i].number=(i+1);			
			System.out.println("Burst Time of Process "+p[i].number);
			p[i].burst=Integer.parseInt(br.readLine());
			
			System.out.println("Arrival Time of Process "+p[i].number);
			p[i].arrival=Integer.parseInt(br.readLine());
		}
		
		s.Fcfsfunc(p,n);
	}
}

class Schedule
{
	void Fcfsfunc(Process p[], int n)
	{
		Process temp;
		int ctime=0;								// ctime is for the current time

		for(int j=0; j<n-1; j++)						// Bubble sort the processes as per arrival time
		for(int i=0; i<n-1; i++)
		{
			if(p[i].arrival>p[i+1].arrival)
			{
				temp=p[i];
				p[i]=p[i+1];
				p[i+1]=temp;
			}
		}

		System.out.println("FCFS:");	
		for(int i=0; i<n; i++)
		{
			if(ctime<p[i].arrival)						// check if process has arrived at the current time
			{
				System.out.print("|"+ctime+"| -- ");
				ctime=p[i].arrival;
			}
			System.out.print("|"+ctime+"| "+"Process "+p[i].number+" ");
			p[i].waiting=ctime-p[i].arrival;
			ctime=ctime+p[i].burst;
			p[i].turnaround=p[i].waiting+p[i].burst;
		}
	
		System.out.println("|"+ctime+"|");
		System.out.println();	
		
		average(p,n);
	}
	
	
	void average(Process p[], int n)
	{
		
		float avgwait=0, avgturn=0;
		System.out.println("Process    Wait Time    Turnaround Time");	
		for(int i=0; i<n; i++)
		{
			System.out.println(p[i].number+"\t\t"+p[i].waiting+"\t\t"+p[i].turnaround);
		}
		
		for(int i=0; i<n; i++)				
		{
			avgwait=avgwait+p[i].waiting;
			avgturn=avgturn+p[i].turnaround;
		}
	
		System.out.println("Avg Wait Time: "+(avgwait/n));	
		System.out.println("Avg Turn Around Time: "+(avgturn/n)); 
	}
}

/*OUTPUT
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Glancy>cd/

C:\Documents and Settings\Glancy>d:

D:\>cd sem4

D:\sem4>javac FCFS.java

D:\sem4>java FCFS
No of Processes:4
Burst Time of Process 1
6
Arrival Time of Process 1
0
Burst Time of Process 2
8
Arrival Time of Process 2
2
Burst Time of Process 3
7
Arrival Time of Process 3
4
Burst Time of Process 4
3
Arrival Time of Process 4
6
FCFS:
|0| Process 1 |6| Process 2 |14| Process 3 |21| Process 4 |24|

Process    Wait Time    Turnaround Time
1               0               6
2               4               12
3               10              17
4               15              18
Avg Wait Time: 7.25
Avg Turn Around Time: 13.25

D:\sem4>*/