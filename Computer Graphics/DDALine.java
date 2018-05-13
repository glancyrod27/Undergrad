import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="DDALine.class" width=500 height=500>
</applet>*/
public class DDALine extends Applet
{
	int x1,x2,y1,y2;
	int dx,dy;
	int m;
	public void init()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values of x1,y1");
		x1=sc.nextInt();
		y1=sc.nextInt();
		System.out.println("enter values of x2,y2");
		x2=sc.nextInt();
		y2=sc.nextInt();
		dx=Math.abs(x2-x1);
		dy=Math.abs(y2-y1);
	}
	public void paint(Graphics g)
	{
		int x,y;
		x=x1;
		y=y1;
		m=(dy/dx);
		int i=1;
		do
		{	
			g.setColor(Color.red);
			g.drawLine((int)x+150,(int)y+150,(int)x2+150,(int)y2+150);
			
			if(m<=1)
			{
				y=y+m;
				x=x+1;
			}
			else
			{
				if(m>1)
				{
					x=x+(1/m);
					y=y+1;
				}
			}
		i++;
		}while(i==x2);
	}
	
}