
public class Client {
	public static void main(String[] args) {
		FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
		//factoryOfComputerFactory.createComputer("LG");
		factoryOfComputerFactory.createComputer("Samsung");
	}
}
// 구성품이 제조사별로 일정하므로 추상팩토리 패턴 이용 관련된 객체들을 한번에 캡슐화해서 팩토리로 만들고, 일관되게 객체를 생성함.