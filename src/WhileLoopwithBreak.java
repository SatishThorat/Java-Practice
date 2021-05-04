
public class WhileLoopwithBreak {

	public static void main(String[] args) {
		int num=0;
		while(num<=100)
			
		{
			
			System.out.println(num);
			if(num==50)
			{
				System.out.println("fifty.....");
			}
			
			if (num==100)
			{
				System.out.println("century.....");
			}
			
			if(num==0)
			{
				System.out.println("duck out");
				break;
			}
			num++;
		}
		

	}

}
