import java.awt.*;
import java.applet.*;
import java.util.*;
	
/*

<applet code="Bezeir1.class" width=500 height=500>
</applet>

*/

public class Bezeir1 extends Applet
{
	Scanner in = new Scanner(System.in);
	
	double ctrl[][]=new double[7][2];

	public void init()
	{
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter the (x,y) co-ordinates of point "+(i+1));
			ctrl[i][0]=in.nextDouble();
			ctrl[i][1]=in.nextDouble();
			
		}
		
	}

	public void paint(Graphics g)
	{	
		  bezeir(ctrl[1][0],ctrl[1][1],ctrl[2][0],ctrl[2][1],ctrl[3][0],ctrl[3][1],ctrl[4][0],ctrl[4][1],ctrl[5][0],ctrl[5][1],ctrl[6][0],ctrl[6][1],14,g);
	}
	
	public void bezeir(double xb,double yb,double xc,double yc,double xd,double yd,double xe,double ye,double xf,double yf,double xg,double yg,int n,Graphics g)
	{
		double xab,yab,xbc,ybc, xcd,ycd,xde,yde,xef,yef,xfg,yfg;
		double xabc,yabc,xbcd,ybcd,xcde,ycde,xdef,ydef,xefg,yefg;
		double xabcd,yabcd,xbcde,ybcde,xcdef,ycdef,xdefg,ydefg;
		double xabcde,yabcde,xbcdef,ybcdef,xcdefg,ycdefg;
		double xabcdef,yabcdef,xbcdefg,ybcdefg;
		double xabcdefg,yabcdefg;

		if(n==0)
		{
			line1(xb,yb,g);
			line1(xc,yc,g);
			line1(xd,yd,g);
			line1(xe,ye,g);
			line1(xf,yf,g);
			line1(xg,yg,g);
		}
		else
		{
			xab  = (ctrl[0][0] + xb)/2;
			yab  = (ctrl[0][1] + yb)/2;
			xbc  = (xb+xc)/2;
			ybc  = (yb+yc)/2;
			xcd  = (xc+xd)/2;
			ycd  = (yc+yd)/2;
			xde  = (xd+xe)/2;
			yde  = (yd+ye)/2;
			xef  = (xe+xf)/2;
			yef  = (ye+yf)/2;
			xfg = (xf+xg)/2;
			yfg  = (yf+yg)/2;

			xabc = (xab+xbc)/2;
			yabc = (yab+ybc)/2;
			xbcd = (xbc+xcd)/2;
			ybcd = (ybc+ycd)/2;
			xcde = (xcd+xde)/2;
			ycde = (ycd+yde)/2;
			xdef = (xde+xef)/2;
			ydef = (yde+yef)/2;
			xefg = (xef+xfg)/2;
			yefg = (yef+yfg)/2;

			xabcd= (xabc+xbcd)/2;
			yabcd= (yabc+ybcd)/2;
			xbcde = (xbcd+xcde)/2;
			ybcde = (ybcd+ycde)/2;
			xcdef = (xcde+xdef)/2;
			ycdef = (ycde+ydef)/2;
			xdefg = (xdef+xefg)/2;
			ydefg= (ydef+yefg)/2;

			xabcde= (xabcd+xbcde)/2;
			yabcde= (yabcd+ybcde)/2;
			xbcdef = (xbcde+xcdef)/2;
			ybcdef = (ybcde+ycdef)/2;
			xcdefg= (xcdef+xdefg)/2;
			ycdefg = (ycdef+ydefg)/2;

			xabcdef= (xabcde+xbcdef)/2;
			yabcdef= (yabcde+ybcdef)/2;
			xbcdefg = (xbcdef+xcdefg)/2;
			ybcdefg = (ybcdef+ycdefg)/2;

			xabcdefg= (xabcdef+xbcdefg)/2;
			yabcdefg= (yabcdef+ybcdefg)/2;

			n=n-1;

			bezeir(xab,yab,xabc,yabc,xabcd,yabcd,xabcde,yabcde,xabcdef,yabcdef,xabcdefg,yabcdefg,n,g);
			bezeir(xbcdefg,ybcdefg,xcdefg,ycdefg,xdefg,ydefg,xefg,yefg,xfg,yfg,xg,yg,n,g);
		}
	}

	public void line1(double x2,double y2,Graphics g)
	{
		
		for(int i=0;i<4;i++)
		{
			g.drawLine((int)ctrl[0][0]+i,(int)ctrl[0][1]+i,(int)x2+i,(int)y2+i);
			ctrl[0][0]=x2;
			ctrl[0][1]=y2;
		}
	}

	
}