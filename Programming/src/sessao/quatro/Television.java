package sessao.quatro;

public class Television extends ElectronicDevice {

	public Television(String manufacturer) {
		super(manufacturer);
		
	}

	@Override
	public void run() {
		
		if(getState())
		{
			System.out.println("Television on");
			System.out.println("RTP, SIC,TVI");
		}
		
	}

	
	
	
}
