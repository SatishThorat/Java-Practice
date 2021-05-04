package ClassAndObjects;

public class SimpleClasss
{
	String name, DOB;
	int age;
	double salary;
	boolean ispermanant; 

	public static void main(String[] args) {
		
		SimpleClasss sc=new SimpleClasss();
		sc.name="Satish";
		sc.age=31;
		sc.DOB="12/12/1997";
		sc.ispermanant=true;
		sc.salary=35000;
		
		SimpleClasss sc1=new SimpleClasss();
		sc1.age=25;
		sc1.name="Shivansh";
		sc1.salary=25000;
		
		
		System.out.println(sc.name +" "+sc.age+" "+sc.salary+" " +sc.DOB);
		System.out.println(sc1.age+" "+sc1.name+" "+sc1.ispermanant);
		
}

}
