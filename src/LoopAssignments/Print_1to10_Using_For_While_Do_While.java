package LoopAssignments;
// WAP to print 10 to 1 using for, while and do-while loop
public class Print_1to10_Using_For_While_Do_While {

	public static void main(String[] args) {
		// Using For Loop
		System.out.println("Using For Loop");
		for(int i=1;i<=10;i++)
		{
		System.out.println(i);
		}
		
		// Using While Loop
		System.out.println("");
		System.out.println("Using While Loop");
		int k=1;
		while (k<=10)
		{
			System.out.println(k);
			k++;
		}
		
		// Using Do While Loop
		System.out.println("");
		System.out.println("Using Do While Loop");
		int j=1;
		do {
			System.out.println(j);
			j++;
			
		} while (j<=10);
		
	}

}
