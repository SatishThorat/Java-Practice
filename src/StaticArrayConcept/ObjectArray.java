package StaticArrayConcept;

public class ObjectArray {

	public static void main(String[] args) {
		Object obj[]=new Object[4];
		obj[0]="Vijayashri";
		obj[1]=28;
		obj[2]='F';
		obj[3]=15.20f;
		
		System.out.println(obj[3]);
		for(Object o:obj)
			System.out.println(o);

	}

}
