package ConditionalOperatorsSwitchCase;

public class IfElseIfCondition {

	public static void main(String[] args) {
		String name="Pooja";
		if(name.equals("pooja"))
		{
			System.out.println(name+ "89 marks");
		}
		
		else if(name.equals("Satish"))
		{
			System.out.println(name+ "55 marks");
		}
		
		else if (name.equals("pooja"))
		{
			System.out.println(name+ "75 marks");
		}
		
		else 
		{
			System.out.println("no student founds");
		}

	}

}
