package LoopAssignments;

public class Print_Even_Numbers_For_While_DoWhile {
	// Print even number (0 2 4 6 8 10) using for/while/do while loop.
	public static void main(String[] args) {
		// Using For Loop
		System.out.println("Using For Loop");
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		// Using While Loop
				System.out.println("");
				System.out.println("Using While Loop");
				int j=0;
				while(j<=10)
				{
					if(j%2==0)
					{
						System.out.println(j);
					}
					j++;
				}
				// Using Do While Loop
				System.out.println("");
				System.out.println("Using Do While Loop");
				int k=0;
				do {
					System.out.println(k);
					k++;
				} while (k<=10);
				
				if(k%2==0)
					{
						System.out.println(k);
						
					}
				
	}
}
				
				
				
	

				

	


