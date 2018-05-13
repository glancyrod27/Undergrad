import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="DDACircle1.class" width=400 height=400>
</applet>*/
public class DDACircle1 extends Applet
{
	
	
	double x2,y2,x1,y1,stx,sty;
	double e;
	int n;
	public void draw(double r,Graphics g)
	{
		stx=0;
		sty=r;
		x1=stx;
		y1=sty;
		n=0;
		do
		{
			n++;
		}
		while(Math.pow(2,(n-1))>r||Math.pow(2,(n))<r);
		e=Math.pow(2,(-n));
		do
		{
			x2=x1+(e*y1);
			y2=y1-(e*x2);
			
			g.drawLine((int)x2+150,(int)y2+150,(int)x2+150,(int)y2+150);
			g.drawLine((int)-x2+150,(int)y2+150,(int)-x2+150,(int)y2+150);
			g.drawLine((int)x2+150,(int)-y2+150,(int)x2+150,(int)-y2+150);
			g.drawLine((int)-x2+150,(int)-y2+150,(int)-x2+150,(int)-y2+150);
			x1=x2;
			y1=y2;
		}
		while((y1-sty)<e||(stx-x1)>e);
	}
	public void paint(Graphics g)
	{
		
		draw(100.0,g);
		
		
	}
}
		
