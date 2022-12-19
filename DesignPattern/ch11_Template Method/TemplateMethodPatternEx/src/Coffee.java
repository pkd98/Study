
public class Coffee extends CaffeineBeverage {
	
	public void brew() {
		System.out.println("커피를 우려내는 중..");
	}
	public void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중..");
	}
}



//// 커피를 만드는 법을 정의하는 메소드 (커피만드는 단계- 알고리즘 절차를 정의)
//void prepareRecipe() {
//	boilWater(); // 물 끓이는 메소드
//	brewCoffeeGrinds(); // 커피 우려내는 메소드
//	pourInCup(); // 커피를 컵에 따르는 메소드
//	addSugarAndMilk(); // 설탕과 우유를 추가하는 메소드
//}
//
//public void boilWater() {
//	System.out.println("물 끓이는 중..");
//}
//public void brewCoffeeGrinds() {
//	System.out.println("필터로 커피를 우려내는 중..");
//}
//public void pourInCup() { 
//	System.out.println("컵에 따르는 중..");
//}
//public void addSugarAndMilk() {
//	System.out.println("설탕과 우유를 추가하는 중..");
//}