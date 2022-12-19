
public class ComputerFactory {
	public void createComputer(String type) {
		KeyboardFactory kFactory = new KeyboardFactory();//팩토리 객체 생성
		MouseFactory mFactory = new MouseFactory();
		
		kFactory.createKeyboard(type); //각 타입에 맞는 하위 객체 생성
		mFactory.createMouse(type);
		
		System.out.println("----" + type + " 컴퓨터 완성 ----");

	}
}
