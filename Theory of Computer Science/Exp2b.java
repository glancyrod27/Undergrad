import java.io.*;
class Exp2b
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
		if(g.charAt(g.length()-2)=='0' && g.charAt(g.length()-1)=='1')
		return true;
		else 
		return false;
	}
}


D:\glance>javac Exp2b.java

D:\glance>java Exp2b
enter ur string
00010101
It is Regular Expression

D:\glance>java Exp2b
enter ur string
00101010110
It is not Regular Expression
