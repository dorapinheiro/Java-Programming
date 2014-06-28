package formacao.encapsulamento;

public class Elevator {

	private boolean doorOpen=false;
	private int currentFloor = 1;
	private final int TOP_FLOOR ;
	private final int MIN_FLOOR;
	

	public Elevator() {
		TOP_FLOOR =10;
		MIN_FLOOR=1;
	}
	
	public Elevator(boolean doorOpen)
	{
		this();
		this.doorOpen=doorOpen;
		this.currentFloor=MIN_FLOOR;
	}
	
	public Elevator(boolean doorOpen, int currentFloor)
	{
		// Este encadeamen
		this(doorOpen);
		this.currentFloor=currentFloor;
	}
		
	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void setDoorOpen(boolean doorOpen) {
		this.doorOpen = doorOpen;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getTOP_FLOOR() {
		return TOP_FLOOR;
	}

	public int getMIN_FLOOR() {
		return MIN_FLOOR;
	}
}
