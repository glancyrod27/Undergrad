import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="BresLine.class" height=500 width=500>
</applet>
*/
public class BresLine extends Applet
{
	int x1,y1,x2,y2,x,y;
	int p0,p1;
                int i=1;
	int dx,dy,r;
	public void init()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the x-coordinate");
	       x1=sc.nextInt();
	       x2=sc.nextInt();
	    System.out.println("Enter the y-coordinate");
	       y1=sc.nextInt();
	       y2=sc.nextInt();
	    dx=Math.abs(x2-x1);
	    dy=Math.abs(y2-y1);
	       r=dx-1;
	}
	public void paint(Graphics g)
	{
	             x=x1;
	             y=y1;
	             p0=((2*dy)-dx);
		do
		{
			g.drawLine((int)x+150,(int)y+150,(int)x2+150,(int)y2+150);
			
		       if(p0<0)
		       {
			x=x+1;
			y=y;
			p1=p0+(2*dy);
		       }
		       else
		      {
			if(p0>=0)
			{  
				x=x+1;
				y=y+1;
				p1=(p0+(2*dy)-(2*dx));
			}
		      }
		i++;
		}while(i==r);
		
	}
}