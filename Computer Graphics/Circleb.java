import java.awt.*;
import java.applet.*;
import java.io.*;
import java.util.*;

/*<applet code="Circleb.class" height=400 width=700></applet>*/

public class Circleb extends Applet
{
	Scanner sc=new Scanner(System.in);
	float xc,yc,r,di;
	float xi,yi;
			
	public void init()
 		{
		System.out.println("Enter the center co-ordinates for xc and yc:");
		xc=sc.nextInt();
		yc=sc.nextInt();
		System.out.println("Enter the radius:");
		r=sc.nextInt();
		}
	
	public void paint(Graphics g)
		{
		 di=(3-2*r);
		xi=0;
		yi=r;
		
		
		do
		{
		g.drawLine((int)(xi+xc),(int)(yi+yc),(int)(xi+xc),(int)(yi+yc));
		g.drawLine((int)(xi+xc),(int)(-yi+yc),(int)(xi+xc),(int)(-yi+yc));
		g.drawLine((int)(-xi+xc),(int)(yi+yc),(int)(-xi+xc),(int)(yi+yc));
		g.drawLine((int)(-xi+xc),(int)(-yi+yc),(int)(-xi+xc),(int)(-yi+yc));
		g.drawLine((int)(yi+yc),(int)(xi+xc),(int)(yi+yc),(int)(xi+xc));
		g.drawLine((int)(-yi+yc),(int)(xi+xc),(int)(-yi+yc),(int)(xi+xc));
		g.drawLine((int)(yi+yc),(int)(-xi+xc),(int)(yi+yc),(int)(-xi+xc));
		g.drawLine((int)(-yi+yc),(int)(-xi+xc),(int)(-yi+yc),(int)(-xi+xc));

		if(di<0)		
		  {
		   di=(di+(4*xi)+6);
		   xi=xi+1;
		    
		  }
		else
		   {
		   di=di+4*(xi-yi)+10;
		   yi=yi-1;
		   xi=xi+1; 
		   
		   }}
		while(xi<=yi);
	         
                }
}
	
