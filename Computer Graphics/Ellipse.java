import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*<applet code= "Ellipse.class" height=400 width=700>
</applet>*/
public class Ellipse extends Applet
	{
	Scanner sc=new Scanner(System.in);
	float x,y,rx,ry,xc,yc;
	double dx,dy,d1,d2;
	
	public void init()
	{
	
	System.out.println("Enter the x and y radius");
	rx=sc.nextInt();
	ry=sc.nextInt();
	System.out.println("Enter the x and y centre");
	xc=sc.nextInt();
	yc=sc.nextInt();
	}
	public void paint(Graphics g)
	{
	x=0;
	y=ry;
	//r1
	d1=ry*ry-rx*rx*ry+0.25*rx*rx;
                dx=2*ry*ry*x;
	dy=2*rx*rx*y;
	 
	do
	 {
	  g.drawLine((int)(x+xc),(int)(y+yc),(int)(x+xc),(int)(y+yc));	
	  g.drawLine((int)(-x+xc),(int)(y+yc),(int)(-x+xc),(int)(y+yc));	
	  g.drawLine((int)(x+xc),(int)(-y+yc),(int)(x+xc),(int)(-y+yc));	
	  g.drawLine((int)(-x+xc),(int)(-y+yc),(int)(-x+xc),(int)(-y+yc));	
	 
	   if(d1<0)
	      {
	        x=x+1;
	      y=y;
	      dx=dx+2*ry*ry;
	      d1=d1+dx+ry*ry;
	    }
                else
	    {
	      x=x+1;
	      y=y-1;
	     dx=dx+2*ry*ry;
	     dy=dy-2*rx*rx;
	     d1=d1+dx-dy+ry*ry;
	   }}
	while(dx<dy);
    //r2
              d2=ry*ry*(x+0.5)*(x+0.5)+rx*rx*(y-1)*(y-1)-rx*rx*ry*ry;
	do
	   {
	    g.setColor(Color.red);
	    g.drawLine((int)(x+xc),(int)(y+yc),(int)(x+xc),(int)(y+yc));
	    g.drawLine((int)xc,(int)yc,(int)(x+xc),(int)(y+yc));
	 g.setColor(Color.blue);	
	     g.drawLine((int)(-x+xc),(int)(y+yc),(int)(-x+xc),(int)(y+yc));
	g.drawLine((int)xc,(int)yc,(int)(-x+xc),(int)(y+yc));
 	g.setColor(Color.yellow);	
	     g.drawLine((int)(x+xc),(int)(-y+yc),(int)(x+xc),(int)(-y+yc));
	g.drawLine((int)xc,(int)yc,(int)(x+xc),(int)(-y+yc));
	   g.setColor(Color.green);	
	    g.drawLine((int)(-x+xc),(int)(-y+yc),(int)(-x+xc),(int)(-y+yc));
	g.drawLine((int)xc,(int)yc,(int)(-x+xc),(int)(-y+yc));	
	 
	        if(d2>0)
	      {
	        x=x;
	        y=y-1;
	       dy=dy-2*rx*rx;
	       d2=d2-dy+rx*rx;
	    }
                else
	    {
	      x=x+1;
	      y=y-1;
	     dx=dx+2*ry*ry;
	     dy=dy-2*rx*rx;
	     d2=d2+dx-dy+ry*ry;
	   }}
	while(y>0);  
	}	
}
*/
OUTPUT:
/*OUTPUT



D:\>javac Ellipse.java

D:\>Appletviewer Ellipse.java
Enter the x distance
50
Enter the y distance
120
Enter the center
120
120
*/
	