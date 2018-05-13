import java.awt.*;
import java.applet.Applet;
/*
<applet code="CharGen.class" height=300 width=450>
</applet>
*/
public class CharGen extends Applet
{
	public void paint(Graphics g)
	{
       
int f[][]={
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
	};
int l[][]={
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
	};
int e[][]={
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
	};

int v[][]={
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{0,1,1,0,0,0,0,1,1,0},
			{0,0,1,1,0,0,1,1,0,0},
			{0,0,0,1,1,1,1,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
	};		
		
int i[][]={
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
	};
int a[][]={
			
			{0,0,0,0,1,1,0,0,0,0},
			{0,0,0,1,1,1,1,0,0,0},
			{0,0,1,1,0,0,1,1,0,0},
			{0,1,1,0,0,0,0,1,1,0},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
			{1,1,0,0,0,0,0,0,1,1},
	};
		for(int m=0;m<14;m++)
		{
			for(int n=0;n<10;n++)
			{
				if(f[m][n]==1)
				g.drawLine(100+n,100+m,100+n,100+m);
			}
		}
		for(int m=0;m<14;m++)
		{
			for(int n=0;n<10;n++)
			{
				if(l[m][n]==1)
				g.drawLine(140+n,100+m,140+n,100+m);
			}
		}
		for(int m=0;m<14;m++)
		{
			for(int n=0;n<10;n++)
			{
				if(e[m][n]==1)
				g.drawLine(180+n,100+m,180+n,100+m);
			}
		}
		for(int m=0;m<14;m++)
		{
			for(int n=0;n<10;n++)
			{
				if(v[m][n]==1)
				g.drawLine(220+n,100+m,220+n,100+m);
			}
		}
		for(int m=0;m<14;m++)
		{
			for(int n=0;n<10;n++)
			{
				if(i[m][n]==1)
				g.drawLine(260+n,100+m,260+n,100+m);
			}
		}
		  for(int m=0;m<14;m++)
		{
			for(int n=0;n<10;n++)
			{
				if(a[m][n]==1)
				g.drawLine(300+n,100+m,300+n,100+m);
			}
		}
	}
}

/*
output:
D:\Flevia 30>javac CharGen.java

D:\Flevia 30>appletviewer CharGen.java



