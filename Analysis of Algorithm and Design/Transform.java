import java.util.*;
import java.awt.*;
import java.applet.*;

/*<applet code="Transform.class" height=600 width=600>
</applet>*/
public class Transform extends Applet
{
	Scanner sc=new Scanner(System.in);
	 	int x1,x2,x3,x4,y1,y2,y3,y4;
		int tx,ty,i,j,sx,sy,n;
		String u="translated";
		String v="scaled";	
	public void init()
	{
	     	 
	}
	public void paint(Graphics g)
	{	
		 g.drawLine(300,0,300,600);
		 g.drawLine(0,300,600,300);
		g.setColor(Color.red);
	     do
	        {
		System.out.println("1.Translate"+"              2.Scaling");
		System.out.println("Enter the choice");
		int ch=sc.nextInt();
		
		switch(ch)
		     {
		        case 1:
		           {	   
			System.out.println("Enter the co-ordinates of rectangle");
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			x3=sc.nextInt();
			y3=sc.nextInt();
			x4=sc.nextInt();
			y4=sc.nextInt();

			    System.out.println("Enter the till what distance you want to translate in x direction");
			    tx=sc.nextInt();
			    System.out.println("Enter the till what distance you want to translate in y direction");
		  	    ty=sc.nextInt();
			    Thread t=new Thread();
			    try
		   	     {
	  	     	          for(int i=0;i<2;i++)
	        	     		{
		       		    g.setColor(Color.black);
	   	      		    g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				    g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
				    g.drawLine((int)x3,(int)y3,(int)x4,(int)y4);
				    g.drawLine((int)x4,(int)y4,(int)x1,(int)y1);
	     	      		    t.sleep(500);
	        			    if(i==0)
	     			     {
	      			       	 g.setColor(Color.white);
	         		 	        	 g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				    	 g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
				  	 g.drawLine((int)x3,(int)y3,(int)x4,(int)y4);
				   	 g.drawLine((int)x4,(int)y4,(int)x1,(int)y1);
		      	     		 x1=x1+tx;
		 	      		 y1=y1+ty;
			     		 x2=x2+tx;
			     		 y2=y2+ty;
					 x3=x3+tx;
		 	      		 y3=y3+ty;
			     		 x4=x4+tx;
			     		 y4=y4+ty;
	     			   }
	      	  		}
				g.setColor(Color.red);  
	            			        
	         		 	        	g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				   	g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
				   	g.drawLine((int)x1,(int)y1,(int)x4,(int)y4);
				    	g.drawLine((int)x4,(int)y4,(int)x3,(int)y3);
					g.drawString(u,(int)x1,(int)y1,(int)x2,(int)y2);
	           		    }
			catch(Exception e)
			{}
		   	  break;
		        }
		case 2:
		   {
			System.out.println("Enter the co-ordinates of rectangle");
			x1=sc.nextInt();
			y1=sc.nextInt();
			x2=sc.nextInt();
			y2=sc.nextInt();
			x3=sc.nextInt();
			y3=sc.nextInt();
			x4=sc.nextInt();
			y4=sc.nextInt();

			System.out.println("Enter Scaling in x direction");
			sx=sc.nextInt();
			System.out.println("Enter scaling y direction");
			sy=sc.nextInt();
			Thread t2=new Thread();
			try
	   		{	
	  		       for(int j=0;j<2;j++)
	       		        {
	        			g.setColor(Color.black);
	        			  g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				    g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
				    g.drawLine((int)x1,(int)y1,(int)x4,(int)y4);
				    g.drawLine((int)x4,(int)y4,(int)x3,(int)y3);
	         			t2.sleep(500);
	        			if(j==0)
	     			 {
	       			      g.setColor(Color.white);  
	            			        
	         		 	        	g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				   	g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
				   	g.drawLine((int)x1,(int)y1,(int)x4,(int)y4);
				    	g.drawLine((int)x4,(int)y4,(int)x3,(int)y3);
	       				x1=x1*sx;
	       				y1=y1*sy;
	       				x2=x2*sx;
	      				y2=y2*sy;
					x3=x3*sx;
	       				y3=y3*sy;
	       				x4=x4*sx;
	      				y4=y4*sy;
					

	     			}
	      		         }
				g.setColor(Color.red);  
	            			        
	         		 	        	g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
				   	g.drawLine((int)x2,(int)y2,(int)x3,(int)y3);
				   	g.drawLine((int)x1,(int)y1,(int)x4,(int)y4);
				    	g.drawLine((int)x4,(int)y4,(int)x3,(int)y3);
					g.drawString(v,(int)x1,(int)y1,(int)x2,(int)y2);
	      		}
			catch(Exception e){}
		      break;
		}
		
	           }
		System.out.println("Do u wish to continue?.....If yes press 1 else 0");
		 n=sc.nextInt();
	   }while(n==1);
         }
}


	
	
	

