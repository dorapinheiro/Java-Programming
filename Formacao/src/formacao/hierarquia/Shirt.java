package formacao.hierarquia;

public class Shirt extends Clothing{
	
	
	
	public Shirt(int itemId, double price)
	{
		super(itemId, price);
	}

	@Override
	public void display()
	{
		System.out.println("Shirt Display: ItemId: " + getItemId() + ", Price: "  +  getPrice());
	}
	
	public void displayShirt(){
		System.out.println("Ahahahah");
	}
}
