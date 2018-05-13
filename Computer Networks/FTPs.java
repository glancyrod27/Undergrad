import java.util.*;
import java.io.*;
import java.net.*;
public class FTPs
{
	public static void main(String args[])throws IOException
	{
		
		DataInputStream din;
		DataOutputStream dout;
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
				System.out.println("connection established");
				din=new DataInputStream(s.getInputStream());
				dout=new DataOutputStream(s.getOutputStream());
				String file="";
				String choice=din.readUTF();
				if(choice.compareTo("GET")==0)
				{
					file=din.readUTF();
					System.out.println("Client wants a file from me!!");
					System.out.println("Requested file:"+file);
					fin=new FileInputStream(file);
					dout.writeUTF("File exists!");
					while((ch=fin.read())!=-1)
					{
						dout.writeInt(ch);
					}
					fin.close();
					System.out.println("File Transferred!");
					String reply=din.readUTF();
					System.out.println(reply);
					System.out.println("Connection closed");
				}
				if(choice.compareTo("SEND")==0)
				{
					System.out.println("{client wants to send me a file!!");
					System.out.println("Enter Destination File;");
					fout=new FileOutputStream(new File(br.readLine()));
					while((ch=din.readInt())!=-1)
					{
						fout.write(ch);
					}
					fout.close();
					System.out.println("file received");
					dout.writeUTF("SERVER:Your File is uploaded on server");
					System.out.println("Connection closed");
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
			System.out.println("Requested File not found");
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

/*
SERVER 1
Microsoft Windows [Version 6.1.7600]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\Administrator>cd/

C:\>d:

D:\>cd glancy

D:\glancy>set path=C:\Program Files\Java\jdk1.6.0_07\bin;

D:\glancy>javac FTPs.java

D:\glancy>java FTPs
connection established
Client wants a file from me!!
Requested file:abc.txt
File Transferred!


SERVER 2:
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Administrator>set path=C:\Program Files\Java\jdk1.6.0\
bin;

C:\Documents and Settings\Administrator>cd/

C:\Documents and Settings\Administrator>d:

D:\>cd glancy

D:\glancy>javac FTPs.java

D:\glancy>java FTPs
connection established
{client wants to send me a file!!
Enter Destination File;
xyz.txt
SERVER:Your File is uploaded on server
Connection closed


SERVER 3:
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Administrator>set path=C:\Program Files\Java\jdk1.6.0\
bin;

C:\Documents and Settings\Administrator>cd/

C:\Documents and Settings\Administrator>d:

D:\>cd glancy

D:\glancy>javac FTPs.java

D:\glancy>java FTPs
connection established
Job done

D:\glancy>
*/
