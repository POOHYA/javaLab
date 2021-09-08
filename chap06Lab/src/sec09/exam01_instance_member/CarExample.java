package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("푸르쉐");
		Car yourCar = new Car("소나타");
		
		myCar.model = "제네시스"; //인스턴트 필드
		myCar.run();
		yourCar.run();
	}

}
