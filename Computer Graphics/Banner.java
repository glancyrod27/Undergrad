import java.awt.*;
import java.applet.*;
/*
<applet  code="Banner.class"    width=1000   height=650 >
</applet>
*/
public class Banner extends Applet implements Runnable
{
    String m="............Welcome to the world of Computer Graphics and Animations............";
    Font f=new Font("Script MT" , Font.BOLD ,  70);
	int x=30,y=30;
	Thread t;
	
    public  void init( )
   {
         setFont(f);
    }
    public void start( )	
         {
            t=new Thread(this);
            t.start( );
         }    
   public void run( )
     {
      


	 try	
          	 {
           		  for( ; ;)
		{
                 		  repaint();
			 Thread.sleep(190);
	 		 char ch=m.charAt(0);
			 m=m.substring(1,m.length());
			 m+=ch;
		}
         	 }
                 catch(InterruptedException e)
   	 {

	 }
	

      }
    
     public  void paint(Graphics g )
     { 
	g.setColor(Color.yellow);
	g.fillRect(0,100,1500,90);
	g.setColor(Color.red);
	g.drawRect(0,101,1500,90);
	g.setColor(Color.red);
          	g.drawString(m,80,170);
	
	

      }
}
/*output:
D:\

D:\javac Banner.java

D:\appletviewer Banner.java

*/
