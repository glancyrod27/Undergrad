import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="BCircle.class" height=500 width=500>
</applet>
*/
public class  BCircle extends Applet
{
	int r,d0;
	int x,y;
	public void init()
	{
	    Scanner sc=new Scanner(System.in);
	    
	       System.out.println("Enter the radius of circle");	
	       r=sc.nextInt();

	}
	public void paint(Graphics g)
	{
	             x=0;
	             y=r;
	             d0=3-(2*r);
		do
		{	
			g.setColor(Color.green);
			g.drawLine((int)x+200,(int)y+200,(int)x+200,(int)y+200);
			g.drawLine((int)-x+200,(int)y+200,(int)x+200,(int)-y+200);

			g.setColor(Color.yellow);
			g.drawLine((int)-x+200,(int)-y+200,(int)-x+200,(int)-y+200);
			g.drawLine((int)-x+200,(int)-y+200,(int)x+200,(int)y+200);

			g.setColor(Color.yellow);
			g.drawLine((int)y+200,(int)x+200,(int)y+200,(int)x+200);
			g.drawLine((int)-y+200,(int)x+200,(int)y+200,(int)-x+200);

			g.setColor(Color.green);
			g.drawLine((int)-y+200,(int)-x+200,(int)-y+200,(int)-x+200);
			g.drawLine((int)-y+200,(int)-x+200,(int)y+200,(int)x+200);

			g.setColor(Color.green);
			g.drawLine((int)x+200,(int)-y+200,(int)x+200,(int)-y+200);
			g.drawLine((int)x+200,(int)y+200,(int)-x+200,(int)-y+200);

			g.setColor(Color.yellow);
			g.drawLine((int)-x+200,(int)y+200,(int)-x+200,(int)y+200);
			g.drawLine((int)x+200,(int)-y+200,(int)-x+200,(int)y+200);

			g.setColor(Color.yellow);	
			g.drawLine((int)-y+200,(int)x+200,(int)-y+200,(int)x+200);
			g.drawLine((int)y+200,(int)x+200,(int)-y+200,(int)-x+200);

			g.setColor(Color.green);
			g.drawLine((int)y+200,(int)-x+200,(int)y+200,(int)-x+200);
			g.drawLine((int)y+200,(int)-x+200,(int)-y+200,(int)x+200);
			if(d0<0)
		       {
			
			d0=d0+(4*x)+6;
		       }
		       else
		      {
			
			d0=d0+(4*(x-y))+10;
			y=y-1;
		       }
		x=x+1;
		}while(x<y);	

	}
}

