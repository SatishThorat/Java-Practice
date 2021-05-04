package MethodsAssignment;

// Write a program to print the sum of two numbers entered by defining your own method.
public class SumOfTwoNumbers
{

	public int Addition(int a, int b)
	{
		int sum=a+b;
		return sum;
		
	}
	public static void main(String[] args)
	{
		SumOfTwoNumbers st=new SumOfTwoNumbers();

		int add=st.Addition(15, 25);
		System.out.println(add);
		
		int add1=st.Addition(78, 58);
		System.out.println(add1);

	}

}
