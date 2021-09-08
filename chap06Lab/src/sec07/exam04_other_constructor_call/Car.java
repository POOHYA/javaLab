package sec07.exam04_other_constructor_call;

public class Car {
	//구성멤버
	//1.필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	//2.생성자
	Car(){}
	// 생성자 오버로딩
	//	this:자기 자신의 객체를 의미
	//	this():자기자신의 객체의 다른 생성자를 호출
	//	super:부모객체
	//	super():부모객체의 생성자
	Car(String model) {
		this(model, null, 0);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//3.메소드
}