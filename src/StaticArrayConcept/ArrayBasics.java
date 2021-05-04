package StaticArrayConcept;

public class ArrayBasics
{

	public static void main(String[] args) 
	{
		
		String lang[]=new String[5];
		lang[0]="English";
		lang[1]="Spanish";
		lang[2]="Marathi";
		lang[3]="Hindi";
		lang[4]="French";
		
		System.out.println(lang.length);
		System.out.println(lang[4]);
		System.out.println("-----------------");
		for(String e:lang)
		{
			System.out.println(e);
		}
		
		char c[]=new char[2];
		c[0]='a';
		c[1]='@';
		//c[2]='#';
		
		//System.out.println(c.clone());
		System.out.println(c.length);
		
	}

}
