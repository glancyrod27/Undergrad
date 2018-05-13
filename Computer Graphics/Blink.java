import java.util.*;
import java.applet.Applet;
import java.awt.*;
/*<applet code=" Blink.class" height=500 width=500>
</applet>
*/
public class  Blink extends Applet
{
	int r;
	double p0;
	int x,y;
	
	public void init()
	{
	    Scanner sc=new Scanner(System.in);
	      
	       System.out.println("Enter the radius of circle");	
	       r=sc.nextInt();

	}
	public void draw(int p,Graphics g)
	{
		x=0;
	            	 y=r;
	             p0=(5/4)-(r);
		do{
			g.drawLine((int)-x+200,(int)y+200,(int)x+200,(int)-y+200);
			g.drawLine((int)x+200,(int)-y+200,(int)-x+200,(int)y+200);
			g.drawLine((int)-x+200,(int)-y+200,(int)x+200,(int)y+200);
			g.drawLine((int)x+200,(int)y+200,(int)-x+200,(int)-y+200);
			g.drawLine((int)-y+200,(int)x+200,(int)y+200,(int)-x+200);
			g.drawLine((int)y+200,(int)-x+200,(int)-y+200,(int)x+200);
			g.drawLine((int)-y+200,(int)-x+200,(int)y+200,(int)x+200);
			g.drawLine((int)y+200,(int)-x+200,(int)-y+200,(int)-x+200);

			if(p0<0)
		      	 {
				x=x+1;
				y=y;
				p0=p0+(2*(x))+1;
		      	 }
		      	 else
		      	{
				x=x+1;
				y=y-1;
				p0=p0+(2*x)-(2*y)+3;
			}
		      }while(x<y);
	}
	public void paint(Graphics g)
	{	int i,j;
		 
	    Thread t =new Thread();
	            
 	
	 try
	       {
		
		for( i=0;i<50;)	
		{
			g.setColor(Color.green);
			draw(i,g);
			t.sleep(300);
			g.setColor(Color.red);
			draw(i,g);
			t.sleep(300);
			
			i=i+5;
		}		
		
	       }	
	catch(InterruptedException e)
	   {
	   }

	}
}