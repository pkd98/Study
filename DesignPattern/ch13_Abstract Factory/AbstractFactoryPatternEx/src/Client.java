
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerFactory cFactory = new ComputerFactory();
		//cFactory.createComputer("Samsung");
		cFactory.createComputer("LG");

	}
}
//부품 추가될 때마다 팩토리도 만들어야하므로, 코드의 지속적 수정 발생 (OCP 위반)
