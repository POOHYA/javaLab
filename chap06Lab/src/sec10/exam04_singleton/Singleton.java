package sec10.exam04_singleton;

public class Singleton {
	//정적필드
	private static Singleton singleton = new Singleton();
	
	//디폴트생성자
	private Singleton( ) {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
