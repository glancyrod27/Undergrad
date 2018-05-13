 import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="BresLine.class" width=600 height=600>
</applet>*/
public class BresLine extends Applet
{
	int x1,x2,y1,y2;
	float sx,sy,pk;
	
	
	public void line((int) x1+100,(int) y1+100,(int) x2+100,(int) y2+100,Graphics g)
	{
		int x,y;
		x=x1;
		y=y1;
		
		sx=Math.abs(x2-x1);
		sy=Math.abs(y2-y1);
		pk=2*sy-sx;
		int i=1;
		while(i<sx)
		{
			g.drawLine(x,y,x,y);
			if(pk<0)
			{
				x=x+1;
				pk=pk+2*sy;
			}
			else
			{
				if(pk>=0)
				{
					x=x+1;
					y=y+1;
					pk=pk+2*sy-2*sx;
				}
			}
		i++;
		}
	}
	public void paint(Graphics g)
	{
		line(75,0,50,50,g);
		line(50,50,100,50,g);
		line(100,50,75,0,g);
		line(50,25,100,25,g);
		line(100,25,75,75,g);
		line(75,75,50,25,g);
		line(150,150,175,189,g);
	}
}