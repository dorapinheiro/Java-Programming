package immutableclass;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person("Manel", 1);
		Shirt s = new Shirt("XL", 0, p);
		
		System.out.println(s.getPerson());
		
		p.setNome("Luis");
		
		System.out.println(s.getPerson());
	}

}
