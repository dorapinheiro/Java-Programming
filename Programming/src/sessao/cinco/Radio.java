package sessao.cinco;

public class Radio extends ElectronicDevice {

	public Radio(String manufacturer) {
		super(manufacturer);
	}

	@Override
	public void run() {
		if(getState())
		{
			System.out.println("Radio on");
			System.out.println("102.6");
		}
	}

}
