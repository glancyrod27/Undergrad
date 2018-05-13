
import java.util.*;
class SJF
{
int n,burst[],arrival[],wait[],tat[],start[],end[],included[],gantt[];
float awt=0,atat=0;
Scanner sc=new Scanner(System.in);
void input()
  {
     System.out.println("kindly enter how many process");
     n=sc.nextInt();
     burst=new int[n];
     arrival=new int[n];
     wait=new int[n];
     tat=new int[n];
     start=new int[n];
     end=new int[n];
     included=new int[n];
     gantt=new int[n];
     for(int i=0;i<n;i++)
     {
        included[i]=0;
       System.out.println("\n enter burst time for p["+(i+1)+"]:");
       burst[i]=sc.nextInt();
       System.out.println("\n enter arrival time for p["+(i+1)+"]:");
       arrival[i]=sc.nextInt();
      }
     disln();
     sjf();
   }

int min(int time)
{
  int min=5000,small=0;
  for(int i=0;i<n;i++)
   {
   if(arrival[i]<=time)
     {
      if(included[i]!=1&&burst[i]<min)
         {
		min=burst[i];
		small=i;
          }
      }
    }
   return small;
 }
void disln()
{
   System.out.print("\n Process\tBurst \t    Arrival");
   for(int i=0;i<n;i++)
	{

	System.out.print("\np["+(i+1)+"]\t\t"+burst[i]+"\t\t"+arrival[i]);

	}
}



void sjf()
{
   int next=0,time=0;
   for(int i=0;i<n;i++)
  {
  next=min(time);
  included[next]=1;
  gantt[i]=next;
  start[next]=time;
  end[next]=(time+burst[next]);
  wait[next]=(start[next]-arrival[next]);
  tat[next]=(end[next]-arrival[next]);
  time+=(burst[next]);
  awt+=((float)(wait[next]));
  atat+=((float)(tat[next]));
  }
  awt=(float)(awt/(float)(n));
  atat=(float)(atat/(float)(n));
  display();
  }


void display()
{
   System.out.println("\nSequence is");
   for(int i=0;i<n;i++)
   System.out.println((gantt[i]+1)+"\t");
   System.out.println("\nProcess start End Waiting Turnaround");
   for(int i=0;i<n;i++)
    {
 System.out.println("\n p["+(i+1)+"]"+"\t"+start[i]+"\t"+end[i]+"             "+wait[i]+"\t" +tat[i]);
    }
  System.out.println("\n Average waiting time :"+awt+"ms");
  System.out.println("\n Average turnaround time :"+atat+"ms");
 }


 public static void main(String args[])
 {
  SJF s=new SJF();
  s.input();
 }
}


/*OUTPUT
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Glancy>cd/

C:\Documents and Settings\Glancy>d:

D:\>cd sem4

D:\sem4>javac SJF.java

D:\sem4>java SJF
kindly enter how many process
4

 enter burst time for p[1]:
6

 enter arrival time for p[1]:
0

 enter burst time for p[2]:
3

 enter arrival time for p[2]:
2

 enter burst time for p[3]:
5

 enter arrival time for p[3]:
3

 enter burst time for p[4]:
2

 enter arrival time for p[4]:
5

 Process        Burst       Arrival
p[1]            6               0
p[2]            3               2
p[3]            5               3
p[4]            2               5
Sequence is
1
4
2
3

Process start End Waiting Turnaround

 p[1]   0       6             0 6

 p[2]   8       11             6        9

 p[3]   11      16             8        13

 p[4]   6       8             1 3

 Average waiting time :3.75ms

 Average turnaround time :7.75ms

D:\sem4>*/
