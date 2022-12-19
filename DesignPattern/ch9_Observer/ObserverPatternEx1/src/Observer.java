
public class Observer {
	public String subscriber; //뉴스 구독자
	//뉴스를 받는 메소드
	public void receive(String news) {
		//해당 구독자가 뉴스를 받음
		System.out.println(this.subscriber + "에서 뉴스를 받음 : " + news);
	}
}
