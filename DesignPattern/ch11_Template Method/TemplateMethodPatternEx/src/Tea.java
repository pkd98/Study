
public class Tea extends CaffeineBeverage {
	
	public void brew() {
		System.out.println("찻잎을 우려내는 중..");
	}
	public void addCondiments() {
		System.out.println("레몬을 추가하는 중..");
	}
}


//// 홍차를 우려내는 메소드
//void prepareRecipe() {
//	boilWater(); // 물 끓이는 메소드
//	steepTeaBag(); // 홍차를 우려내는 메소드
//	pourInCup(); // 홍차를 컵에 따르는 메소드
//	addLemon(); // 레몬을 추가하는 메소드
//}
//
//
//// Coffee 클래스와 코드가 중복되는 부분
//// 공통된 부분을 추상화하여 중복 줄이기
//public void boilWater() {
//	System.out.println("물 끓이는 중..");
//}
//public void pourInCup() { 
//	System.out.println("컵에 따르는 중..");
//}
//
//// 홍차 전용 메소드
//public void steepTeaBag() {
//	System.out.println("찻잎을 우려내는 중..");
//}
//
//public void addLemon() {
//	System.out.println("레몬을 추가하는 중..");
//}