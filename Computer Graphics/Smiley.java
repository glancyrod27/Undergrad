import java.awt.*;
import java.applet.*;
/*
<applet  code="Smiley.class"    width=1000   height=650 ></applet>*/
public class Smiley extends Applet
{
public  void paint(Graphics g )
{
g.setColor(Color.yellow);
g.fillOval(200,150,200,200);
g.setColor(Color.black);
g.fillOval(240,200,20,20);
g.fillOval(335,200,20,20);
g.drawLine(300,210,280,270);
g.drawLine(280,270,310,270);
g.setColor(Color.red);
g.fillArc(250,275,100,60,180,180);
}}
