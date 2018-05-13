import java.io.*;
public class Sfold {
    public static void main(String args[]) throws IOException
    {
       
         BufferedReader br=new BufferedReader(new FileReader("fold.txt"));
         String s=new String();
         StringBuffer sb=new StringBuffer();

///INPUT
         System.out.println("INPUT");
          while((s=br.readLine())!=null)
         {
	System.out.println(s);
        	sb.append(s+"\n");
         }

///OUTPUT
         System.out.println("OUTPUT");
        
         int x=sb.indexOf("{");
         int y=sb.indexOf("}");
         sb.replace(x+1, x+y, "a=(3.14)*r*r\n }");
         System.out.println(sb.toString());
         
    }
}




/*
D:\>javac Sfold.java

D:\>java Sfold
INPUT
void main
{
a=(22.0/7.0)*r*r
}
OUTPUT
void main
{a=(3.14)*r*r
 }

*/