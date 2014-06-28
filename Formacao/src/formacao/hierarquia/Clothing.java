package formacao.hierarquia;

public class Clothing implements Cloneable {
	
	private int itemId;
	private double price;

	public Clothing(){}
	
	public Clothing(int itemId, double price)
	{
		this.itemId=itemId;
		this.price=price;
	}
	
	public void display(){
		System.out.println("Clothing Display: ItemId: " + itemId + ", Price: "  +  price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public Object clone()
	{
		return new Clothing(getItemId(), getPrice());
	}
	
}
