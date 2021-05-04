package MethodsAssignment;

// Define a method that returns the product of two numbers entered 
public class ProductOfTwoNumbers 
{
	
	public int NumberProduct()
	{
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}
	public static void main(String[] args) 
	{
		ProductOfTwoNumbers pn=new ProductOfTwoNumbers();
		int product=pn.NumberProduct();
		System.out.println(product);

	}

}
