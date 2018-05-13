import java.io.*;
class Exp2a
{
	public static void main(String args[])throws IOException
	{
		String g;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter ur string");
		g=br.readLine();
		if(check(g))
		System.out.println("It is Regular Expression");
		else
		System.out.println("It is not Regular Expression");
	}
	public static boolean check(String g)
	{
		if(g.charAt(0)=='a')
		{
			for(int i=1;i<g.length();i++)
			{
				if(g.charAt(i)!='b' && g.charAt(i)!='c')
				return false;
			}
			return true;
		}
		else if(g.charAt(0)=='b')
		{
			for(int j=1;j<g.length();j++)
			{
				if(g.charAt(j)!='a' && g.charAt(j)!='c')
				return false;
			}
		return true;
		}
		else if(g.charAt(0)=='c')
		{
			for(int k=1;k<g.length();k++)
			{
				if(g.charAt(k)!='a' && g.charAt(k)!='b')
				return false;
			}
		return true;
		}
		return true;
	}
}



D:\glance>javac Exp2a.java

D:\glance>java Exp2a
enter ur string
abcbcbc
It is Regular Expression

D:\glance>java Exp2a
enter ur string
abcbcbabcb
It is not Regular Expression
