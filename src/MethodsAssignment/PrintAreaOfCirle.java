package MethodsAssignment;

//  Write a program to print the circumference and area of a circle of radius entered by defining your own method.
public class PrintAreaOfCirle 
{
	public float AreaOfcirlce()
	{
		float pi=3.14f;
		int radius=4;
		float Area=pi*radius*radius;
		return Area;
	}
	public static void main(String[] args) 
	{
		PrintAreaOfCirle cirlce=new PrintAreaOfCirle();
		float result=cirlce.AreaOfcirlce();
		System.out.println("Area of circle is " + "  " +result);

	}

}
