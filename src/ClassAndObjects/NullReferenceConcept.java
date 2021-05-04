package ClassAndObjects;

public class NullReferenceConcept
{
	String name;
	int age;

	public static void main(String[] args)
	{
		//NullReferenceConcept obj=null;
	    NullReferenceConcept obj=new NullReferenceConcept();
		obj.age=35;
	    obj.name="Vijaya";
		
		System.out.println(obj.name+" "+obj.age);
		
		obj=null;
		
		System.out.println(obj.age+" " +obj.name);
		
		//new NullReferenceConcept();
	}

}
