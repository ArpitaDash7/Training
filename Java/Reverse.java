import java.util.*;
import java.io.*;

class Reverse
{
	public static void main(String args[])
	{
		int r=0,i;
		System.out.println("Enter the number to be reversed");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		while(num>0)
		{
			i=num%10;
			r= r*10 + i;
			num=num/10;
			
		}
		System.out.println("The reverse number is "+r);
	}
} 