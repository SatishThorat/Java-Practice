
public class StaticKeyword {

	String name, color;
	int price, wheels;
	
	public void start()
	{
		System.out.println("StaticKeyword car------ start");
	}
	
	public void steering()
	{
		System.out.println("StaticKeyword car--- steering");
	}
	
	public static void main(String[] args)
	{
		StaticKeyword sc=new StaticKeyword();
		sc.name="i20";
		sc.color="black";
		

	}

}
