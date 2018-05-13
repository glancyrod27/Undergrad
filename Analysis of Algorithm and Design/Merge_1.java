import java.io.*;
class Merge
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n=0;
int x[]=new int[25];
System.out.println("How many numbers to be sorted?");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the numbers"); 
for(i=0; i<n; i++)
x[i]=Integer.parseInt(br.readLine());
merge(x,n);
System.out.println("Sorted elements are: ");
for(i=0; i<n; i++ )
System.out.print(x[i]+" "); 
}

static void merge(int x[], int n)
{
int sub[]=new int[25];
int i,j,k,l1,l2,u1,u2,size;
size=1;
while(size<n)
{
l1=0;
k=0;
while((l1+size)<n)
{
l2=l1+size;
u1=l2-1;
if((l2+size-1)<n)
u2=l2+size-1;
else
u2=n-1;
for(i=l1,j=l2;i<=u1&&j<=u2;k++)
{
if(x[i]<=x[j])
sub[k]=x[i++];
else
sub[k]=x[j++];
}
for(;i<=u1;k++)
sub[k]=x[i++];
for(;j<=u2;k++)
sub[k]=x[j++];
l1=u2+1;
}
for(i=l1;k<n;i++)
sub[k++]=x[i];
for(i=0;i<n;i++)
x[i]=sub[i];
size*=2;
}
}
}

/* Output:

C:\DSF>java Merge
How many numbers to be sorted?
8
Enter the numbers
25
57
48
37
12
92
86
33
Sorted elements are:
12 25 33 37 48 57 86 92

*/