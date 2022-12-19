//1. 고전적인 싱글톤 패턴의 구현 법
public class Singleton {
	private static Singleton uniqueInstance; //Singleton 특성을 부여하기 위한 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수 선언
	
	//기타 인스턴스 변수 선언부
	// ...
	
	private Singleton() { //생성자를 private로 선언했기 때문에 Singleton 클래스 내부에서만 클래스의 인스턴스를 만들 수 있음.
		
		
	}
	
	//getInstance() 메소드는 싱글턴 클래스의 인스턴스를 만들어서 외부에 리턴하여 그 인스턴스를 제공해주는 메소드
	//Singleton 객체 자체가 생성되기 전에도 외부에서 접근할 수 있도록 정적변수로 선언한다.
	//geInstance에 synchronized 키워드를 추가하면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다려야 한다.
	//즉, 2개의 스레드가 이 메소드를 동시에 실행하는 일은 일어나지 않는다.
	//그러나 동기화시 속도가 느려지는 문제점이 발생 (성능저하, 병목현상)
	//동기화가 꼭 필요한 부분은 메소드가 처음 시작되어 uniqueInstance에 값이 처음 할당되는 부분이다.
	//그 외에는 불필요한 오버헤드가 증가하게된다.
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) { //인스턴스가 생성되지 않았다면
			uniqueInstance = new Singleton(); //새롭게 uniqueInstance 생성
			//(인스턴스가 필요한 상황이 되기 전까지 인스턴스를 생성하지 않음 -> 게으른 인스턴스 생성(Lazy instantiation)
		}
		return uniqueInstance; //존재하는 인스턴스를 리턴
	}
	//기타 메소드 선언부 (Singleton 역시 보통의 클래스 이므로 클래스 내부에도 다른 인스턴스 변수나 메소드를 가질 수 있다.
	// ...
}

//(멀티스레드 상황에서 uniqueInstance 객체가 여러 개 생성될 수 있는 문제가 발생)
//getInstance()메소드에 인스턴스가 생성되기도 전에 여러 스레드가 동시에 접근하는경우,
//uniqueInstance가 동시에 null로 인식하여 서로다른 인스턴스를 생성하고 여러개의 인스턴스를 가지게 되어 문제가 발생한다.
//-> 여러 스레드가 접근해도 한번만 getInstace()메소드를 접근하도록 수정해야한다.
//synchronized 를 이용하여 한번에 한스레드만 메소드에 접근할 수 있도록 강제할 수 있다.



//2. 선언과 동시에 인스턴스 생성을 통한 synchronized 사용하지 않고 개선
public class Singleton {
	//정적 초기화 부분에서 Singleton 인스턴스를 생성한다.
	private static Singleton uniqueInstance = new Singleton(); 
	
	private Singleton() { //생성자를 private로 선언했기 때문에 Singleton 클래스 내부에서만 클래스의 인스턴스를 만들 수 있음.
		
		
	}
	
	public static Singleton getInstance() {

		return uniqueInstance;
	}
}
//JVM이 클래스가 로딩이 될 때 싱글턴의 하나뿐인 인스턴스 uniqueInstace를 생성해준다.
//uniqueInstance 생성되기 전까지 그어떤 스레드도 정적변수에 접근할 수 없다.
//(컴파일 시 정적메모리에 할당되므로 사용하는 데 큰 문제가 없다.)


//3. DCL : Double-checked Locking 을 이용한 getInstance()에서 동기화되는 부분을 줄일 수 있다.
//인스턴스가 생성되어 있는지 확인한 후, 생성되어 있지 않았을 때만 동기화 할 수 있다. (문제 해결 및 속도 향상)
//DCL 이용시 처음에만 동기화 하고 나중에는 동기화 하지 않아도 됨.
//*** Java 1.4 이전 버전에서는 사용 불가 ***
public class Singleton {
	//volatile 키워드 사용하면 멀티스레딩을 사용하더라도 uniqueInstance 변수가 Singleton 인스턴스로 초기화되는 과정이 올바르게 진행된다.
	private volatile static Singleton uniqueInstance; 
	
	private Singleton() { //생성자를 private로 선언했기 때문에 Singleton 클래스 내부에서만 클래스의 인스턴스를 만들 수 있음.
	}
	
	public static Singleton getInstance() {
		//DCL 이용하여 인스턴스가 있는지 확인하고 없으면 동기화된 구문으로 이동
		if(uniqueInstance == null) {
			synchronized (Singleton.class) { //Singleton 클래스를 동기화하게 된다.
				if (uniqueInstance == null) { //동기화된 구문 안에서 다시한번 uniqueInstance의 null을 체크
					uniqueInstance = new Singleton(); //인스턴스 생성
				}
			}
		}
		return uniqueInstance;
	}
}


//5주차 질문
//1. 모든 메소드와 변수가 static으로 선언한 클래스를 만들어도 되지 않나?
// -> 필요한 내용이 클래스에 모두 들어있고 복잡한 초기화가 필요 없는 경우에만 사용
//    그 외에는 비효율. 찾아내기 어려운 문제 발생. 되도록 지양

//2. 느슨한 결합 - 싱글턴은 느슨한 결합 원칙에 위배되지 않나?
// -> 싱글턴 패턴의 문제점으로 종종 제기되는 내용. 싱글턴을 바꾸면 연결된 모든 객체도 바꿔야 될 가능성 높음

//정리
//멀티스레딩 환경에서 전통적 형태 싱글턴 구현은 문제 발생
//1. 정적 변수 활용했고, 정적 변수 선언시에 값을 할당해서 활용
//2. 복수개의 스레딩이 접근하는 부분을 synchronized 키워드 활용하여 해결
//3. DCL (Double-checked Locking) 방식을 통해 동기화되는 부분을 줄임. (동기화가 필요한 부분만 동기화)







