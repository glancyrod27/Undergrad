import java.awt.*;
import java.applet.*;
/*
<applet code="Frame.class"  width=700 height=600>
</applet>
*/
public class Frame extends Applet implements Runnable
{	
    	
	
	Thread t=null;
	String  s=" Flevia  & Glancy ";
		
			
			public void init()
			{
				
				setForeground(Color.black);
				t=new Thread(this);
			}
			public void start()
			{
				t.start();
			}
			public void run()
			{
				/*for( ;k<10;k++)
				{
				  for(i=80;i<=530;)
					{
						try
					     	{
							x=i;
							repaint();
							Thread.sleep(6);
							i=i+90;
						}
						catch(InterruptedException e){}
					}
					
				}*/
				
			}
				public void paint(Graphics g)
				{
				
				try
				       {	
					
					g.drawRect(50,50,580,330);
					g.drawRect(160,160,350,100);
					g.setColor(Color.red);
					g.fillOval(70,70,60,60);

					g.setColor(Color.green);
					g.fillOval(170,70,60,60);
					
					g.setColor(Color.blue);
					g.fillOval(260,70,60,60);
					
					g.setColor(Color.yellow);
					g.fillOval(350,70,60,60);

					g.setColor(Color.red);
					g.fillOval(440,70,60,60);
					
					g.setColor(Color.green);
					g.fillOval(530,70,60,60); //hori1 
					
					g.setColor(Color.blue);
					g.fillOval(530,150,60,60);

					g.setColor(Color.yellow);
					g.fillOval(530,220,60,60);//verti2

					g.setColor(Color.red);
					g.fillOval(80,300,60,60);

					g.setColor(Color.green);
					g.fillOval(170,300,60,60);
					
					g.setColor(Color.blue);
					g.fillOval(260,300,60,60);
					
					g.setColor(Color.yellow);
					g.fillOval(350,300,60,60);

					g.setColor(Color.red);
					g.fillOval(440,300,60,60);
					
					g.setColor(Color.green);
					g.fillOval(530,300,60,60);//hori2
					
					g.setColor(Color.blue);
					g.fillOval(80,150,60,60);

					g.setColor(Color.yellow);
					g.fillOval(80,220,60,60);//verti1
					

				}
catch(InterruptedException e){}
}