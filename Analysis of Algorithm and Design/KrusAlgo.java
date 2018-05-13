import java.io.*;



class KrusAlgo
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
System.out.println("Enter the no of Nodes");
int n=Integer.parseInt(br.readLine());
int no[]=new int[n];
System.out.println("Enter the name of Nodes");
for(int i=0;i<n;i++)
{
no[i]=Integer.parseInt(br.read());
}

System.out.println("Enter the no of edges");
int e=Integer.parseInt(br.readLine());
int f=1;
int r=1;

do
{
while(f!=0)
{
int ed[][]=new int[4][4];
System.out.println("Enter the starting and ending node of edges");
 int srt=Integer.parseInt(br.readLine());
 int end=Integer.parseInt(br.readLine());
System.out.println("Enter the weight of edges");
int wt=Integer.parseInt(br.readLine());
ed[srt][end]=wt;
ed[end][srt]=wt;
System.out.println("if u want to cont press 1 else 0");
r=Integer.parseInt(br.readLine());
}
}
while(r!=0);

}
}
}