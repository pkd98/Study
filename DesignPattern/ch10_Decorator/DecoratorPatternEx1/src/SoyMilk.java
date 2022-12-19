//첨가물(재료)를 확장하는 클래스 - 두유
public class SoyMilk extends CondimentDecorator {
	
	public SoyMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}
	
	public double cost() {
		return beverage.cost() + 0.15;
	}
}
