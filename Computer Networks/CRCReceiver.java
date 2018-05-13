import java.net.*;
import java.io.*;
 
public class CRCReceiver {
    public static void main(String arg[]) throws Exception
    {
        CRCReceiver rec=new CRCReceiver();
        rec.run();
    }
 
    public void run() throws Exception
    {
        ServerSocket srvsocket=new ServerSocket(9999);
        Socket s=srvsocket.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg=br.readLine();
        System.out.println("Received msg with remainder appended:\n"+msg+"\n");
        CRCSender cs=new CRCSender();
        char[] g={'1','0','1','1'};
        char[] rem=cs.divide(msg.toCharArray(), g);
        int i;
        for(i=0;i<rem.length;i++)
        {
            if(rem[i]=='1')
            {
                System.out.println("Error detected!");
                break;
            }
        }
        if(i==rem.length)
            System.out.println("No error detected.");
    }
}
