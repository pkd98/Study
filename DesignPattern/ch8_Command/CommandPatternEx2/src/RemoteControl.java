import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	
	List<Command> slot = new ArrayList<Command>(); //슬롯 리스트 선언
	
	public RemoteControl() {}
	
	//슬롯을 가지고 제어할 명령을 설정하는 메소드
	//리모컨 버튼의 기능을 바꾸고 싶다면 이 메소드를 변경
	public void setCommand(Command command, int index) {
		slot.add(index, command); //해당 슬롯에 커맨드를 할당해준다.
	}
	//버튼 눌렸을 경우 호출.
	//현재 슬롯에 연결된 커맨드 객체의 execute() 메소드만 호출하면 된다.
	public void buttonWasPressed(int index) {
		slot.get(index).execute();
	}
}