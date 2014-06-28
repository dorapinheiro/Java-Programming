package formacao.hierarquia;

public class Main {

	public static void main(String[] args) {
		
		Clothing clothing = new Clothing(1,2.0d);
		
		clothing.display();
		
		Shirt shirt = new Shirt(2,2.0d);
		shirt.display();
		
		Clothing cs = new Shirt(1,1.0d);
		cs.display();
		
		((Shirt)cs).displayShirt();
		
		Clothing clone = (Clothing) clothing.clone();
		System.out.println(clothing instanceof Cloneable);
		System.out.println(clone instanceof Cloneable);
	}

}
