import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code ="Balloon.class" width=700 height=200>
 </applet>*/
public class Balloon extends Applet implements Runnable
{
    	int x,y,k,p,n=1;
	   int a[],b[];
	Thread t=null;
    public void init()
    {
      x=500;
     y=60;
p=100;
	a=new int[3];
	b=new int[3];
	a[0]=500;b[0]=65;
	a[1]=530;b[1]=45;
	a[1]=530;b[1]=75;
        setBackground(Color.white);
        setForeground(Color.black);
         t=new Thread (this);
    }
     public void start()
	{
		t.start();
	}
     public void run()
	{
		for( ;k<1;k++)
		{
		     for(int i=500;i>=0;i--)
		         {
                         		   try
                           		 {
				x=i;
				repaint();
				Thread.sleep(6);
                           		 }
                            		catch(InterruptedException e){}
		         }
		}
	}
  
    public void draw1(Graphics g)
    {	
         try
        {
	g.setColor(Color.red);
	g.fillOval(30,30,50,70);
	g.setColor(Color.black);
	g.drawLine(40,100,70,100);
       	g.drawLine(55,100,55,150);

	g.setColor(Color.black);
                g.fillRect(x,y,50,10);
	
           if(x==p)
	{
		g.setColor(Color.white);
		g.fillOval(30,30,50,70);
		g.drawLine(40,100,70,100);
       		g.drawLine(55,100,55,150);
		
	}
        }
        catch(Exception e)
        {

        }
}
public void paint(Graphics g)
    {
	try
	{
          		  draw1(g);
		Thread.sleep(100);
	 }
       	 catch(Exception e)
       	 { }
    }
}


