package sessao.quatro;

public abstract class ElectronicDevice {

	private boolean isTurnOn;
	private final String manufacturer;
	
	public ElectronicDevice(String manufacturer)
	{
		this.manufacturer=manufacturer;
	}
	
	public abstract void run();
		
	public void turnOn() {
		
		if(!isTurnOn)
		{
			isTurnOn= true;
		}	
	}

	public void turnOff() {
		
		if(isTurnOn)
		{
			isTurnOn= false;
		}
	}

	public boolean getState() {
		return isTurnOn;
	}

	public void setTurnOn(boolean isTurnOn) {
		this.isTurnOn = isTurnOn;
	}

	public String getManufacturer() {
		return manufacturer;
	}


}
