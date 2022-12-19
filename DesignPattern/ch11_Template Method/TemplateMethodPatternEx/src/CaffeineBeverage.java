
public abstract class CaffeineBeverage {
	//final 이용 자식클래스 오버라이드 금지 - (알고리즘 변경 금지)
	//-------------템플릿 메소드 패턴 부분------------------------------
	final void prepareRecipe() { 
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	//------------------------------------------------------------------
	//하위 클래스에서 다르게 구현 (세부 뭘 우려내는지, 뭘 추가하는지)
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("물 끓이는 중..");
	}
	void pourInCup() {
		System.out.println("컵에 따르는 중..");
	}
}
