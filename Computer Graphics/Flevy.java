import java.awt.*;
import java.applet.*;
/*
<applet  code="Flevy.class"    width=1000   height=650 >
</applet>
*/
public class Flevy extends Applet implements Runnable
{
    Image img[] =new Image[8];
    Image currentImage;
    int i=0;
    Thread t;
     boolean b=true;
    
     public void init()        
    {
img[0]=getImage(getCodeBase(),"Flevy3.jpg");
img[1]=getImage(getCodeBase(),"Flevy4.jpg");
img[2]=getImage(getCodeBase(),"Flevy5.jpg");
img[3]=getImage(getCodeBase(),"Flevy6.jpg");
img[4]=getImage(getCodeBase(),"Flevy7.jpg");
img[5]=getImage(getCodeBase(),"Flevy8.jpg");
img[6]=getImage(getCodeBase(),"Flevy9.jpg");
img[7]=getImage(getCodeBase(),"Flevy10.jpg");

     } 

  public void start( )	
         {
            Thread t=new Thread(this);
            t.start( );
         }    
   public void run( )
     {
            while(b)
	{
	currentImage=img[i];
	i++;	          
 	if( i>7)
	{
                   i=0;
	}
	repaint( );
	try	
                   {
	          Thread.sleep(1000);
	   }
                 catch(InterruptedException e)
   	 {

	 }
      }
}
     public void paint(Graphics g )
     {
          g.drawImage(currentImage,10,100,this);
      }
}