import java.util.*;
class Demo
{
public static void main(String args[])
{
int arr[][]= new int[5][5];
Scanner sc= new Scanner(System.in);
System.out.println("enter the values for the array");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
	arr[i][j]= sc.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
	System.out.print(arr[i][j]+"\t");
}
System.out.println("");

}
}
}

