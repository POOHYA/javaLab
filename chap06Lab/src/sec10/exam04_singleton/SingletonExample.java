package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		//	private �̱��� ���ٹ��
		//	�ν���Ʈ�� �����ϸ� �ڵ��� ������ ����
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� singleton ��ü�Դϴ�");}
			else {
				System.out.println("�ٸ� singleton ��ü�Դϴ�");}
		
		
	}

}
