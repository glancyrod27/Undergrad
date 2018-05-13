import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*<applet code= "Dcircle.class" height=400 width=700>
</applet>*/
public class Dcircle extends Applet
	{
	Scanner sc=new Scanner(System.in);
	float x1,y1,r,x2,y2;
float d,E;
	
	
	public void init()
	{
	System.out.println("Enter the center");
	x1=sc.nextInt();
	y1=sc.nextInt();
	System.out.println("Enter the radius");
	r=sc.nextInt();
	
	}
	public void paint(Graphics g)
	{
	x1=0;
	y1=r;
	int n=1;
	if((int)r>Math.pow(2,(n-1))&&(int)r<Math.pow(2,n))
	  {
	   
	   E=Math.pow(2,-n);
	   n++;
	  }
	
	do
	{
	x2=(x1+(E*y1));
	y2=(y1-(E*x2));
	g.drawLine((int)(x1+x2),(int)(y1+y2),(int)(x1+x2),(int)(y1+y2));
	g.drawLine((int)(x1+x2),(int)(-y1+y2),(int)(x1+x2),(int)(-y1+y2));
	g.drawLine((int)(-x1+x2),(int)(y1+y2),(int)(-x1+x2),(int)(y1+y2));
	g.drawLine((int)(-x1+x2),(int)(-y1+y2),(int)(-x1+x2),(int)(-y1+y2));
	g.drawLine((int)(y1+y2),(int)(x1+x2),(int)(y1+y2),(int)(x1+x2));
	g.drawLine((int)(-y1+y2),(int)(x1+x2),(int)(-y1+y2),(int)(x1+x2));
	g.drawLine((int)(y1+y2),(int)(-x1+x2),(int)(y1+y2),(int)(-x1+x2));
	g.drawLine((int)(-y1+y2),(int)(-x1+x2),(int)(-y1+y2),(int)(-x1+x2));
	x1=x2;
	y1=y2;
	}
	while((y1-r)<-E||(0-x1)>E);
	}
	}
	
	

	
	
           