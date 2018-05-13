import java. io.*;
class Fibonacci
{
   int f3;
   int fibo(int f1, int f2,int count)
   {
     if(count==0)
      {
           return 0;
       }
     else
       { 
          f3=f1+f2;
           f1=f2;
           f2=f3;
         System.out.println("  "+f3);
         count--;
         return(fibo(f1,f2,count));

       }
}
}
class Demo
{
  public static void main(String args[ ])throws IOException
   {
        Fibonacci f=new Fibonacci();
System.out.println("  The FIBONACCI SERIES is:");
  System.out.println("  "+0);
  System.out.println("  "+1);
        f.fibo(0,1,30);
   }
}
/*OUTPUT

D:\flevia>javac Demo.java

D:\flevia>java Demo
  The FIBONACCI SERIES is:
  0
  1
  1
  2
  3
  5
  8
  13
  21
  34
  55
  89
  144
  233
  377
  610
  987
  1597
  2584
  4181
  6765
  10946
  17711
  28657
  46368
  75025
  121393
  196418
  317811
  514229
  832040
  1346269

D:\flevia>
*/











