//커맨드 패턴에서 클라이언트에 해당하는 부분
public class RemoteControlTest {
	public static void main(String[] args) {
		//remote 변수는 Invoker 역할
		//필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		TV tv = new TV();
		//커맨드 객체를 생성하고 리시버를 전달
		LightOnCommand lighton = new LightOnCommand(light);
		LightOffCommand lightoff = new LightOffCommand(light);
		TVOnCommand tvon = new TVOnCommand(tv);
		TVOffCommand tvoff = new TVOffCommand(tv);
		
		//커맨드 객체를 인보커에게 전달
		remote.setCommand(lighton,0);
		remote.setCommand(lightoff, 1);
		remote.setCommand(tvon,2);
		remote.setCommand(tvoff,3);
		//실제 리모컨 버튼을 누름
		remote.buttonWasPressed(0);
		remote.buttonWasPressed(1);
		remote.buttonWasPressed(2);
		remote.buttonWasPressed(3);
	}
}

