import java.io.*;
import java.math.*;

class Bayes
{
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	int i;
	double y1,y2;
	double c=0.0,c1,c3=0.0,c4,c5=0.0,c6;
	String a[][]={{"r","m","n","y"},{"s","m","n","y"},{"o","m","h","y"},{"o","h","n","y"},{"s","m","h","n"},{"r","m","h","n"}};
	void start1() throws Exception
	{
		
		System.out.println("Enter the conditions to see whether can play or not");
		System.out.println("Enter outlook : ");
		String x1=sc.readLine();
		System.out.println("Enter temperature : ");
		String x2=sc.readLine();
		System.out.println("Enter humidity : ");
		String x3=sc.readLine();
		entropy();
		
		double a1=atto(x1,0);
		System.out.println("P("+x1+"/y) = " +a1);
		double a2=atto(x2,1);
		System.out.println("P("+x2+"/y) = " +a2);
		double a3=atto(x3,2);
		System.out.println("P("+x3+"/y) = " +a3);
		double b1=atto1(x1,0);
		System.out.println("P("+x1+"/n) = " +b1);
		double b2=atto1(x2,1);
		System.out.println("P("+x2+"/n) = " +b2);
		double b3=atto1(x3,2);
		System.out.println("P("+x3+"/n) = " +b3);

		double p1=(a1*a2*a3);
		System.out.println("P(X/y) = " +p1);

		double p2=(b1*b2*b3);
		System.out.println("P(X/n) = " +p2);

		p1=(p1*y1);
		System.out.println("P(y/X) = " +p1);

		p2=(p2*y2);
		System.out.println("P(n/X) = " +p2);


		if(p1>p2)
		{
			System.out.println("You Can Play");
		}
		else
		{
			System.out.println("You Can't Play");
		}
	}

	void entropy()
	{
		for(i=0;i<6;i++)
		{
			if(a[i][3].equals("y"))
			c++;
		}
		c1=6-c;
		y1=(c/6.0);
		y2=(c1/6.0);
		System.out.println("P(y):"+ y1);
		System.out.println("P(n):"+ y2);
	}
	double atto(String at,int z)
	{
		c3=0.0;
		for(i=0;i<6;i++)
		{
			if(a[i][z].equals(at))
			{
				if(a[i][3].equals("y"))
					c3++;
			}
		}
		return((c3/c));
	}
	double atto1(String at,int z)
	{
		c4=0.0;
		for(i=0;i<6;i++)
		{
			if(a[i][z].equals(at))
			{
				if(a[i][3].equals("n"))
					c4++;
			}	
		}
		return((c4/c1));
	}
}
class Bayesmain
{
	public static void main(String args[]) throws Exception
	{
		Bayes d=new Bayes();
		d.start1();
	}
}

/*Output:

D:\New folder (5)\Study\SEM 6\DWM>javac Bayesmain.java

D:\New folder (5)\Study\SEM 6\DWM>java Bayesmain
Enter the conditions to see whether can play or not
Enter outlook :
r
Enter temperature :
m
Enter humidity :
h
P(y):0.6666666666666666
P(n):0.3333333333333333
P(r/y) = 0.25
P(m/y) = 0.75
P(h/y) = 0.25
P(r/n) = 0.5
P(m/n) = 1.0
P(h/n) = 1.0
P(X/y) = 0.046875
P(X/n) = 0.5
P(y/X) = 0.03125
P(n/X) = 0.16666666666666666
You Can't Play
*/