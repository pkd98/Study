//첨가물(재료)를 확장하는 클래스 - 모카
public class Mocha extends CondimentDecorator{
	//인스턴스 변수를 감싸고자 하는 생성자
	public Mocha(Beverage beverage) { //감싸고자하는 음료를 저장하는 인스턴스 변수
		this.beverage = beverage; 
	}
	//장식(데코레이팅)하는 객체에 대한 설명값에 모카를 더한 값을 리턴
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
	//장식하고 있는 객체의 가격에 모카 가격을 더한 후 리턴
	public double cost() {
		return beverage.cost() + 0.20;
	}
}

