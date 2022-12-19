import java.util.ArrayList;
import java.util.List;
//구독자 추가/삭제, 구독자들에게 뉴스 전파 기능
public class News {
	//구독자 리스트 선언 (옵저버)
	private List<Observer> observers = new ArrayList<Observer>();

	//1. 옵저버 리스트에 구독자 추가
	public void attach(Observer observer) {
		observers.add(observer);
	}
	//2. 옵저버 리스트에 구독자 제거
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	//3. 옵저버들에게 뉴스를 알림
	public void notifyObservers(String news_contents) {
		for (int i=0; i<observers.size(); i++) {
			Observer o = observers.get(i); //해당 구독자 옵저버 객체
			o.receive(news_contents); //해당 구독자에 뉴스를 알림 (뉴스를 받음)
		}
	}
}
