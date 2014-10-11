package immutableclass;

public class Main {
	
	public static void main(String[] args) {
		
		Person p = new Person( "Manel", 22);
		Shirt s = new Shirt("XL", 23, p);
		
		System.out.println(s);
		
		p.setNome("Luis");
		
		System.out.println("\n\n" + s);

		Person p1 = p;
		
		p1.setNome("AHAH");
		
		System.out.println("\n\n" + s);

	}
}
