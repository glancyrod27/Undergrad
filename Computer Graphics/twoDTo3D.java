import java.applet.Applet;
import java.awt.*;
import java.util.Scanner;
import java.awt.color.*;


/*
<applet code="twoDTo3D.class" height=500 width=700>
</applet>
*/

public class twoDTo3D extends Applet{
	Point cube[];
	Scanner s=new Scanner(System.in);
	class Point {
		int x,y,z;
		Point(int x,int y,int z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
	}	
	public void init(){
		setSize(500,500);
		cube=new Point[]{new Point(0,0,0),new Point(100,0,0),new Point(100,100,0),
            new Point(0,100,0),new Point(0,0,100),new Point(100,0,100),
            new Point(100,100,100),new Point(0,100,100)};
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		drawCube(g);
		g.setColor(Color.red);
		g.drawLine(200, 200, 200, 00);//Y Axis
g.drawLine(200, 200, 200+(int)(100*Math.cos(0.46365)), 200+(int)(100*Math.sin(0.46365)));//X Axis
g.drawLine(200, 200, 200-(int)(100*Math.cos(0.46365)),   200+(int)(100*Math.sin(0.46365)));//z Axis
 System.out.print("1.Translate, 2.Rotate ,3.Scale 4.Reflection");
 int c=s.nextInt();
               switch(c){
        case 1: System.out.print("TRANSLATE");
        	int tx=s.nextInt();
            	int ty=s.nextInt();
          		 	int tz=s.nextInt();
            	translate(cube,tx,ty,tz);
            	break;
        case 2:System.out.print("ROTATE axis=1 X axis=2 Y axis =3 Z ");
        			double angle=s.nextDouble();
        		int axis=s.nextInt();
        		rotate(cube, angle, axis);
        		break;
        case 3: System.out.print("SCALE");
        			double sx=s.nextDouble();
        		double sy=s.nextDouble();
        			double sz=s.nextDouble();
        			scale(cube,sx,sy,sz);
        			break;
        case 4: System.out.print("REFLECT");
				int rx=s.nextInt();
				int ry=s.nextInt();
				int rz=s.nextInt();
        		reflect(cube,rx,ry,rz);
        }
        update(g);
	}

	void drawCube(Graphics g){
		drawIsomericLine(g,cube[0],cube[1]);
		drawIsomericLine(g,cube[1],cube[2]);
		drawIsomericLine(g,cube[2],cube[3]);
		drawIsomericLine(g,cube[3],cube[0]);
		drawIsomericLine(g,cube[4],cube[5]);
		drawIsomericLine(g,cube[5],cube[6]);
		drawIsomericLine(g,cube[6],cube[7]);
		drawIsomericLine(g,cube[7],cube[4]);
		drawIsomericLine(g,cube[0],cube[4]);
		drawIsomericLine(g,cube[1],cube[5]);
		drawIsomericLine(g,cube[2],cube[6]);
		drawIsomericLine(g,cube[3],cube[7]);
	}
	
	void drawIsomericLine(Graphics g,Point p1,Point p2){
		int x1=(int) ((p1.x-p1.z)*Math.cos(0.46365));
		int y1=(int) (p1.y+(p1.x+p1.z)*Math.sin(0.46365));
		int x2=(int) ((p2.x-p2.z)*Math.cos(0.46365));
		int y2=(int) (p2.y+(p2.x+p2.z)*Math.sin(0.46365));
		g.drawLine(200+x1,100+y1,200+x2,100+y2);
	}
	
    public void translate(Point[] points,double x,double y,double z){
       double matrix[][]=new double[][] {new double[]{1,0,0,x},new double[]{0,1,0,y},
new double[]{0,0,1,z},new double[]{0,0,0,1}};
        transformer(points,matrix);
    }
   	    public void scale (Point[] points,double sx,double sy,double sz){
       double matrix[][]=new double[][] {new double[]{sx,0,0,0},new double[]{0,sy,0,0},
new double[]{0,0,sz,0},new double[]{0,0,0,1}};
       transformer(points,matrix);
    }
    public void rotate(Point[] points, double angle,int axis){
       double sine=Math.sin(Math.toRadians(angle));
       double cosine=Math.cos(Math.toRadians(angle));
       double matrix[][];
       if(axis==1)   matrix=new double[][] {new double[]{1,0,0,0},new double[]{0,cosine,
- sine,0},new double[]{0,sine,cosine,0},new double[]{0,0,0,1}};
       else if(axis==3) matrix=new double[][] {new double[]{cosine,-sine,0,0},
new double[]{sine,cosine,0,0},new double[]{0,0,1,0},new double[]{0,0,0,1}};
       else
    	   matrix=new double[][] {new double[]{cosine,0,sine,0},new double[]{0,1,0,0},
 new double[]{-sine,0,cosine,0},new double[]{0,0,0,1}};
       transformer(points,matrix);
    }
    public void reflect(Point[] points,int isX,int isY,int isZ){
        double matrix[][]=new double[][] {new double[]{isX,0,0,0},new double[]{0,isY,0,0},
new double[]{0,0,isZ,0},new double[]{0,0,0,1}};
        transformer(points,matrix);
    }
    void transformer(Point[] points,double[][] matrix){
    	for(int i=0;i<8;i++)
    		points[i]=transform(points[i],matrix);
    } 
    public Point transform(Point point,double[][] transform){
    	double[] points=new double[]{point.x,point.y,point.z,1};
        int[] answer=new int[points.length];
        for(int i=0;i<4;i++){
            answer[i]=0;
            for(int j=0;j<4;j++){
                answer[i]+=(points[j]*transform[i][j]);
            }
        }
        Point a=new Point(answer[0],answer[1],answer[2]);
        return a;
    }
}
