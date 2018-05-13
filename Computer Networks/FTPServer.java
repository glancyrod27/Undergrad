import java.io.*;
import java.net.*;

public class FTPServer
{
       public static void main(String arg[])throws IOException
         {
	DataInputStream din;
	DataOutputStream dout=null;
	FileInputStream fin;
	FileOutputStream fout;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ServerSocket ser=null;
	int ch=0;
	try
	{
	     while(true)
   	           {
		ser=new ServerSocket(2345);
		Socket s=ser.accept();
		System.out.println("Connection Establishment");
		din=new DataInputStream(s.getInputStream());
		dout=new DataOutputStream(s.getOutputStream());
		String file="";
		String choice=din.readUTF();
		if(choice.compareTo("GET")==0)
		   {
			file=din.readUTF();
			System.out.println("Client wants a file from me");
			System.out.println("Requested file:"+file);
			fin=new FileInputStream(file);
			dout.writeUTF("File Exists");
			while((ch=fin.read())!=-1)
			dout.writeInt(ch);
			fin.close();
			System.out.println("File Transfered");
			String reply=din.readUTF();
			System.out.println(reply);
			System.out.println("Connection Closed");
		   }
		if(choice.compareTo("Send")==0)
		   {
			System.out.println("Client wants to send me a file");
			System.out.println("Enter Destination File");
			fout=new FileOutputStream(new File(br.readLine()));
			while((ch=din.readInt())!=-1)
			fout.write(ch);
			fout.close();
			System.out.println("File Received");
			dout.writeUTF("SERVER:Your file is uploaded on Server");
			System.out.println("Connection close");
		   }
		if(choice.compareTo("DISCONNECT")==0)
		{
			System.out.println("Client Disconnected");
			System.exit(0);
		}

	         }
	}
	catch(FileNotFoundException fnf)
	{
	  	System.out.println("Requested file not found");
		dout.writeUTF("file not existing");
	}
	catch(SocketException se)
	{
		System.out.println("job done");
	}
	catch(Exception e)
	{
			System.out.println("error in connection");
	}
          }
}
