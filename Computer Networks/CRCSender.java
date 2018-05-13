import java.net.*;
import java.io.*;
import java.util.*;
 
public class CRCSender {
    public static void main(String arg[]) throws Exception
    {
        CRCSender snd=new CRCSender();
        snd.run();
    }
 
    public void run() throws Exception
    {	
        Socket s=new Socket("localhost", 9999);
        PrintStream ps=new PrintStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Generator polynomial: x^3 + x + 1");
        System.out.println("Enter the message in binary form:");
        String msg=sc.next();
        String str=msg.concat("000");
        char[] g={'1','0','1','1'};
        char[] c=str.toCharArray();
        char[] rem=divide(c, g);
        char[] newrem=new char[3];
        System.out.print("Remainder: ");
        System.out.println(rem);
        System.arraycopy(rem,1,newrem,0,3);
        String newmsg=msg;
        for(int i=0;i<newrem.length;i++)
            newmsg=newmsg+newrem[i];
        ps.println(newmsg);     
    }
 
    char[] xor(char[] a, char[] b)
    {
        char[] c=new char[a.length];
        for(int i=0;i<a.length;i++)
            c[i]=(a[i]==b[i])?'0':'1';
        return c;
    }
 
    char[] divide(char[] a, char[] b)
    {
        char[] t;
        char[] x=new char[b.length];
        System.arraycopy(a, 0, x, 0, 4);

        for(int i=0;i<a.length-4;i++)
        {
            if(x[0]=='1')
                t=xor(x,b);
            else
            {
                char[] y={'0','0','0','0'};
                t=xor(x,y);
            }
            System.arraycopy(t, 1, x, 0, 3);
            x[3]=a[i+4];
        }
        return x;
    }
}
