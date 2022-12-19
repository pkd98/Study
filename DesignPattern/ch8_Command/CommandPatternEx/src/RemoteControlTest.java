
public class RemoteControlTest {
	
	//커맨드 패턴에서 클라이언트에 해당하는 부분
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remote 변수는 Invoke 역할
		//필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		
		//커맨드 객체를 생성하고 리시버를 전달
		LightOnCommand lighton = new LightOnCommand(light);
		
		//커맨드 객체를 인보커에게 전달
		remote.setCommand(lighton);
		//실제 리모컨 버튼을 누름
		remote.buttonWasPressed();
		
	}

}
