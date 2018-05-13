import java.io.*;
import java.net.*;
public class FTPClient
{
    public static void main(String args[])
      {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	DataInputStream din;
	FileInputStream fin;
	FileOutputStream fout;
	String file;
	try
	{
		Socket cs=new Socket(InetAddress.getLocalHost(),2345);
		din=new DataInputStream(cs.getInputStream());
		int ch=0;
		DataOutputStream dout=new DataOutputStream(cs.getOutputStream());
		System.out.println("Enter the operation to be performed: \n1.GET \n2.SEND \n3.Disconnect");
		int choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		    case 1:
			{
			 	dout.writeUTF("GET");
				System.out.println("Enter the name of the file to be received");
				file=br.readLine();
				dout.writeUTF(file);	
				if((din.readUTF()).compareTo("File not existing")==0)
				System.out.println("Server does not have requested file!!");
				else
				{
					System.out.println("Enter Destination File:");
					fout=new FileOutputStream(new File(br.readLine()));		
					while((ch=din.readInt())!=-1)
					fout.write(ch);
					fout.close();
					dout.writeUTF("Thank you");
					System.out.println("I have received the file");
				}
			}
			break;
		     case 2:
			{
				dout.writeUTF("SEND");
				System.out.println("Enter the name of the file to be uploaded");
				fin=new FileInputStream(br.readLine());
				while((ch=fin.read())!=-1)
				dout.writeInt(ch);
				fin.close();
				String reply=din.readUTF();
				System.out.println(reply);
				System.out.println("File uploaded on Server");
		 	}
			break;
		   case 3:
			{
				System.out.println("Client Disconnect");
				System.exit(0);
			}
			break;
		   default:
			{
				System.out.println("Wrong choice");
				System.exit(0);
			}
		}
  	}
	catch(FileNotFoundException fnf)
	{
		System.out.println("Requested file not found");
	}
	catch(SocketException se)
	{
		System.out.println("Job done");
	}
	catch(Exception e)
	{
		System.out.println("Error Connection"+e);
	}
         }
}
