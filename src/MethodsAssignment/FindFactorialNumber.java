package MethodsAssignment;
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Not Getting the Expected Output.
public class FindFactorialNumber 
{
	public int  FactorialNumber(int number)
	{
		int factorial=1;
		for(int i=number;i>=1;)
		{
			factorial=factorial*i;
			return number;
		}
		return number;
		
	}

	public static void main(String[] args) {
		FindFactorialNumber fact=new FindFactorialNumber();
		int res=fact.FactorialNumber(5);
		System.out.println(res);
		

	}

}
