package ArraylistConcept;

import java.util.ArrayList;

public class ArraylistPractice {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Satish");
		al.add('V');
		System.out.println(al.size());
		
		al.add(12.33);
		System.out.println(al.size());
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

	}

}
