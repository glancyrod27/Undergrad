import java.io.*;
class R
{

   void tower(int n,int src,int dest,int aux)
{
	if(n==1)
	{
 	System.out.println("move disk  " + n +" from "+src+" to "+dest);
	return;
	}
	tower(n-1,src,aux,dest);
	System.out.println("move disk  " + n +" from "+src+" to "+dest);
	tower(n-1,aux,dest,src);
          }
}
class Hannoi
{
 public static void main(String args[])throws IOException
          {
	R r=new R( );
	r.tower(4,1,2,3);
           }
}
//////////////////////////////////////////

D:\>javac Hannoi.java

D:\>java Hannoi
move disk  1 from 1 to 3
move disk  2 from 1 to 2
move disk  1 from 3 to 2
move disk  3 from 1 to 3
move disk  1 from 2 to 1
move disk  2 from 2 to 3
move disk  1 from 1 to 3 

move disk  4 from 1 to 2
move disk  1 from 3 to 2
move disk  2 from 3 to 1
move disk  1 from 2 to 1
move disk  3 from 3 to 2
move disk  1 from 1 to 3
move disk  2 from 1 to 2
move disk  1 from 3 to 2

D:\>