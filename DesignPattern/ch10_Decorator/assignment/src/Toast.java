
public abstract class Toast {
	StringBuffer name = new StringBuffer();
	int kcal;
	
	public Toast() {}
	
	public void serve() {
		System.out.println("주문한 토스트 : " + name.toString() + " 토스트");
		System.out.println("칼로리 : "+kcal+"Kcal\n");
	}
	
	public StringBuffer getName() {
		return this.name;
	}
	
	public int getKcal() {
		return this.kcal;
	}
	
	public void addTopping(ToppingDecorator topping) {
		this.addKcal(topping.Kcal());
		this.addName(topping.Name());
	}
	
	public void addName(String name) {
		this.name.insert(0,name);
	}
	
	public void addKcal(int kcal) {
		this.kcal += kcal;
	}
}
