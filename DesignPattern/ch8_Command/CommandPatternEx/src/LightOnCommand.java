//조명을 켤 때 필요한 커맨드 클래스
public class LightOnCommand implements Command{ //커맨드 인터페이스를 구현
	
	Light light;
	//생성자에 커맨드 객체로 제어할 특정 조명의 객체가 전달됨
	public LightOnCommand(Light light) { 
		this.light = light; 
	}
	
	//execute 메소드는 리시버 객체, 즉 light객체에 있는 on 메소드를 호출
	public void execute() {
		light.on();
	}
}
