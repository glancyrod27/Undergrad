import java.awt.*;

import java.awt.event.*;

import java.util.*;

public class Cprac5 extends Frame

{

	public static void main (String args[]) {new Cprac5();}

	Cprac5()

	{

	super("Cprac5");

	addWindowListener(new WindowAdapter()

		{

		public void windowClosing (WindowEvent e){System.exit(0);}

		});

		setSize(700,700);

		add("Center",new CvCprac5());
		show();

	}

}

class CvCprac5 extends Canvas


	{

	public void paint(Graphics g)

	{

		Dimension d=getSize();

		
		double p;

                int k=0,t=0,sd=0;

		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the center");

		//int xc=sc.nextInt();

		//int yc=sc.nextInt();

		int xc=325,yc=325;

		//System.out.println("Enter the radius");


		//double rt=sc.nextDouble();
 
               double rt=20;

                while(sd!=1)
{


                for(int j=0;j<18;j++)

                {

                        if(k==360)
 
                           k=0;

                    g.setColor(Color.black);

                    double r=rt+k;

		int X=0,Y=(int)r;

		p=(1.25-r);
	
	do{
	
		g.drawLine(X+xc,Y+yc,X+xc,Y+yc);

			g.drawLine(-X+xc,Y+yc,-X+xc,Y+yc);
	
		g.drawLine(X+xc,-Y+yc,X+xc,-Y+yc);

			g.drawLine(-X+xc,-Y+yc,-X+xc,-Y+yc);

			g.drawLine(Y+yc,X+xc,Y+yc,X+xc);
					g.drawLine(-Y+yc,X+xc,-Y+yc,X+xc);


			g.drawLine(Y+yc,-X+xc,Y+yc,-X+xc);

			g.drawLine(-Y+yc,-X+xc,-Y+yc,-X+xc);
			if(p<0.0)

				p=p+2*X+3;


			else

	{
				p=p+2*X-2*Y+5;

	
			Y=Y-1;

	
			}

			X++;
		}while(X<=Y);

                 System.out.println("delay");
 
                for(double as=0;as<100000081;as++){t++;}
 
               System.out.println("finish");
 
               g.setColor(Color.white);

                g.fillRect((int)(xc-r),(int)(xc-r),(int)(2*r+10),(int)(2*r+10));


                k+=20;


	}
	}
	
}


}
