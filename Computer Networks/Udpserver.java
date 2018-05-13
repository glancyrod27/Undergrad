import java.net.*;
import java.io.*;
class Udpserver
{
public static void main(String args[])throws Exception
{
DatagramSocket ser=new DatagramSocket(2345);
byte[]txdata=new byte[1024];
byte[]rxdata=new byte[1024];
DatagramPacket dp3=new DatagramPacket(rxdata,rxdata.length);
ser.receive(dp3);
String r=new String(rxdata);
char c[]=r.toCharArray();
for(int i=0;i<c.length;i++)
{
{
if((int)c[i]>=97)
txdata[i]=(byte)((int)c[i]-32);
else
txdata[i]=(byte)((int)c[i]+32);
}
}
InetAddress add=InetAddress.getByName("127.0.0.1");
int port=1234;
DatagramPacket dp4=new DatagramPacket(txdata,txdata.length,add,port);
ser.send(dp4);
}
}
