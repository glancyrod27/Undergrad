import java.util.*;
import java.math.*;
class ID3
{
	int i;
	double c=0.0,c1,c3=0.0,c4,c5=0.0,c6;;
	char a[][]={{'r','m','n','y'},{'s','m','n','y'},{'o','m','h','y'},{'o','h','n','y'},{'s','m','h','n'},{'r','m','h','n'}};
	void display()
	{ 
		System.out.println("Outlook      Temperature       Humidity       Play");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t\t");
			}
			System.out.println();
		}
	}
	double entropy()
	{
		for(i=0;i<6;i++)
		{
			if(a[i][3]=='y')
				c++;
		}
		c1=6-c;
		//information gain
		double i1=(c/6.0)*((Math.log(c/6.0))/(Math.log(2)));
		double i2=(c1/6.0)*((Math.log(c1/6.0))/(Math.log(2)));
		double id=-(i1+i2);
		System.out.println("Entropy:"+id);
		return(id);
	}

	double atto(char at,int z)
	{
		c3=0.0;
		c6=0.0;
		c5=0.0;
		for(i=0;i<6;i++)
		{
			if(a[i][z]==at)
			{
				c3++;
				if(a[i][3]=='y')
					c5++;
			}
		}
		c6=c3-c5;
		if(c5==0)
			c5=c3;
		if(c6==0)
			c6=c3;
		double r1=(c5/c3)*((Math.log(c5/c3))/(Math.log(2)));
		double r2=(c6/c3)*((Math.log(c6/c3))/(Math.log(2)));
		double r=-(c3/6.0)*(r1+r2);
		return(r);
	}

	void max(double outlook,double temperature,double hum)
	{	
		if(hum>temperature)
		{
			if(hum>outlook)
			{
				System.out.println("max is humidity:"+hum);
			}
			else
			{
				System.out.println("max is outlook"+outlook);
			}
		}
		else
		{
			System.out.println("max is temperature:"+temperature);
		}
	}

}


class ID3main
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		ID3 d=new ID3();
		d.display();
		double id=d.entropy();
		double a1=d.atto('r',0);
		double a2=d.atto('s',0);
		double a3=d.atto('o',0);
		double outlook=id-(a1+a2+a3);
		System.out.println("outlook"+outlook);
		
		double b1=d.atto('h',1);
		double b2=d.atto('m',1);
		double temperature=id-(b1+b2);
		System.out.println("temperature:"+temperature);

		double c1=d.atto('n',2);
		double c2=d.atto('h',2);
		double humidity=id-(c1+c2);
		System.out.println("humidity:"+humidity);

		d.max(outlook,temperature,humidity);
	}
}


/*Output:


D:\New folder (5)\Study\SEM 6\DWM>javac ID3main.java

D:\New folder (5)\Study\SEM 6\DWM>java ID3main
Outlook      Temperature       Humidity       Play
r               m               n               y
s               m               n               y
o               m               h               y
o               h               n               y
s               m               h               n
r               m               h               n
Entropy:0.9182958340544896
outlook0.2516291673878229
temperature:0.109170338675599
humidity:0.4591479170272448
max is humidity:0.4591479170272448
*/

