import java.util.*;
import java.io.*;

class OddEven
{
	public static void main(String args[])
	{
		System.out.println("Enter the number to check if its even or odd");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is an even number");
		}
		else
		{
			System.out.println(num+" is an odd number");
		}
	}
} 