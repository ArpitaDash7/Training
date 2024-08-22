import java.util.*;
import java.io.*;

class Ternary
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the guests to fit in a cab");
		int guests= sc.nextInt();
		String result= (guests<=6)?"Permitted":"Not Permitted";
		System.out.println(result+". Visit Again!");
	}
}
		