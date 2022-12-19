public class Door {
	
	private DoorStatus doorStatus;
	public Door() {
		doorStatus = DoorStatus.CLOSED;
	}
	public void close() {
		doorStatus = DoorStatus.CLOSED;
	}
	public void open() {
		doorStatus = DoorStatus.OPENED;
	}
	
	public DoorStatus getDoorStatus() {
		return this.doorStatus;
	}
	public void setDoorStatus(DoorStatus doorStatus) {
		this.doorStatus = doorStatus;
	}
}
