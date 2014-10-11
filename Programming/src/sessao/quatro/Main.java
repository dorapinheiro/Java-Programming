package sessao.quatro;

public class Main {
	
	public enum TypeSafe2{
		OFF(0),
		ON(1),
		SUSPEND(2);
		
		private int typSafe;
		
		TypeSafe2(int p)
		{
			typSafe=p;
		}
		
		public int getTypeSafe()
		{
			return typSafe;
		}
	}

	public static void main(String[] args) {
		
		//Teste da classe abstracta
		/*ElectronicDevice tv = new Television("Samsung");
		
		System.out.println(tv.getManufacturer());
		
		System.out.println(tv.getState());
		
		tv.turnOn();

		System.out.println(tv.getState());
		
		tv.run();
		tv.turnOff();
		
		System.out.println(tv.getState() + "\n");
		
		ElectronicDevice radio = new Radio("Alpine");
		radio.turnOn();
		
		radio.run();
		radio.turnOff();*/
		
		System.out.println("TypeSafe2 " + TypeSafe2.OFF.getTypeSafe());
		System.out.println("TypeSafe1 " + TypeSafe.ON);
		
		
		switch (TypeSafe.ON) {
		case ON:
			System.out.println("ON");
			break;
		case OFF:
			System.out.println("OFF");
			break;
		default:
			System.out.println("SUSPEND");
			break;
		}
		
	}
	
	

}
