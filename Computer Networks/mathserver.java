import java.io.*;
import java.net.*;
class mathserver
{
        public static void main(String args[])throws IOException
        {
                int a,b,c=0;
                int n;
                BufferedReader br;
                PrintWriter toclient;
                ServerSocket ser=null;
                try
                {
                    ser=new ServerSocket(2345);
                    Socket s=ser.accept();
                    System.out.println("Connection established");
                    br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                    a=Integer.parseInt(br.readLine());
                    System.out.println(a+"received");
                    b=Integer.parseInt(br.readLine());
                    System.out.println(b+"received");
                    toclient=new PrintWriter(s.getOutputStream(),true);
                    toclient.println("Menu 1.Addition 2.Subtraction 3.Multiplication  4.Division  Enter your choice:");
                    n=Integer.parseInt(br.readLine());
                    switch(n)
                    {
                         case 1:
                                 {
                                    c=a+b;
                                 }
                                 break;
                         case 2:
                                 {
                                     c=a-b;
                                 }
                                 break;
                         case 3:
                                 {
                                     c=a*b;
                                 }
                                 break;

                         case 4:
                                 {
                                     c=a/b;
                                 }
                                 break;
                   }
                    toclient.println(c);
                    System.out.println("Connection closed");
                   }
                    catch( Exception e)
                   {
                       System.out.println("Error in connection");
                   }
          }
}