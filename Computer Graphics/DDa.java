/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ddaline;

/**
 *
 * @author User
 */
import java.util.*;
import java.awt.*;
import java.applet.Applet;
/*<applet code="DDa.class" width=800 height=800>
</applet>
*/
public class DDa extends Applet
{
     int n;
      double stx,sty,x1,x2,y1,y2,x,y,e;
    public void draw(double r,Graphics g)
    {

       stx=0;
       sty=r;
       x1=stx;
       y1=sty;
       n=0;
               do
               {
                   n++;
               }while(Math.pow(2,(n-1))>r||Math.pow(2,(n))<r);
       e=Math.pow(2,(-n));
       do
       {
           x2=x1+(e*y1);
           y2=y1-(e*x2);
           g.drawLine((int)x2+150,(int)y2+150,(int)x2+150,(int)y2+150);
           g.drawLine((int)-x2+150,(int)y2+150,(int)-x2+150,(int)y2+150);
           g.drawLine((int)x2+150,(int)-y2+150,(int)x2+150,(int)-y2+150);
           g.drawLine((int)-x2+150,(int)-y2+150,(int)-x2+150,(int)-y2+150);
           x1=x2;
           y1=y2;
       }while((y1-sty)<e||(stx-x1)>e);

    }
    public void paint(Graphics g)
    {
        draw(100.0,g);
       /* draw(60.0,g);
        draw(30.0,g);*/
    }

}
