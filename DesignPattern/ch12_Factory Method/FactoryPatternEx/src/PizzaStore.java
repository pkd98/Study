
public class PizzaStore {
	SimplePizzaFactory factory; //팩토리 객체 생성
	
	//생성자에 팩토리에서 생성된 객체를 인자로 받아 해당 객체를 생성함
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String pizza_type) {
		Pizza pizza; // 피자 객체 만들기
		
		/*
		//변경이 필요한 코드(OCP 불만족)
		// 피자 종류를 바탕으로 올바른 구상 클래스의 인스턴스를 생성하고,
		// pizza 인스턴스 변수에 그 인스턴스를 대입한다.
		// 모든 피자 클래스는 Pizza 인터페이스를 구현한다.
		if (pizza_type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (pizza_type.equals("greek")) {
			pizza = new GreekPizza();
		} else if (pizza_type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (pizza_type.equals("clam")) {
			pizza = new ClamePizza();
		}
		// 객체 생성하는 부분을 따로 클래스로 분리하는 팩토리 메소드 패턴 적용 필요
		*/
		
		// 인스턴스 객체 생성을 팩토리에 위임하여 생성
		pizza = factory.createPizza(pizza_type); //해당 피자 종류의 인스턴스 생성
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
