package ConditionalOperatorsSwitchCase;

public class StringComparison {

	public static void main(String[] args) {
		String s1="seleniuM";
		String s2="Selenium";
		if(s1.equals(s2))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("both are equals");
		}
		else
		{
			System.out.println("both are not equals");
		}
		
		String name="Satish";
		if(name.contains("Sat"))
		{
			System.out.println(name+ " and marks is 85");
		}
		
		if(name.equals("Prashant"))
		{
			System.out.println(name+" and marks is 95");
		}
		
		
				

	}

}
