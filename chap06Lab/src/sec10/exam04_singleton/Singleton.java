package sec10.exam04_singleton;

public class Singleton {
	//�����ʵ�
	private static Singleton singleton = new Singleton();
	
	//����Ʈ������
	private Singleton( ) {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
