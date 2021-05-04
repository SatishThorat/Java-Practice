package MethodConcepts;

public class Methodconcept 
{
	public void test()
	{
		System.out.println("test method");
	}
	
	public int getNumber()
	{
		int a=10;
		int b=20;
		int c=a+b+150;
		System.out.println(c);
		return c;
	}
	
    public String getTrainerName()
    {
    	String name= "Tester";
    	return name;
    }
    
    public int add(int a, int b)
    {
    	int z=a+b;
    	return z;
    	
    }
	public static void main(String[] args)
	{
		Methodconcept mc=new Methodconcept();
		mc.test();
		int sum=mc.getNumber();
		System.out.println(sum);
		
		String Trainer=mc.getTrainerName();
		System.out.println(Trainer);
		
		int q=mc.add(5, 10);
		System.out.println(q);
		int f=mc.add(45,56);
		System.out.println(f);
		
		
	}
	
	

}
