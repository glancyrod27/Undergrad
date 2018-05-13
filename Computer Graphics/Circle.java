import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;
/*<applet code= "Circle.class" height=400 width=700>
</applet>*/
public class Circle extends Applet
	{
	Scanner sc=new Scanner(System.in);
	double xc,yc,r,x1,y1,x2,y2,n;
	double d,e;
	
	public void init()
	{
	System.out.println("Enter the center");
	xc=sc.nextInt();
	yc=sc.nextInt();
	System.out.println("Enter the radius");
	r=sc.nextInt();
	
	}
	public void paint(Graphics g)
	{
	x1=0;
  	y1=r;
	
	for(n=1;n<10;n++)
	{
	if((int)r>Math.pow(2,(n-1)) &&(int) r<Math.pow(2,n))
	{
	e=Math.pow(2,(-n));
	}
	}
	
	do
	{
	x2=x1+e*y1;
	y2=y1-e*x2;
	g.drawLine((int)(x2+xc),(int)(y2+yc),(int)(x2+xc),(int)(y2+yc));
	x1=x2;
	y1=y2;
	}
	while((y1-r)<-e || (0-x1)>e);
}
}
