package MethodsAssignment;
/* Write a program which will ask the user to enter his/her marks (out of 100). 
   Define a method that will display grades according to the marks entered as below:*/
// Not Getting Expected Output. Not able to understand what's going wrong ..
public class GetStudentGrades {
	public String GetMarks(String studentmarks) {
		String Grades=null;
		System.out.println("enter marks range" + studentmarks);
		if(studentmarks.equals("90-100"));
		{
			System.out.println("Grade is AA");
			return Grades;}
		if(studentmarks.equals("81-90"));
		{
			System.out.println("Grade is BB");
			return Grades;}
		if(studentmarks.equals("71-80"));
			{
				System.out.println("Grade is CC");
				return Grades;}
		if(studentmarks.equals("61-70"));
				{
					System.out.println("Grade is BB");
					return Grades;}
		if(studentmarks.equals("51-60"));
				{
				   System.out.println("Grade is CC");
				   return Grades;}
		if(studentmarks.equals("41-50"));
				{
					System.out.println("Grade is DD");
					return Grades;
			    }
				
				else
		       {
				System.out.println("Fail");
			   }}
public static void main(String[] args) {
		GetStudentGrades grades=new GetStudentGrades();
		String res=grades.GetMarks("61-70");
		System.out.println(res);
}
}
