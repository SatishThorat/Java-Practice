package StaticArrayConcept;

public class ArrayAssignmentquestion2
{
	

	public static void main(String[] args) {
		
		Object cricket[]=new Object[6];
		cricket[0]="Prashant";
		cricket[1]=30;
		cricket[2]="Indian";
		cricket[3]='M';
		cricket[4]=50.50;
		cricket[5]=true;
		
		for(int i=0;i<cricket.length;i++)
		{
			System.out.println(cricket[i]);
		}
		
		System.out.println(cricket.length);
		
		for(Object e: cricket)
		{
			System.out.println(e);
		}
		
		
	}

}
