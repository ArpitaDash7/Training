import java.util.*;
import java.io.*;

class StringMethods
{	
	public static void main(String args[]) throws IOException
	{
	String name;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	name=sc.nextLine();
	String upper= name.toUpperCase();
	System.out.println("The uppercase is "+upper);
	String lower= name.toLowerCase();
	System.out.println("The lowercase is "+lower);
	System.out.println("Enter the index you want to retrive the character");
	int index1= sc.nextInt();
	char chars1= name.charAt(index1);
	System.out.println("The character is "+chars1);
	}
}
