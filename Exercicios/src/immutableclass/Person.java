package immutableclass;

public class Person {
	
	private String nome;
	private int idade;
	
	public Person()
	{}
	
	public Person(String nome, int id)
	{
		this.setNome(nome);
		this.idade=id;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
