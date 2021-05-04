package MethodsAssignment;

// Define a program to find out whether a given number is even or odd.

public class FinfOddEven
{
	public int OddEven(int num)
	{
		if(num%2==0)
		{
			System.out.println("number is even");
			return num;
		}
		
		else 
		{
			System.out.println("number is odd");
			return num;
		}
		
	}

	public static void main(String[] args)
	{
		FinfOddEven fo=new FinfOddEven();
		int reslut= fo.OddEven(11);
		System.out.println(reslut);
		

	}

}
