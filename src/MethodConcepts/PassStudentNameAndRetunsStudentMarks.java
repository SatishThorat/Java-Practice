package MethodConcepts;

public class PassStudentNameAndRetunsStudentMarks 
{
	public int getStudentMarks(String StudentName)
	{
		System.out.println(StudentName   + " got marks");
		if(StudentName.equals("Vishal"))
		{
			return 85;
		}
		
		if(StudentName.equals("Satish"))
		{
			return 75;
		}
		else
		{
			System.out.println(StudentName  +  "  not found" );
			return -1;
		}
		
		
		
	}

	public static void main(String[] args)
	{
		PassStudentNameAndRetunsStudentMarks student=new PassStudentNameAndRetunsStudentMarks();
		int name=student.getStudentMarks("Satidfsh");
		System.out.println(name);

	}

}
