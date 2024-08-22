import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[]) throws Exception
	{
	Socket s= new Socket("192.168.10.205", 9999);
	DataInputStream dis= new DataInputStream(System.in);
	DataInputStream fromServer= new DataInputStream(s.getInputStream());
	PrintStream toServer= new PrintStream(s.getOutputStream());
	String msg= null;
	while(true)
	{
		msg= dis.readLine();
		toServer.println("CLient:: "+msg);
		System.out.println(fromServer.readLine());
	}
	}
}