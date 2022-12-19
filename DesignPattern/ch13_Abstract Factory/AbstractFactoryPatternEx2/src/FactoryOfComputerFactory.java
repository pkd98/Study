
public class FactoryOfComputerFactory { //ComputerFactory와 같은 역할.
	public void createComputer(String type) {//어떤 제조사 컴퓨터 객체를 만들지 결정. (각 부품X)
		ComputerFactory cFactory = null;
		switch(type) {
		case "LG":
			cFactory = new LGComputerFactory();
			break;
			
		case "Samsung":
			cFactory = new SamsungComputerFactory();
			break;
		}
	cFactory.createKeyboard();
	cFactory.createMouse();
	System.out.println("----" + type + " 컴퓨터 완성 ----");
	}
} //컴퓨터 타입만 결정되면 한번에 하위 부품까지 생성

