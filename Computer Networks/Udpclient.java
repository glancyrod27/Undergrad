import java.net.*;
import java.io.*;
class Udpclient
{
public static void main(String args[])throws IOException
{
DatagramSocket ser=new DatagramSocket(1234);
byte[] txdata=new byte[1024];
byte[] rxdata=new byte[1024];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String sent=br.readLine();
txdata=sent.getBytes();
InetAddress add=InetAddress.getByName("127.0.0.1");
int port=2345;
DatagramPacket dp1=new DatagramPacket(txdata,txdata.length,add,port);
ser.send(dp1);
DatagramPacket dp2=new DatagramPacket(rxdata,rxdata.length);
ser.receive(dp2);
String rec=new String(rxdata);
System.out.println("The changed case string is :"+rec);
}
}
