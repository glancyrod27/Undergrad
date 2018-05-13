import java.io.*;
import java.net.*;
public class FTPc
{
	public static void main(String args[])throws IOException
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
			System.out.println("Enter the operation to be performed:\n1.GET\n2.SEND\n3.DISCONECT");
			int choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
				{
					dout.writeUTF("GET");
					System.out.println("Enter the name of file to received");
					file=br.readLine();
					dout.writeUTF(file);
					if((din.readUTF()).compareTo("File not existing")==0)
					{
						System.out.println("Server does not have the requested file!!");
					}				
					else
					{
						System.out.println("Enter destination file");
						fout=new FileOutputStream(new File(br.readLine()));
						while((ch=din.readInt())!=-1)
						{
							fout.write(ch);
						}
						fout.close();
						dout.writeUTF("Thank You!!");
						System.out.println("I have received the file!!");
					}
				}
				break;
				case 2:
				{
					dout.writeUTF("SEND");
					System.out.println("Enter the name of the file to be uploaded");
					fin=new FileInputStream(br.readLine());
					while((ch=fin.read())!=-1)
					{
						dout.writeInt(ch);
					}
					fin.close();
					String reply=din.readUTF();
					System.out.println(reply);
					System.out.println("file uploaded on server");
				}
				break;
				case 3:	
				{
					System.out.println("client disconnected");
					System.exit(0);
				}
				break;
				default:
				{
					System.out.println("wrong Entry");
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
CLIENT 1
Microsoft Windows [Version 6.1.7600]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\Administrator>cd/

C:\>d:

D:\>cd glancy

D:\glancy>set path=C:\Program Files\Java\jdk1.6.0_07\bin;

D:\glancy>javac FTPc.java

D:\glancy>java FTPc
Enter the operation to be performed:
1.GET
2.SEND
3.DISCONECT
1
Enter the name of file to be received
abc.txt
Enter destination file
xyz.txthave received the file!!


CLIENT 2:
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Administrator>set path=C:\Program Files\Java\jdk1.6.0\
bin;

C:\Documents and Settings\Administrator>cd/

C:\Documents and Settings\Administrator>d:

D:\>cd glancy

D:\glancy>javac FTPc.java

D:\glancy>java FTPc
Enter the operation to be performed:
1.GET
2.SEND
3.DISCONECT
2
Enter the name of the file to be uploaded
abc.txt
file uploaded on server


CLIENT 3:
Microsoft Windows XP [Version 5.1.2600]
(C) Copyright 1985-2001 Microsoft Corp.

C:\Documents and Settings\Administrator>set path=C:\Program Files\Java\jdk1.6.0\
bin;

C:\Documents and Settings\Administrator>cd/

C:\Documents and Settings\Administrator>d:

D:\>cd glancy

D:\glancy>javac FTPc.java

D:\glancy>java FTPc
Enter the operation to be performed:
1.GET
2.SEND
3.DISCONECT
3
client disconnected

D:\glancy>
*/				