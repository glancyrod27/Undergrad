import java.util.*;
import java.awt.*;
import java.applet.*;
/*<applet code="Clneil.class" WIDTH=500 HEIGHT=500>
 </applet>
*/
public class Clneil extends Applet implements Runnable
{ 
private int y,dz,dy,z;

public void start()
{ 
    y=280;
    z=200;
     dz=3;
     dy=1;
Thread t=new Thread(this);
t.start();
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.fillOval(100,100,200,200);
g.setColor(Color.black);
g.fillOval(190,190,20,20);
g.drawString("12",195,120);
g.drawString("06",195,290);
g.drawString("03",280,205);
g.drawString("09",105,205);
g.drawLine(200 ,200, y, z);
g.drawLine(200, 200,200,130);
}
public void run()
{
for(int i=0;i<25;i++)
{
y-=dy+2;
z+=dz;
repaint();
try
{
Thread.sleep(800);

}
catch(Exception e)
{

}
}

}
}