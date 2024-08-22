import java.io.*;
import java.util.*;

abstract class Shape
{
	abstract double area();
}

class Rectangle extends Shape
{
 double length, breadth;
 Rectangle(double length, double breadth)
 {
	this.length= length;
	this.breadth= breadth;
 }
 public double area()
 {
	double area2= length* breadth;
	return area2;
 }
}

class Abstraction1
{
	public static void main(String args[])
	{
	Rectangle r= new Rectangle(10.5,20);
	double area1= r.area();
	System.out.println(area1);
	}
}