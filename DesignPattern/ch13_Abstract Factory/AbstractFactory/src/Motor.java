
public abstract class Motor { // HyundaiMotor와 LGMotor에 공통적인 기능을 구현하는 클래스
private MotorStatus motorStatus;
private Door door;
public Motor() {
motorStatus = MotorStatus.STOPPED ;
}
public MotorStatus getMotorStatus() {
return motorStatus;
}
protected void setMotorStatus(MotorStatus motorStatus) {
this.motorStatus = motorStatus;
}
public void setDoor(Door door) {
this.door = door;
}
public void move(Direction direction) {
MotorStatus motorStatus = getMotorStatus();
if (motorStatus == MotorStatus.MOVING) {
return;
}
if (door.getDoorStatus() == DoorStatus.OPENED) {
door.doClose();
}
moveMotor(direction);
setMotorStatus(MotorStatus.MOVING);
}
public void stop() {
motorStatus = MotorStatus.STOPPED;
}
protected abstract void moveMotor(Direction direction);
}