
public class Starbucks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 커피 에스프레소 주문
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); //모카로 데코레이팅 (다크로스트에 모카 추가)
		beverage2 = new Mocha(beverage2); //모카x2 추가
		beverage2 = new Whip(beverage2); //휘핑크림 추가
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	
		Beverage beverage3 = new HouseBlend();
		beverage3 = new SoyMilk(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		//데코레이터 패턴 이용 다양한 기능(객체)들이 새롭게 추가되는 환경이 많을 때 효율적으로 추가 가능
		//추가되는 기능이 많은경우 데코레이터 패턴 사용
	}

}
