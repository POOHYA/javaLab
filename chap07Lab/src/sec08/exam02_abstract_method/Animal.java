package sec08.exam02_abstract_method;

public abstract class Animal {
	
	//필드
	public String kind;

	//생성자
	
	//일반메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드
	public abstract void sound();
}

