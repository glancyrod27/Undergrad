import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Cprac1 extends Frame
{
	public static void main (String args[]) {new Cprac1();}
	Cprac1()
	{
	super("Cprac1");
	addWindowListener(new WindowAdapter()
		{
		public void windowClosing (WindowEvent e){System.exit(0);}
		});
		setSize(200,100);
		add("Center",new CvCprac1());
		show();
	}
}
class CvCprac1 extends Canvas
	{
	public void paint(Graphics g)
	{
		Dimension d=getSize();
		Scanner sc=new Scanner(System.in);
		int len,i,j;
		System.out.println("Enter the total no.co-ordinates");
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		System.out.println("Enter the co-ordinates");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter the last co-ordinates");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int dx=Math.abs(x2-x1);
		int dy=Math.abs(y2-y1);
		if(dx>=dy)
		
		len=dx;
		else
		len=dy;

		dx=(x2-x1)/len;
		dy=(y2-y1)/len;
		double x=x1+(0.5*dx);
		double y=y1+(0.5*dy);
		for(j=1;j<=len;j++)
		  {
		    
		    x=x+dx;
		    y=y+dy;
		    g.drawLine((int)x,(int) y,0,0);
		}
	}
	}
	}

