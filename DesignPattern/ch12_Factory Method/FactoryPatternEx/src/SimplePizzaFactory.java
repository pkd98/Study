
public class SimplePizzaFactory {
	//피자 인스턴스를 생성하고 해당 객체를 리턴하는 메소드
	public Pizza createPizza(String pizza_type) {
		Pizza pizza = null;
		if (pizza_type.equals("cheese")) {
			pizza = new CheesePizza();
		}
		else if (pizza_type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		}
	return pizza;
	}
}
