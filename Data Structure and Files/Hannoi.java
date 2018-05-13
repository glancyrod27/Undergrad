import java.io.*;

class Tower
{
  void tower(int n,char src,char dest,char aux)
   {
     if(n==1)
      {
        System.out.println(" Move disk "+n+" from "+src+" to "+dest);
	return;
      }
     tower(n-1,src,aux,dest);
     System.out.println(" Move disk "+n+" from "+src+" to "+dest);
     tower(n-1,aux,dest,src);
   }
}
class Hannoi
{
  public static void main(String args[ ])throws IOException
  {
    Tower t=new Tower();
    t.tower(3,'A','B','C');
  }

}
/*
output
D:\flevia>javac Hannoi.java

D:\flevia>java Hannoi
 Move disk 1 from A to B
 Move disk 2 from A to C
 Move disk 1 from B to C
 Move disk 3 from A to B
 Move disk 1 from C to A
 Move disk 2 from C to B
 Move disk 1 from A to B

D:\flevia>
*/