import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="Ellipse1.class" width=500 height=500>
</applet>*/
public class Ellipse1 extends Applet
{
	int rx,ry,x,y;
	float dx,dy,d1;
	double d2;
	public void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of rx,ry");
		rx=sc.nextInt();
		ry=sc.nextInt();
	}
	public void paint(Graphics g)
	{
		x=0;
		y=ry;
		d1=(ry*ry)-((rx*rx)*ry)+((rx*rx)/4);
		dx=2*ry*ry*x;
		dy=2*rx*rx*y;
		do
		{
		 	
			g.drawLine((int)x+150,(int)y+150,(int)x+150,(int)y+150);
			g.drawLine((int)-x+150,(int)-y+150,(int)-x+150,(int)-y+150);
			g.drawLine((int)x+150,(int)-y+150,(int)x+150,(int)-y+150);
			g.drawLine((int)-x+150,(int)y+150,(int)-x+150,(int)y+150);
			if(d1<0)
			{
				x=x+1;
				y=y;
				dx=dx+(2*ry*ry);
				d1=d1+dx+(ry*ry);
			}
			else
			{
				x=x+1;
				y=y-1;
				dx=dx+(2*ry*ry);
				dy=dy-(2*rx*rx);
				d1=d1+dx-dy+(ry*ry);	
			}
		}while(dx<dy);
		d2=((ry*ry)*(x+(1/2))*(x+(1/2)))+((rx*rx)*(y-1)*(y-1))-(rx*rx*ry*ry);
		do
		{
			g.drawLine((int)x+150,(int)y+150,(int)x+150,(int)y+150);
			g.drawLine((int)-x+150,(int)-y+150,(int)-x+150,(int)-y+150);
			g.drawLine((int)x+150,(int)-y+150,(int)x+150,(int)-y+150);
			g.drawLine((int)-x+150,(int)y+150,(int)-x+150,(int)y+150);
			if(d2>0)
			{
				x=x;
				y=y-1;
				dy=dy-(2*rx*rx);
				d2=d2-dy+(rx*rx);
			}
			else
			{
				x=x+1;
				y=y-1;
				dx=dx+(2*ry*ry);
				dy=dy-(2*rx*rx);
				d2=d2+dx-dy+(rx*rx);	
			}			
		}while(y>0);
	}
}