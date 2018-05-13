import java.io.*;
public class SubExp 
{
    public static void main(String args[]) throws IOException
    { 
         BufferedReader br=new BufferedReader(new FileReader("sub.txt"));
         String s=new String();
         StringBuffer sb=new StringBuffer();

//INPUT

         System.out.println(" INPUT ");
          while((s=br.readLine())!=null)
        {
          System.out.println(s);
          sb.append(s+"\n");
        }
//OUTPUT

         System.out.println(" OUTPUT ");
         System.out.println("temp=b*c;");

         int x=sb.indexOf("{");
         int y=sb.indexOf("}");

         sb.replace(x+1, x+y, "a=10 + temp\n x=temp+5 }" );

         System.out.println(sb.toString());
         
    }
}



/*
D:\>javac SubExp.java

D:\>java SubExp
 INPUT
void main
{
a=10+b*c;
x=b*c+5;
}
 OUTPUT
temp=b*c;
void main
{a=10 + temp
 x=temp+5 }
*/