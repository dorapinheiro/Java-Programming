package sessao.cinco;

public class Television extends ElectronicDevice {

	private Component[] components;
	
	public Television(String manufacturer) {
		super(manufacturer);
		components = new Component[2];
		components[0] = new Component("Antena");
		components[1] = new Component("Ecra");
	}

	@Override
	public void run() {
		
		if(getState())
		{
			System.out.println("Television on");
			System.out.println("RTP, SIC,TVI");
		}
		
	}

	//inner class
	private static class Component
	{
		private String name;
		
		public Component(String nome)
		{
			this.name=nome;
		}
		
		public String getName()
		{
			return name;
		}
	}
	
	
}
