package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("Ǫ����");
		Car yourCar = new Car("�ҳ�Ÿ");
		
		myCar.model = "���׽ý�"; //�ν���Ʈ �ʵ�
		myCar.run();
		yourCar.run();
	}

}
