import java.io.*;
import java.util.*;
class Bankers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.of processes");
int n=sc.nextInt();
int sum=0;

boolean flag=false;
int a[][]=new int[n][3];
int max[][]=new int[n][3];
int need[][]=new int[n][3];
int avail[][]=new int[n][3];
int work[][]=new int[n][3];
boolean finish[][]=new boolean[n][1];
int temp[][]=new int[n][3];
System.out.println("Enter the resources");
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
System.out.println("Enter the allocation matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}}
System.out.println("Enter the Maximum matrix");
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
max[i][j]=sc.nextInt();
}}
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
need[i][j]=max[i][j]-a[i][j];
}}
for(int i=0;i<n;i++)
{
for(int j=0;j<1;j++)
{
sum=sum+a[i][j];

}}
avail[0][0]=x-sum;

for(int i=0;i<n;i++)
{
for(int j=1;j<2;j++)
{
sum=sum+a[i][j];

}}
avail[0][1]=y-sum;

for(int i=0;i<n;i++)
{
for(int j=2;j<3;j++)
{
sum=sum+a[i][j];

}}
avail[0][2]=z-sum;
System.out.println("need is");
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(need[i][j]);
}}
System.out.println("avail is");
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(avail[i][j]);
}}
/*
for(int i=0;i<n;i++)
{
for(int j=0;j<1;j++)
{
finish[i][j]=false;
}}
int pos1,pos2;
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
if((need[j][1]<=avail[j][1] ) && ( need[j][2]<=avail[j][2] ) && (need[j][3]<=avail[j][3]))
{
temp[i][j]=need[i][j];
}
 pos1=i;
 pos2=j;

}}
int k=pos1;

work[i][j]=a[k][0]+avail[0][0];
work[i][j]=a[k][1]+avail[0][1];
work[i][j]=a[k][2]+avail[0][2];
finish[i][j]=true;

System.out.println("OUTPUT");
for(int i=0;i<n;i++)
{
for(int j=0;j<3;j++)
{
System.out.println(work[i][j]);
}}*/
}
}




















