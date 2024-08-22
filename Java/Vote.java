import java.util.*;
import java.io.*;

class Vote
{
	public static void main(String args[])
	{
		System.out.println("Enter the age to check if he/she is eligible to vote or not");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num>=18)
		{
			System.out.println(num+" is an eligible age to vote");
		}
		else
		{
			System.out.println(num+" is not an eligible age to vote");

		}
	}
} 