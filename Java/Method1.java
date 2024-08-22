import java.io.*;
import java.util.*;

class Method1
{
	int num1, num2;
	Method1(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}

	static void Display()
	{
		System.out.println("Static Method initiated! Its called without any object creation");
	}

	public int add()
	{
		int sum=0;
		sum=num1+num2;
		return sum;
	}

	public static void main(String args[])
	{
		
		System.out.println("Displaying method, static method, constructor");
		Method1 ob= new Method1(20,30);
		int total= ob.add();
		Display();
	}
}		
