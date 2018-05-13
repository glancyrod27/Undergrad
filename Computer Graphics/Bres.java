import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*<applet code="Bres.class" height=400 width=700>
</applet>*/
public class Bres extends Applet
{
Scanner sc=new Scanner(System.in);
int x1,x2,y1,y2,p,w,n,temp,j,i;
public void init()
{
System.out.println("Enter the first co-ordinates");
x1=sc.nextInt();
y1=sc.nextInt();
System.out.println("Enter the last co-ordinates");
x2=sc.nextInt();
y2=sc.nextInt();
System.out.println("Enter the width of line");
 n=sc.nextInt();
}
public void paint(Graphics g)
{
 w=n/2;
int dx=Math.abs(x2-x1);
int dy=Math.abs(y2-y1);
if(dx<dy)
{
temp=dx;
dx=dy;
dy=temp;
}
int  X=x1;
int Y=y1;
int p=2*dy-dx;
for(i=1;i<(dx-1);i++)
{
if(i%2==0)
{
g.drawLine(X,Y,x2,y2);
for(j=1;j<w;i++)
{
g.drawLine(X,Y-j,x2,y2-j);
g.drawLine(X,Y+j,x2,y2+j);
}
}
if(p<0)
{
X=X+1;
Y=Y;
p=p+2*(dy);
}
if(p>=0)
{
X=X+1;
Y=Y+1;
p=p+(2*dy)-(2*dx);
}
}
}
}




