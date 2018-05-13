import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="Circle.class" height=500 width=500>
</applet>
*/
public class  Circle extend Applet
{
	int x1,y1,r,p0,x,y;
	int dx,dy,pk;
	public void init()
	{
	    Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the x-coordinate");
	       xk=sc.nextInt();
	       System.out.println("Enter the x-coordinate");
	       yk=sc.nextInt();
	       System.out.println("Enter the radius of circle");	
	       r=sc.nextInt();
	}
	public void paint(Graphics g)
	{
	             x=0;
	             y=r;
	             p0=(5/4)-r;
		do
		{
			g.drawLine((int)x,(int)y,(int)x,(int)y);
		       if(p0<0)
		       {
			xk=xk+1;
			yk=yk;
			pk=p0+(2*xk)+1;
		       }
		       else
		      {
			xk=xk+1;
			yk=yk-1;
			pk=p0+(2*xk)-(2*yk)+3;
		       }
		xk=xk+1;
		}
while(x<y);	
	}
}