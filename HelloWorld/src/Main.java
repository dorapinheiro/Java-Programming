
public class Main {

	public static void main(String[] args) {

		Elevator elevator = new Elevator();
		System.out.println("Door Open? " + elevator.isDoorOpen());
		System.out.println("Current Floor: " + elevator.getCurrentFloor());
		
		elevator.setCurrentFloor(5);
		elevator.setDoorOpen(true);
	
		System.out.println("\n");
		System.out.println("Door Open? " + elevator.isDoorOpen());
		System.out.println("Current Floor: " + elevator.getCurrentFloor());
		
	}
}





