import java.awt.*;
import java.applet.*;
import java.util.*;
	
/*

<applet code="Bezeir.class" width=500 height=500>
</applet>

*/

public class Bezeir extends Applet
{
	Scanner in = new Scanner(System.in);
	
	double ctrl[][]=new double[4][2];

	public void init()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the (x,y) co-ordinates of point "+(i+1));
			ctrl[i][0]=in.nextDouble();
			ctrl[i][1]=in.nextDouble();
		}
		
	}

	public void paint(Graphics g)
	{
		bezeir(ctrl[1][0],ctrl[1][1],ctrl[2][0],ctrl[2][1],ctrl[3][0],ctrl[3][1],8,g);
	}
	
	public void bezeir(double xb,double yb,double xc,double yc,double xd,double yd,int n,Graphics g)
	{
		double xab,yab,xbc,ybc,xcd,ycd;
		double xabc,yabc,xbcd,ybcd;
		double xabcd,yabcd;

		if(n==0)
		{
			line1(xb,yb,g);
			line1(xc,yc,g);
			line1(xd,yd,g);
		}
		else
		{
			xab  = (ctrl[0][0] + xb)/2;
			yab  = (ctrl[0][1] + yb)/2;
			xbc  = (xb+xc)/2;
			ybc  = (yb+yc)/2;
			xcd  = (xc+xd)/2;
			ycd  = (yc+yd)/2;
			xabc = (xab+xbc)/2;
			yabc = (yab+ybc)/2;
			xbcd = (xbc+xcd)/2;
			ybcd = (ybc+ycd)/2;
			xabcd= (xabc+xbcd)/2;
			yabcd= (yabc+ybcd)/2;

			n=n-1;

			bezeir(xab,yab,xabc,yabc,xabcd,yabcd,n,g);
			bezeir(xbcd,ybcd,xcd,ycd,xd,yd,n,g);
		}
	}

	public void line1(double x2,double y2,Graphics g)
	{
		g.drawLine((int)ctrl[0][0],(int)ctrl[0][1],(int)x2,(int)y2);
		ctrl[0][0]=x2;
		ctrl[0][1]=y2;
	}

	
}
		
			