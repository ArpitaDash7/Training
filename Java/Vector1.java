import java.io.*;
import java.util.*;
class Vendor1
{	
	public static void main(String args[])
	{
		Vector v1= new Vector(2);
		int n1= v1.capacity();
		System.out.println("Capacity of vendor :"+n1);
		v1.add(21);
		v1.add(25);
		v1.add(235);
		v1.add(22);
		v1.add(235);

		int n2= v1.capacity();
		System.out.println(v1);
		System.out.println("New capacity of vector: "+n2);
	}
}
	
		