import java.io.*;
import java.util.*;
import java.applet.*;
import java.awt.*;

/*<applet code=" DTransformation.class" width=500 height=500>
</applet>
*/

public class DTransformation extends Applet
{
	public void init()
	{	}
	public void paint(Graphics g)
	{
		int n;
		int x[]=new int[10];
		int y[]=new int[10];
		float xo[]=new float[10];
		float yo[]=new float[10];
		double pi=3.14;
		int ch,tx,ty,sx,sy,ang,i,vch,gl;
		String c;
		Scanner sc = new Scanner(System.in);
		do
		{	
			System.out.print("Enter the no. of vertices : " );
			n = sc.nextInt();
			for(i=0;i<n;i++)
			{
				System.out.println("Enter co-ordinates for "+(i+1)+": ");
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			for(i=0;i<n-1;i++)
			g.drawLine(x[i],y[i],x[i+1],y[i+1]);
			g.drawLine(x[i],y[i],x[0],y[0]);

			System.out.println("1.Translate"+"\n2.Scale"+"\n3.Rotate"+"\n4.Reflect");
				System.out.println("Enter the choice");
			ch=sc.nextInt();	
			switch(ch)
			{	
				case 1 :
					System.out.print("Enter <Tx> & <Ty> value : ");
					tx=sc.nextInt();
					ty=sc.nextInt();
					for (i=0;i<=n;i++)
					{
						xo[i]=x[i]+tx;
						yo[i]=y[i]+ty;
					}	
					break;
				case 2 :
					System.out.print("Enter <Sx>  & <Sy>value : ");
					sx=sc.nextInt();					
					sy=sc.nextInt();
					System.out.print("Enter Reference Vertex : ");
					vch=sc.nextInt();
					for(i=0;i<=n;i++)
					{
						xo[i]=(x[i]-x[vch-1])*sx+x[vch-1];
						yo[i]=(y[i]-y[vch-1])*sy+y[vch-1];
					}
					break;
				case 3 :
					double t;
					System.out.print("Enter Angle : ");
					t=sc.nextInt();
					System.out.print("Enter Reference Vertex : ");
					vch=sc.nextInt();
					t=t*(pi/180);
					for(i=0;i<n;i++)
					{
						xo[i]=((x[i]-x[vch-1])*(float)Math.cos(t))-((y[i]-y[vch-1])*(float)Math.sin(t))+x[vch-1];
						yo[i]=((x[i]-x[vch-1])*(float)Math.sin(t))-((y[i]-y[vch-1])*(float)Math.cos(t))+y[vch-1];
					}
					break;
				case 4:
					System.out.println("if abt x axis enter 1 and for y axis enter2");
					gl=sc.nextInt();
					if(gl==1)
					{
						for(i=0;i<n;i++)
						{
							xo[i]=x[i];
							yo[i]=y[i]+250;
						}
					}
					if(gl==2)
					{
						for(i=0;i<n;i++)
						{
							xo[i]=x[i]-250;
							yo[i]=y[i];
						}
					}
					break;
				default:
					System.out.println("wrong entry");
					break;
				}
				for(i=0;i<n-1;i++)
			
				g.drawLine((int)xo[i],(int)yo[i],(int)xo[i+1],(int)yo[i+1]);
				g.drawLine((int)xo[i],(int)yo[i],(int)xo[0],(int)yo[0]);												System.out.print("Do you wanna coninue? y/n : ") ;
				c = sc.next();
				repaint();
		}
		while(c.equals("y")||c.equals("Y"));
	}
}


