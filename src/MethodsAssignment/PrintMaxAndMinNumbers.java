package MethodsAssignment;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered.
public class PrintMaxAndMinNumbers {
	public int findMAx(int a,int b, int c) {
		if(a>b && a>c) {
			System.out.println("max number is" + " "  +a);
			return a;
		}
	    if(b>a && b>c) {
			System.out.println("max number is "  + b);
			return b;
		}
		else {
			System.out.println(" Max number is " + c);
			return c;
		}
	}
	public int findMin(int x,int y, int z) {
		if(x<y && x<z) {
			System.out.println("Min Number is  "  + x);
			return z;
		}
		if(y<x && x<z) {
			System.out.println("Min Number is  "  + y);
			return z;
		}
		else {
			System.out.println("Min number is  "  + z); }
			return z;
		}
		public static void main(String[] args) {
		PrintMaxAndMinNumbers maxmin=new PrintMaxAndMinNumbers();
		int max= maxmin.findMAx(5,10, 15);
		System.out.println(max);
		int min=maxmin.findMin(20, 5, 30);
		System.out.println(min);
	}
}
