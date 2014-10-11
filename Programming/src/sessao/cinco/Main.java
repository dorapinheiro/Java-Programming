package sessao.cinco;

public class Main {
	

	public static void main(String[] args) {
		
		ElectronicDevice ed = new ElectronicDevice("Dell") {
			
			@Override
			public void run() {
				System.out.println("run");
				
			}
		};
		
		ed.run();
		
	
	}
	
	

}
