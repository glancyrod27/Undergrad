import java.io.*;
class Reduction
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new FileReader("red.java"));
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

        System.out.println("Output");
        System.out.println("temp=7");
 
        int x=sb.indexOf("{");
        int y=sb.indexOf("}");

        sb.replace(x+1,x+y-1," count=temp; \n temp=temp+7; \n } \n");

        System.out.println(sb.toString());
}
}


/*
D:\>javac Reduction.java

D:\>java Reduction
INPUT
for(i=1;i<=50;i++)
{
count=i*7;
}
Output
temp=7
for(i=1;i<=50;i++)
{ count=temp;
 temp=temp+7;
 }
*/