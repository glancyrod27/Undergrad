import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code="BresCir.class" height=500 width=500>
</applet>
*/
public class  BresCir extends Applet
{
	int r,d0;
	int x,y;
Thread t=null;
	public void init()
	{
	    Scanner sc=new Scanner(System.in);
	    
	       System.out.println("Enter the radius of circle");	
	       r=sc.nextInt();
	 t=new Thread ();
    	}
     public void start()
	{
		t.start();
	}

public  void draw1(int x,int y,Graphics g)
{
			g.setColor(Color.green);
			g.drawLine((int)x+150,(int)y+150,(int)x+150,(int)y+150);
			g.drawLine((int)-x+150,(int)y+150,(int)x+150,(int)-y+150);
			g.setColor(Color.red);
			g.drawLine((int)-x+150,(int)-y+150,(int)-x+150,(int)-y+150);
			g.drawLine((int)-x+150,(int)-y+150,(int)x+150,(int)y+150);
			g.setColor(Color.green);
			g.drawLine((int)y+150,(int)x+150,(int)y+150,(int)x+150);
			g.drawLine((int)-y+150,(int)x+150,(int)y+150,(int)-x+150);
			g.setColor(Color.red);
			g.drawLine((int)-y+150,(int)-x+150,(int)-y+150,(int)-x+150);
			g.drawLine((int)-y+150,(int)-x+150,(int)y+150,(int)x+150);
}
public  void draw2(int x,int y,Graphics g)
{
			g.setColor(Color.red);
			g.drawLine((int)x+150,(int)y+150,(int)x+150,(int)y+150);
			g.drawLine((int)-x+150,(int)y+150,(int)x+150,(int)-y+150);
			g.setColor(Color.green);
			g.drawLine((int)-x+150,(int)-y+150,(int)-x+150,(int)-y+150);
			g.drawLine((int)-x+150,(int)-y+150,(int)x+150,(int)y+150);
			g.setColor(Color.red);
			g.drawLine((int)y+150,(int)x+150,(int)y+150,(int)x+150);
			g.drawLine((int)-y+150,(int)x+150,(int)y+150,(int)-x+150);
			g.setColor(Color.green);
			g.drawLine((int)-y+150,(int)-x+150,(int)-y+150,(int)-x+150);
			g.drawLine((int)-y+150,(int)-x+150,(int)y+150,(int)x+150);
}
	public void paint(Graphics g)
	{
		try
		{
	      	       x=0;
	         	    y=r;
	          	   d0=3-(2*r);
	
			do
			{	
				draw1(x,y,g);
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
			
				Thread.sleep(3);
				
				draw2(x,y,g);
					
				Thread.sleep(3);
				
				repaint();		
		}
		catch(Exception e){}
	}
}
