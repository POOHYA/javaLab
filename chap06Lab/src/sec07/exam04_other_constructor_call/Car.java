package sec07.exam04_other_constructor_call;

public class Car {
	//�������
	//1.�ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	//2.������
	Car(){}
	// ������ �����ε�
	//	this:�ڱ� �ڽ��� ��ü�� �ǹ�
	//	this():�ڱ��ڽ��� ��ü�� �ٸ� �����ڸ� ȣ��
	//	super:�θ�ü
	//	super():�θ�ü�� ������
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
	//3.�޼ҵ�
}