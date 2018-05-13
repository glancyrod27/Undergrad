

 
 import java.util.*;
 class Division
   {
          int a1[]=new int[5];
          int a2[]=new int[5];
          int a3[]=new int[5];
          int a4[]=new int[5];
          int sum[]=new int[5];
          int carry=0,m,carry1=0;
          void read()
             {
                     Scanner Sc=new Scanner(System.in);
                     System. out.println("Enter divisor in binary :");
                     for(int n=0;n<5;n++)
                     a1[n]=Sc.nextInt();
                     System .out.println("Enter dividend in binary :");
                     for(int j=0;j<5;j++)
                     a2[j]=Sc.nextInt();
             }
                void add()
                       {
                             for(int i=4;i>=0;i--)
                                {
                                       sum[i]=a1[i]+sum[i]+carry;
                                             if(sum[i]==0)
                                                {
                                                        sum[i]=0;
                                                        carry=0;
                                                }
                                                if(sum[i]==1)
                                                {
                                                        sum[i]=1;
                                                        carry=0;
                                                }
                                                if(sum[i]==2)
                                                {
                                                        sum[i]=0;
                                                        carry=1;
                                                }
                                                if(sum[i]==3)
                                                {
                                                        sum[i]=1;
                                                        carry=1;
                                                }
                                }
                }
                void shift()
                {
                                int scrap, temp;
                                scrap=sum[0];
                                for(int m1=0;m1<=3;m1++)
                                sum[m1]=sum[m1+1];
                                sum[4]=a2[0];
                                for(int m2=0;m2<=3;m2++)
                                a2[m2]=a2[m2+1];
                }
                void comp()
                {
                                for(int b=0; b<4; b++)
                                a4[b]=0;
                                a4[4]=1;
                                for(int k=0;k<5;k++)
                                {
                                                if(a1[k]==0)
                                                a3[k]=1;
                                                else
                                                a3[k]=0;
                                }
                                for(int i=4;i>=0;i--)
                                {
                                                a3[i]=a4[i]+a3[i]+carry1;
                                                if(a3[i]==0)
                                                {
                                                                a3[i]=0;
                                                                carry1=0;
                                                }
                                                if(a3[i]==1)
                                                {
                                                                a3[i]=1;
                                                                carry1=0;
                                                }
                                                if(a3[i]==2)
                                                {
                                                                a3[i]=0;
                                                                carry1=1;
                                                }
                                                if(a3[i]==3)
                                                {
                                                                a3[i]=1;
                                                                carry1=1;
                                                }
                                }             
                }
                void sub()
                {
                                carry=0;
                                for(int i=4;i>=0;i--)
                                {
                                                sum[i]=a3[i]+sum[i]+carry;
                                                if(sum[i]==0)
                                                {
                                                                sum[i]=0;
                                                                carry=0;
                                                }
                                                if(sum[i]==1)
                                                {
                                                                sum[i]=1;
                                                                carry=0;
                                                }
                                                if(sum[i]==2)
                                                {
                                                                sum[i]=0;
                                                                carry=1;
                                                }
                                                if(sum[i]==3)
                                                {
                                                                sum[i]=1;
                                                                carry=1;
                                                }
                                }
                }
                void display()
                {
                                System.out.println("Quotient");              
                                for(int z1=0; z1<5; z1++)
                                System.out.print(a2[z1]);
                                System.out.println();
                                System.out.println("Remainder");
                                for(int z=0; z<5; z++)
                                System.out.print(sum[z]);
 
                }
  }
public class Restoring
{
                public static void main(String[] args)
                {
                               Division d = new Division();
                                d.read();    
                                for(int i=0;i<5;i++)
                                {
                                                d.shift();
                                                d.comp();
                                                d.sub();
                                                if(d.sum[0]==1)
                                                {
                                                      d.a2[4]=0;
                                                      d.add();
                                                }
                                                else
                                                d.a2[4]=1;
                                }
                                d.display();
                }
}


/*

Output:
 
D:\>javac Restoring.java
D:\>java Restoring

Enter divisor in binary:
00010
Enter dividend in binary:
00101
Quotient:  00010
Remainder:  00001                          

 */