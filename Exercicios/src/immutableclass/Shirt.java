package immutableclass;

public final class Shirt {

	private final String size;
	private final int sizeInt;
	private final Person person;
	
	public Shirt(String size, int sizeint, Person p)
	{
		this.size=size;
		this.sizeInt=sizeint;
		this.person = new Person(p.getNome(), p.getIdade());
	}
	
	public Shirt(String size, int sizeint)
	{
		this.size=size;
		this.sizeInt=sizeint;
		this.person = new Person();
	}

	public String getSize() {
		return size;
	}

	public int getSizeInt() {
		return sizeInt;
	}

	public String getPerson() {
		return person.getNome();
	}

	
	public String toString()
	{
		return "Size "+ getSize() + "\nintSize " + getSizeInt() + "\nPerson: ";// + getPerson(),

		
	}
}
