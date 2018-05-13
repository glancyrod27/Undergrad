import java.io.*;
import java.net.*;
class mathclient
{
          public static void main(String args[])throws IOException
          {
                 int a,b,c;
                 int n;
                 Socket s=null;
                 BufferedReader br,bru;
                 PrintWriter toserver;
                 try
                 {
                        s=new Socket(InetAddress.getLocalHost(),2345);
                        br=new BufferedReader(new InputStreamReader(System.in));
                        bru=new BufferedReader(new InputStreamReader(s.getInputStream()));
                        toserver=new PrintWriter(s.getOutputStream(),true);
                        System.out.println("Enter 2 numbers to be sent to the server:\nFirst number: ");
                        a=Integer.parseInt(br.readLine());
                        toserver.println(a);
                        System.out.println("Second number: ");
                        b=Integer.parseInt(br.readLine());
                        toserver.println(b);
                        System.out.println("SERVER-->"+bru.readLine());
                        n=Integer.parseInt(br.readLine());
                        toserver.println(n);
                        System.out.println("SERVER-->"+bru.readLine());
                        System.out.println("Connection closed");
                 }
                 catch(Exception e)
                 {
                        System.out.println("Error in connection");
                  }
             }
}
