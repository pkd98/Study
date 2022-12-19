
public class Main {
	public static void main(String[] args) {
		
		News news = new News();
		Subscriber1 subscriber1 = new Subscriber1("김철수");
		Subscriber1 subscriber2 = new Subscriber1("김영희");

		news.attach(subscriber1); //해당 구독자 옵저버 등록
		news.attach(subscriber2);
		//뉴스 내용
		String news_contents = "러-우 관련 뉴스";
		//뉴스를 구독자들에 알림
		news.notifyObservers(news_contents);
		//해당 구독자 옵저버 해지
		System.out.println("-------------------------------------------------");
		news.detach(subscriber1);
		news.notifyObservers(news_contents);
	}
}

