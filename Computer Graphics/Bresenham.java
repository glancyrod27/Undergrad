import java.util.*;
import java.awt.*;
import java.applet.*;
import java.math.*;
/*<applet code="Bresenham.class" height=400 width=400>
</applet>*/
public class Bresenham extends Applet
{	
	float x1,x2,y1,y2,dx,dy,Pk;
	double x,y;
	int X,Y;
	public void init()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter x co-ordinate for start point");
		x1=input.nextFloat();
		System.out.println("Enter y co-ordinate for start point");
		y1=input.nextFloat();
		System.out.println("Enter x co-ordinate for end point");
		x2=input.nextFloat();
		System.out.println("Enter y co-ordinate for end point");
		y2=input.nextFloat();
		dx=Math.abs(x2-x1);
		dy=Math.abs(y2-y1);
		X=(int)x1;
		Y=(int)y1;
		Pk=2*dy-dx;		
	}
	public void paint(Graphics g)
	{
		for(int i=0;i<=dx;i++)
		{
			g.drawLine(X,Y,X,Y);
			if(Pk<0)
			{
				X=X+1;
				Pk=Pk+2*dy;
			}
			else if(Pk>=0)
			{
				X=X+1;
				Y=Y+1;
				Pk=Pk+2*dy-2*dx;
			}
		}
	}				
}
