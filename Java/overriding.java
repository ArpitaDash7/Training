import java.io.*;
import java.util.*;

abstract class Name
{
	abstract void name();
	void display()
	{
		System.out.println("Its noted down!");
	}

}
class Test extends Name
{
	void name()
	{
		System.out.println("The name is Arpita");
	}
	
	void shape(int i)
	{
		System.out.println("Yellow");
	}
	void shape(float i)
	{
		System.out.println("Green");
	}
}

class Test2 extends Test
{
	void shape(int i)
	{
	super.shape(i);
	System.out.println("Black");
	}
} 	

class Overriding
{
	public static void main(String[] args)
	{
	char ch1='y';
	do
	{
		System.out.println("Enter your choice for overloading[1] or overriding[2] or abstraction[3]");
		Scanner sc= new Scanner(System.in);
		int ch = sc.nextInt();
	switch(ch)
	{
		case 1: Test s= new Test();
			s.shape(10);
			break;
		case 2: Test2 s2= new Test2();
			s2.shape(20);
			break;
		case 3: Test s3= new Test();
			s3.name();
			s3.display();
			break;
	
	}System.out.println("Do you want to continue y/n");
	ch1= sc.next().charAt(0);

	
}while(ch1=='y');
}
}
