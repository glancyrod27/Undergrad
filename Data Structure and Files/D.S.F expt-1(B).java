import java.io.*;
class Str
{
void calc(String s1,String s2)
{
System.out.println("Length of string 1:"+s1.length());
System.out.println("Length of string 2:"+s2.length());
System.out.println("Convert s1 to lower case:"+s1.toLowerCase());
System.out.println("Convert s2 to upper case:"+s2.toUpperCase());
System.out.println("Getting a character from s1:"+s1.charAt(3));
System.out.println("Getting a character from s2:"+s2.charAt(5));
System.out.println("Concatinating strings s1 and s2:"+s1.concat(s2));
}
}
class Function
{
public static void main(String args[ ])throws IOException
   {
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a string 1 in upper case");
String p=b.readLine();
System.out.println("Enter a string 2 in lower case");
String q=b.readLine();

       Str x=new Str();
        x.calc(p,q);
   }
}

/*output
D:\flevia>javac Function.java

D:\flevia>java Function
Enter a string 1 in upper case
FLEVIA
Enter a string 2 in lower case
fargose
Length of string 1:6
Length of string 2:7
Convert s1 to lower case:flevia
Convert s2 to upper case:FARGOSE
Getting a character from s1:V
Getting a character from s2:s
Concatinating strings s1 and s2:FLEVIAfargose

D:\flevia>
*/
