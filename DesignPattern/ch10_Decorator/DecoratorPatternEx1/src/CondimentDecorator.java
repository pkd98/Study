//커피 첨가물 데코레이터 클래스
//베버리지 객체 들어갈 수 있어야 하므로 확장 상속받음
public abstract class CondimentDecorator extends Beverage {
	//각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 저장
	Beverage beverage;
	//모든 첨가물 데코레이터에 해당 메소드를 새로 구현
	public abstract String getDescription(); 
}
