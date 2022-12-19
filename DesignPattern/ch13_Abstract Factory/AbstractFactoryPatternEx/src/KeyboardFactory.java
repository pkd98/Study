
public class KeyboardFactory {
	//조건에 따른 객체 생성 메소드
	public Keyboard createKeyboard(String type) {
		Keyboard keyboard = null;
		
		switch(type) {
		
		case "LG" :
			keyboard = new LGKeyboard();
			break;
		case "Samsung":
			keyboard = new SamsungKeyboard();
			break;
		}
		
		return keyboard;
	}
}
