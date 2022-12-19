//기본 기능 구현 에스프레소 클래스 (ConcreteComponent)
public class Espresso extends Beverage {
	public Espresso() {//생성자
		description = "에스프레소"; //Beverage에 선언한 description 변수값 설정
	}
	public double cost() {
		return 1.99; //에스프레소 가격 리턴
	}
}
