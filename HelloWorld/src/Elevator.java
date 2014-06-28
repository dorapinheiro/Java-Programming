
public class Elevator {

	private boolean doorOpen=false;
	private int currentFloor = 1;
	private final int TOP_FLOOR =10;
	private final int MIN_FLOOR=1;
	

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
