
public class TVOffCommand implements Command{
	TV tv;
	//생성자에 커맨드 객체로 제어할 특정 조명의 객체가 전달됨
	public TVOffCommand(TV tv) { 
		this.tv = tv;
	}
	//execute 메소드는 리시버 객체, 즉 light객체에 있는 on 메소드를 호출
	public void execute() {
		tv.off();
	}
}
