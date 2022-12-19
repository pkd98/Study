
public class BallMachineTest {

	//final static int SOLD_OUT = 0; 
	//final static int NO_COIN = 1; 
	//final static int HAS_COIN = 2; 
	//final static int SOLD = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//볼을 5개 가지고 있는 BallMachine을 생성 
		BallMachine ballMachine = new BallMachine(5);
		
		System.out.println(ballMachine.toString());
		
		ballMachine.insertCoin();
		ballMachine.turnCrank();
		
		System.out.println(ballMachine.toString());
		
		ballMachine.insertCoin();
		ballMachine.ejectCoin();
		ballMachine.turnCrank();
		
		System.out.println(ballMachine.toString());
		
	}

}
