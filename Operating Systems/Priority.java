import java.util.Scanner;
class Priority {
Scanner sc=new Scanner(System.in);
    int sum=0;

    void Priority(){

   System.out.println("enter no of procces");
   int n=sc.nextInt();
   int wtt[]=new int[n];
   
   int trt[]=new int[n];
  
   String pro[]=new String[n];
   int brst[]=new int[n];
   int pri[]=new int[n];
    System.out.println("Enter name of proccess, burst time and priority");
    for(int i=0;i<pro.length;i++){
        pro[i]=sc.next();
       
        brst[i]=sc.nextInt();
        pri[i]=sc.nextInt();
    }
    	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(pri[j]>pri[j+1])
			{
                                int temp3=pri[j];
                                String temp2=pro[j];
                                
				int temp=brst[j];
				brst[j]=brst[j+1];
                                
                                pro[j]=pro[j+1];
                                pri[j]=pri[j+1];
				brst[j+1]=temp;
                                
                                pro[j+1]=temp2;
                                pri[j+1]=temp3;
                        }
		}
        }
       System.out.println("process :"+pro[0]);
       System.out.println("priority :"+pri[0]);
      
       
       System.out.println("waiting time :"+0);
       System.out.println("turn around time :"+brst[0]);
       wtt[0]=0;
       trt[0]=brst[0];
       
    for(int i=0;i<n-1;i++){
       sum=sum+brst[i];
       System.out.println("process :"+pro[i+1]);
       System.out.println("priorty :"+pri[i+1]);
       
      wtt[i+1]=sum;
       System.out.println("waiting time :"+wtt[i+1]);
       trt[i+1]=wtt[i+1]+brst[i+1];
       System.out.println("turn around time :"+trt[i+1]);
       
    }
       int avgwtt=0;
       int avgtrt=0;
       
       for(int i=1;i<n;i++)
       {
           avgwtt=avgwtt+wtt[i];
           avgtrt=avgtrt+trt[i];
          
       }
       System.out.println("avg waiting time :"+avgwtt/n);
       System.out.println("avg Turnaround time :"+avgtrt/n);
       

    }


   public static void main(String args[])
   {
 Priority a=new Priority();
  a.Priority();
}
}

/*OUTPUT
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Glancy>cd/

C:\Documents and Settings\Glancy>d:

D:\>cd sem4

D:\sem4>javac Priority.java

D:\sem4>java Priority
enter no of procces
3
Enter name of proccess, burst time and priority
a
4
3
b
5
2
c
6
1
process :c
priority :1
waiting time :0
turn around time :6
process :b
priorty :2
waiting time :6
turn around time :11
process :a
priorty :3
waiting time :11
turn around time :15
avg waiting time :5
avg Turnaround time :8

D:\sem4>*/
