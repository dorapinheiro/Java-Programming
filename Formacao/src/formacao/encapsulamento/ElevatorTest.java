package formacao.encapsulamento;

public class ElevatorTest {

	public static void main(String[] args) {
		Elevator elevator = new Elevator(true);
		Elevator yourElev = new Elevator();
		System.out.println("Door Open? " + elevator.isDoorOpen());
		System.out.println("Current Floor: " + elevator.getCurrentFloor());
		
		System.out.println("yourElev: Door Open? " + yourElev.isDoorOpen());
		System.out.println("yourElev: Current Floor: " + yourElev.getCurrentFloor());
		
//		elevator.setCurrentFloor(5);
//		elevator.setDoorOpen(true);
//	
//		System.out.println("\n");
//		System.out.println("Door Open? " + elevator.isDoorOpen());
//		System.out.println("Current Floor: " + elevator.getCurrentFloor());

	}

}
