import java.util.*;
import java.io.*;

class MultiTable
	{
	public static void main(String args[])
	{
		int mul=1;
		System.out.println("Enter the number till you want the multiplication number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		for(int i=2; i<=num;i++)
		{
			for(int j=1;j<=10;j++)
			{
				mul= i*j;
				System.out.println(i+" X "+j+"= "+mul);
			}
			System.out.println("");

		}
	}
} 