//this works for 2digit nos.so input single digit nos as 07,03 etc

import java.io.*;
public class Sfold1 
{
    public static void main(String args[]) throws IOException
    {
       
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter ur input string:");
         String s=br.readLine();
	 
	String output="";
        	String var1="";
	String var2="";
	String k="";
	double x,y; 
	
         if(s.indexOf("+")!=-1 && Character.isLetter(s.indexOf("+")+1)==false)
	{
		output=s.substring(0,s.indexOf("+")-2);
		var1=s.substring(s.indexOf("+")-2,s.indexOf("+"));
		var2=s.substring(s.indexOf("+")+1,s.indexOf("+")+3);
		k=s.substring(s.indexOf("+")+3,s.length());
		x=Integer.parseInt(var1);
		y=Integer.parseInt(var2);
		x=x+y;
		output=output+Double.toString(x)+k;
		System.out.println("output:"+output);
	}
	else if(s.indexOf("-")!=-1 && Character.isLetter(s.indexOf("-")+1)==false)
	{
		output=s.substring(0,s.indexOf("-")-2);
		var1=s.substring(s.indexOf("-")-2,s.indexOf("-"));
		var2=s.substring(s.indexOf("-")+1,s.indexOf("-")+3);
		k=s.substring(s.indexOf("-")+3,s.length());
		x=Integer.parseInt(var1);
		y=Integer.parseInt(var2);
		x=x-y;
		output=output+Double.toString(x)+k;
		System.out.println("output:"+output);	
       
        } 
	else if(s.indexOf("/")!=-1 && Character.isLetter(s.indexOf("/")+1)==false)
	{
		output=s.substring(0,s.indexOf("/")-2);
		var1=s.substring(s.indexOf("/")-2,s.indexOf("/"));
		var2=s.substring(s.indexOf("/")+1,s.indexOf("/")+3);
		k=s.substring(s.indexOf("/")+3,s.length());
		x=Integer.parseInt(var1);
		y=Integer.parseInt(var2);
		x=x/y;
		output=output+Double.toString(x)+k;
		System.out.println("output:"+output);
	}
	else if(s.indexOf("*")!=-1 && Character.isLetter(s.indexOf("*")+1)==false)
	{
		output=s.substring(0,s.indexOf("*")-2);
		var1=s.substring(s.indexOf("*")-2,s.indexOf("*"));
		var2=s.substring(s.indexOf("*")+1,s.indexOf("*")+3);
		k=s.substring(s.indexOf("*")+3,s.length());
		x=Integer.parseInt(var1);
		y=Integer.parseInt(var2);
		x=x*y;
		output=output+Double.toString(x)+k;
		System.out.println("output:"+output);	
       
        } 
		
       
 
    }
}


/*OUTPUT:


int area=(22*03)*r*r;
output:int area=(66)*r*r;


int area=(22/03)*r*r;
output:int area=(7.0)*r*r;


int area=(22+10)*r*r;
output:int area=(32)*r*r;


int k=05*04;
output:int k=20;



D:\>javac Sfold1.java

D:\>java Sfold1
Enter ur input string:
int a=22/07*r*r;
output:int a=3*r*r;

D:\>javac Sfold1.java

D:\>java Sfold1
Enter ur input string:
int a=22/07*r*r;
output:int a=3.142857142857143*r*r;

*/