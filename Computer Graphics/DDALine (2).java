import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="DDALine.class" width=500 height=500>
</applet>*/
public class DDALine extends Applet
{
	Scanner sc=new Scanner(System.in);
	double x1,y1,x2,y2,dx,dy,x,y,i,l;
	int f=0;
	public void init()
	{
		System.out.println("Enter initial point of line"+(f+1));
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("Enter end point of line"+(f+1));
		x2=sc.nextInt();
		y2=sc.nextInt();
		f++;
	}
	public void paint(Graphics g)
	{
		while(f<8)
		{
			dx=x2-x1;
			dy=y2-y1;
			if(dx>=dy)
			{
				l=dx;
			}
			else
			{
				l=dy;
			}
			dx=(dx/l);
			dy=(dy/l);
			x=x1+dx;
			y=y1+dy;
			i=1;
			while(i!=l)
			{
				g.drawLine((int)x,(int)y,(int)x,(int)y);
				x=x+dx;
				y=y+dy;
				i=i+1;
			}
			if(f<7)
			init();
		}
	}
}
			
/*Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Glancy>cd/

C:\Documents and Settings\Glancy>d:

D:\>cd sem4

D:\sem4>javac DDALine.java

D:\sem4>appletviewer DDALine.java
Enter initial point of line1
150
0
Enter end point of line1
100
100
Enter initial point of line2
100
100
Enter end point of line2
200
100
Enter initial point of line3
150
0
Enter end point of line3
200
100
Enter initial point of line4
100
50
Enter end point of line4
200
50
Enter initial point of line5
100
50
Enter end point of line5
150
150
Enter initial point of line6
200
50
Enter end point of line6
150
150
Enter initial point of line7
250
300
Enter end point of line7
450
480
*/