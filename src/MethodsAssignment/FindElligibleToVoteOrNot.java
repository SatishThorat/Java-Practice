package MethodsAssignment;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class FindElligibleToVoteOrNot 
{
	public int EligibleVote(int age)
	{
		if (age>18)
		{
			System.out.println("The person is eligible to vote");
			return age;
		}
		
		else 
		{
			System.out.println("person is not eligible to vote");
			return age;
		}
		
	}
	public static void main(String[] args) 
	{
		FindElligibleToVoteOrNot vote=new FindElligibleToVoteOrNot();
		int result=vote.EligibleVote(20);
		System.out.println(result);
		int res=vote.EligibleVote(15);
		System.out.println(res);
	}

}
